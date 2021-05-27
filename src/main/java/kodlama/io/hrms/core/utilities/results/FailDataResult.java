package kodlama.io.hrms.core.utilities.results;

public class FailDataResult<T> extends DataResult<T>{

    public FailDataResult(T data) {
        super(false, data);
    }

    public FailDataResult(String message) {
        super(false, message);
    }

    public FailDataResult() {
        super(false);
    }

    public FailDataResult(String message, T data) {
        super(false, message, data);
    }
}
