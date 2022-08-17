package domain;

public class Result {

    private int strikes;
    private int balls;

    public void initBallCount(){
        this.strikes = 0;
        this.balls = 0;
    }

    public void increaseStrike(){
        this.strikes++;
    }

    public void increaseBall(){
        this.balls++;
    }

    public int getStrikes() {
        return this.strikes;
    }

    public int getBalls() {
        return this.balls;
    }

    public boolean isStrikeZero() {
        return this.strikes == 0;
    }

    public boolean isBallZero() {
        return this.balls == 0;
    }

    public boolean isStrikeThree() {
        return this.strikes == 3;
    }

}
