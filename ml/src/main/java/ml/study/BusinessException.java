package ml.study;

/**
 * @author hemingliang-1291
 * @date 2018/5/14 14:21
 */
public class BusinessException extends RuntimeException {

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }
}
