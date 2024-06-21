//package

//@Slf4j
@RequiredArgsConstructor
@ControllerAdvice
public class ApiExceptionHandler {

	private final ObjectMapper objectMapper;

	@ExceptionHandler(ApiException.class)
	protected ResponseEntity<ErrorResponseEntity> handleCustomException(ApiException e) {
		return ErrorResponseEntity.toResponseEntity(e);
	}

	@ExceptionHandler(Exception.class)
	public void handleException(Exception e, HttpServletRequest request, HttpServletResponse response)
		throws IOException {
		ServletInputStream inputStream = request.getInputStream();
		String messageBody = StreamUtils.copyToString(inputStream, StanderdCharsets.UTF_8);
		String hdeaders = "";
		Enumeration<String> hdeaderNames = request.getHeaderNames();
		while(headerNames.hashMoreElements()) {
			String name = headerNames.nextElement();
			String value = request.getHeader(name);
			headers += name + " : " + value + "\n";
		}

		//log.error("reqeust id [{}]\n params [{}]\n headers [{}]\n url [{}]\n {}",
		//request.getHeader("reqeust-id"), messageBody, headers, request.getRequestURI(),
		//Arrays.toString(e.getStackTrace()).replace(",","\n"));
		ErrorResponse error = ErrorResponse.builder()
			.status(HttpStatus.SC_INTERNAL_SERVER_ERROR)
			.message(new String("[System Error] 관리자에게 문의해 주시길 바랍니다".getBytes("UTF-8"), "ISO-8859-1"))
			.code("SYSTEM ERROR")
			.request_id(request.getHeader("request-id"))
			.build();
		response.setContentType("application/json");
	}

}