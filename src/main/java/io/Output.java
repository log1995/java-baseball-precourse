package io;

public class Output {

    public void printStartMessage(){
        System.out.print("숫자를 입력해 주세요 : ");
    }

    public void printReGameMessage(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void printBallAndStrikeCount(int ball, int strike){
        System.out.println(ball + "볼 " + strike + "스트라이크");
    }

    public void printStrikeCount(int strike){
        System.out.println(strike + "스트라이크");
    }

    public void printBallCount(int ball){
        System.out.println(ball + "볼");
    }

    public void printNothing(){
        System.out.println("낫싱");
    }

    public void printGameEndMessage(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

}
