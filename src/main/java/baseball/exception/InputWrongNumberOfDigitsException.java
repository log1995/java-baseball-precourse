package baseball.exception;

import etc.ErrorMessage;

public class InputWrongNumberOfDigitsException extends BaseballGameException{

    public InputWrongNumberOfDigitsException() {
        super(ErrorMessage.inputWrongNumberOfDigitsErrorMessage);
    }

}
