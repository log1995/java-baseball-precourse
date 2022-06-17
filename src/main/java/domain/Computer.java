package domain;

import etc.RandomNumberGenerator;

public class Computer {

    private RandomNumberGenerator randomNumberGenerator;
    private int[] computerNum;

    public Computer() {
        this.randomNumberGenerator = new RandomNumberGenerator();
    }

    public void generateRandomNumber(){
        computerNum = randomNumberGenerator.generate();
    }

    public int[] getComputerNum(){
        return this.computerNum;
    }

}
