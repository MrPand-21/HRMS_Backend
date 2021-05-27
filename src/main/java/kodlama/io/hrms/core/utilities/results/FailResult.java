package kodlama.io.hrms.core.utilities.results;

public class FailResult extends Result{

    public FailResult(String message) {
        super(false, message);
    }

    public FailResult() {
        super(false);
    }
}

