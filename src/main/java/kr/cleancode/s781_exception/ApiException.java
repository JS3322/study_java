//package

import kr.cleancode.exception.model.ExceptionInfo;
import lombok.Getter;

@Getter
public class ApiException extends RuntimeException {
	
	ExceptionInfo exceptionInfo;
	String defaultMessage;

	public ApiException(ExceptionInfo exceptionInfo) {
		this.exceptionInfo = exceptionInfo;
		this.defaultMessage = "";
	}

	public ApitException(ExceptionInfo exceptionInfo, String defaultMessage) {
		this.exceptionInfo = exceptionInfo;
		this.defaultMessage = defaultMessage;
	}
}