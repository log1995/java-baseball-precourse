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

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public int getBalls() {
        return this.balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

}
