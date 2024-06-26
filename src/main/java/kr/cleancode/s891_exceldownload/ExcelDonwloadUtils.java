@Component
@RequiredArgsConstructor
public final class ExcelDownloadUtils {
	private static final int MAX_ROW = 10000;
	private final CommonUtils commonUtils;

	public void getExcelDownload(List<Document> data, String fileName, HttpServletResponse response, ResourceSearchVO vo) {
		try(SXSSFWorkbook workbook = new SXSSFWorkbook()) {
			//중복제거 한 productList
			List<String> filterList = data.stream().map(productDocument -> ((Document) productDocument.get("metadata")).getString("productName")).distinct().toList();
			//productCode 마다 로직
			List<Document> outputData = data;
			filterList.forEach(info -> {List<Document> productList = new ArrayList<>();
				outputData.gorEach(val -> {Document metaVal = (Document) val.get("metadata");
					if(info.equals(metaVal.get("productName"))) {
						productList.add(val);
					}
				});

				try {
					getWorkBook(workbook, 0, findHeaderNames(productList, vo), productList, productList.size(), vo.getDataFieldInfo());
				}catch (Exception e) {
					throw new RuntimeException(e);
			});

			response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=UTF-8");
			response.setHeader("Content-Disposition", "attachment; filename="+filename+".xlsx");

			ServletOutputStream outputStream = response.getOutputStream();
			workbook.write(outputStream);
			workbook.close();
			outputStream.flush();
			outputStream.close();
		}

	}

}