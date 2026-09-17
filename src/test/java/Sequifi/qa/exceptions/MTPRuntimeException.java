package Sequifi.qa.exceptions;

public class MTPRuntimeException extends MTPException {
    public MTPRuntimeException() {
    }

    public MTPRuntimeException(String message) {
        super(message);
    }

    public MTPRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MTPRuntimeException(Throwable cause) {
        super(cause);
    }

    public MTPRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
