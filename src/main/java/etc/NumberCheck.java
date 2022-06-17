package etc;

import domain.Result;
import io.Output;


public class NumberCheck {

    private Result result;
    private Output output;


    public NumberCheck() {
        this.result = new Result();
        this.output = new Output();
    }

    public void compareNums(int[] userNums, int[] comNums) {
        result.initBallCount();
        for(int i = 0; i < 3; i++)
            checkBallCount(userNums[i], i, comNums);
        printCount();
    }

    public void checkBallCount(int userNum, int i, int[] comNums) {
        for(int j= 0; j < 3; j++){
            if(userNum == comNums[j] && i == j)
                result.increaseStrike();
            else if(userNum == comNums[j])
                result.increaseBall();
        }
    }

    public void printCount() {
        if(result.getBalls() == 0 && result.getStrikes() == 0)
            output.printNothing();
        else if(result.getStrikes() == 3) {
            output.printStrikeCount(result.getStrikes());
            output.gameEndMessage();
        }
        else if(result.getBalls() != 0 && result.getStrikes() == 0)
            output.printBallCount(result.getBalls());
        else if(result.getBalls() == 0 && result.getStrikes() != 0)
            output.printStrikeCount(result.getStrikes());
        else
            output.printBallAndStrikeCount(result.getBalls(), result.getStrikes());

    }
    public boolean strikeCount() {
        if(result.getStrikes() == 3)
            return true;
        return false;
    }
}
