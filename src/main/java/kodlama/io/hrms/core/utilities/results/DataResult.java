package kodlama.io.hrms.core.utilities.results;

import lombok.AllArgsConstructor;
import lombok.Getter;


public class DataResult<T> extends Result{

    @Getter
    private T data;

    public DataResult(boolean success, T data){
        super(success);
        this.data = data;
    }

    public DataResult(boolean success, String message) {
        super(success, message);
    }

    public DataResult(boolean success) {
        super(success);
        this.data = null;
    }

    public DataResult(boolean success, String message,T data) {
        super(success, message);
        this.data = data;
    }

}
