package baseball.exception;

import etc.ErrorMessage;

public class InputNotNumberException extends BaseballGameException {

    public InputNotNumberException() {
        super(ErrorMessage.inputNotNumberErrorMessage);
    }
}
