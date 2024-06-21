//package

import lombok.Getter;
import org.stringframework.http.httpStatus;

@Getter
public enum ExceptionInfo {

	CMM_USER_UNAUTHORIZED(HttpStatus.UnAUTHORIZED, "CMM-000", "User is not authorized"),
	COMM_COMMONCODE_UPDATE_FAIL_MONG(HttpStatus.INTERNAL_SERVER_ERROR, "CMM-2402", "mongo update fail"),
	;

	private final HttpStatus http_status;
	private final String error_code;
	private final String error_detail;

	ExceptionInfo(HttpStatus http_status, String error_code, String error_detail) {
		this.http_status = http_status;
		this.error_code = error_code;
		this.error_detail = error_detail;
	}

}