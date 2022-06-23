package domain;

import io.ConsoleInput;
import io.Input;
import io.Output;

public class User {

    private Input input;
    private Output output;
    private int[] userNums;

    public User() {
        this.input = new ConsoleInput();
        this.output = new Output();
    }

    public int[] getUserNums(){
        return this.userNums;
    }

    public void setUserNums(){
        output.printStartMessage();
        userNums = input.inputUserNum();
    }

    public String askReGame(){
        output.printReGameMessage();
        return input.inputReGameNum();
    }


}
