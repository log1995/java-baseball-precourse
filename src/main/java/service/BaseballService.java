package service;

import domain.Computer;
import domain.User;
import etc.Referee;

public class BaseballService {

    private Computer computer;
    private User user;
    private Referee referee;

    private final static String REGAME_COMMAND = "1";
    private int[] userNums;
    private int[] comNums;

    public BaseballService() {
        this.computer = new Computer();
        this.user = new User();
        this.referee = new Referee();
    }

    public void initBaseballGame(){
        computer.generateRandomNumber();
    }

    public void startBaseballGame() {
        user.setUserNums();
        userNums = user.getUserNums();
        comNums = computer.getComputerNum();
        referee.compareNums(userNums, comNums);
    }

    public boolean askReGame() {
        if(user.askReGame().equals(REGAME_COMMAND))
            return true;
        return false;
    }

    public boolean isThreeStrike() {
        if(referee.strikeCount())
            return false;
        return true;
    }

}
