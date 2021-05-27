package kodlama.io.hrms.core.utilities.results;

public class SuccessResult extends Result{

    public SuccessResult(String message) {
        super(true, message);
    }

    public SuccessResult() {
        super(true);
    }
}
