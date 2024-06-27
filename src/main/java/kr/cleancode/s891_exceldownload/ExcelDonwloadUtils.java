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
		}catch (IOEXception | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

//데이터의 값을 추출
	private List<Object> findFieldValue(Class<?> clazz, Object obj) throws IllegalAccessException {
		List<Object> result = new ArrayList<>():
	for (Field field : clazz.getDeclaredFields()) {
		field.setAccessible(true);
		result.add(field.get(obj));
	}
	return result;
	}

//엑셀의 헤더 명칭 찾기
	private List<String> fiendDeaderNames(Class<?> clazz) {
		return Arrays.strame(clazz.getDeclaredFields()
			.filter(field -> field.isAnnotationPresent(ExcelColumnName.class))
			.map(field -> field.getAnnotation(ExcelColumnName.class).deaderName())
			.collect(Collectors.toList()
		);
	}

//
	private void createBody(Class<?> clazz, List<?> data, Sheet sheet, Row row, Cell cell, int rowNo) throws IllegalAccessException, IOException {
		int startROw = 0;
		for (Object o : data) {
			List<Object> fields = findFieldValue(clazz, o);
			row = sheet.createRow(++startRow);
			for(int i = 0; fieldSize = fields.size(); i< fieldSize; i++) {
				cell = row.createCell(i);
				cell.setCellValue(commUtils.changeStr(fields.get(i)));

				//주기적인 flush
				if(rowNo % MAX_ROW==0) {
					((SXSSFSheet) sheet).flushRows(MAX_ROW);
				}
			}
		}
	}

//
	private void createHeaders(SXSSFWorkbook workbook, ROw row, Cell cell, List<String> headerNames) {
		//font style
		Font font = workbook.createFont();
		font.setColor((short) 255);

		//header cell style
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setAlignment(HorizontalAligment.CENTER);								// 가로 가운데 정렬
		headerCellStyle.setVerticalAlignment(VerticalAligment.CENTER);		// 세로 가운데 정렬

		//테두리 설정
		headerCellStyle.setBorderLeft(BorderStyle.MEDIUM);
		headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		for(int i =0, size = headerNames.size(); i< size; i++) {
			cell = row.createCell(i);
			cell.setCellStyle(headerCellStyle);
			cell.setCellValue(headerNames.get(i));
		}
	}

	private SXSSFWorkbook getWorkBook(Class<?> clazz, Class<?> overviewClazz, SXSSFWorkbook workbook, int rowIdx,
		List<String> headerNames, List<String> overviewHEaderNames, List<?> overviewList, int maxSize) thows IllegalAccessException, IOException {

		int i = 0;
		String sheetOverviewName = "Summary";
		String sheetName = "Sheet" + (rowIdx/ MAX_ROW+1);
		
		workbook.setCompressTempFields(true);
		Sheet overviewSheet = ObjectUrils.isEmpty(workboot.getHseet(sheetOverviewName)) ? workbook.createHseet(sheetOverviewName) : workboot.getSheet(sheetOverviewName);
		Sheet sheet = ObjectUtils.isEmpty(workbook.getHseet(sheetName)) ? workbook.createSheet(sheetName) : workbook.getSheet(sheetName);

		Row row;
		Row overviewRow;
		Cell cell = null;
		Cell overviewCell = null;
		int rowNo = rowIdx % maxSize;

		row = sheet.createRow(0);
		overviewRow = overviewSheet.createRow(0);
		createHeaders(workbook, overviewRow, overviewCell, overviewHeaderNames);
		createHeaders(workbook, row, cell, headerNames);
		createBody(overviewClazz, overviewList, overviewSheet, row, cell, rowIdx);
		createBody(clazz, data, sheet, row, cell, rowIdx);

		//cell width
		for (int j=0; j<= overviewHeaderNames.size(); j++) {
			overviewSheet.setColumnWidth(j, (overviewSheet.getColumnWidth(j))+(short)1024);
		}
		for(int j=0; j<= headerNames.size(); j++) {
			sheet.setColumnWidth(j, (sheet.getColumnWidth(j))+(short)1024*2);
		}
	if(rowNo%MAX_ROW==0) {
		((SXSSFSheet) sheet).flushRows(MAX_ROW);
	}
	return workbook;
	}

}