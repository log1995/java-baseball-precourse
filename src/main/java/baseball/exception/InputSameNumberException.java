package baseball.exception;

import etc.ErrorMessage;

public class InputSameNumberException extends BaseballGameException {

    public InputSameNumberException() {
        super(ErrorMessage.inputSameNumberErrorMessage);
    }

}
