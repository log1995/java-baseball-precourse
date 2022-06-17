package domain;

import io.Input;

public class User {

    private Input input;
    private int[] userNums;

    public User() {
        this.input = new Input();
    }

    public int[] getUserNums(){
        return this.userNums;
    }

    public void setUserNums(){
        userNums = input.inputNum();
    }

    public String askReGame(){
        return input.reGame();
    }


}
