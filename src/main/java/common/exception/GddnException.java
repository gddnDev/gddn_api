package common.exception;


/**
 * 工地大脑异常
 */
public class GddnException extends RuntimeException {
    public GddnException(String message, Throwable e) {
        super(message, e);
    }

    public GddnException(String message) {
        super(message);
    }
}
