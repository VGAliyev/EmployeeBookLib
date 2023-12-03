package pro.sky.course2.v.aliyev.employeebookstreams.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeNotValidateException extends RuntimeException {
    public EmployeeNotValidateException() {
        super();
    }

    public EmployeeNotValidateException(String message) {
        super(message);
    }

    public EmployeeNotValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeNotValidateException(Throwable cause) {
        super(cause);
    }

    public EmployeeNotValidateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
