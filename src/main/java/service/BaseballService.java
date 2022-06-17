package service;

import domain.Computer;
import domain.User;
import etc.NumberCheck;

public class BaseballService {

    private Computer computer;
    private User user;
    private NumberCheck numberCheck;

    private final static String REGAME = "1";
    private int[] userNums;
    private int[] comNums;

    public BaseballService() {
        this.computer = new Computer();
        this.user = new User();
        this.numberCheck = new NumberCheck();
    }

    public void initBaseballGame(){
        computer.generateRandomNumber();
    }

    public void startBaseballGame() {
        user.setUserNums();
        userNums = user.getUserNums();
        comNums = computer.getComputerNum();
        numberCheck.compareNums(userNums, comNums);
    }

    public boolean askReGame() {
        if(user.askReGame().equals(REGAME))
            return true;
        return false;
    }

    public boolean isThreeStrike() {
        if(numberCheck.strikeCount())
            return false;
        return true;
    }

}
