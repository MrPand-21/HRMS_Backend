package kodlama.io.hrms.core.utilities.results;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Result {

    @Getter
    private boolean success;

    @Getter
    private String message;

    public Result(boolean success) {
        this.success = success;
        this.message = "No Message";
    }
}
