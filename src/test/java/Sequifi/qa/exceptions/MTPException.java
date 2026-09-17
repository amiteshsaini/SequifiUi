package Sequifi.qa.exceptions;

public class MTPException extends Exception {
    private static final long serialVersionUID = -4868711699879688188L;

    public MTPException() {
    }

    public MTPException(String message) {
        super(message);
    }

    public MTPException(String message, Throwable cause) {
        super(message, cause);
    }

    public MTPException(Throwable cause) {
        super(cause);
    }

    public MTPException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
