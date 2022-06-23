package etc;

import domain.Result;
import io.Output;


public class Referee {

    private Result result;
    private Output output;


    public Referee() {
        this.result = new Result();
        this.output = new Output();
    }

    public void compareNums(int[] userNums, int[] comNums) {
        result.initBallCount();
        for(int i = 0; i < 3; i++)
            checkBallCount(userNums[i], i, comNums);
        printCount();
    }

    private void checkBallCount(int userNum, int i, int[] comNums) {
        for(int j= 0; j < 3; j++){
            if(userNum == comNums[j] && i == j)
                result.increaseStrike();
            else if(userNum == comNums[j])
                result.increaseBall();
        }
    }

    private void printCount() {
        if(result.isBallZero() && result.isStrikeZero())
            output.printNothing();
        else if(result.isStrikeThree()) {
            output.printStrikeCount(result.getStrikes());
            output.printGameEndMessage();
        }
        else if(!result.isBallZero() && result.isStrikeZero())
            output.printBallCount(result.getBalls());
        else if(result.isBallZero() && !result.isStrikeZero())
            output.printStrikeCount(result.getStrikes());
        else
            output.printBallAndStrikeCount(result.getBalls(), result.getStrikes());

    }
    public boolean strikeCount() {
        if(result.isStrikeThree())
            return true;
        return false;
    }
}
