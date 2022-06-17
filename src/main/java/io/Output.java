package io;

public class Output {

    public void startMessage(){
        System.out.print("숫자를 입력해 주세요 : ");
    }

    public void reGameMessage(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public String printInputWrongNumberError(){
        return "잘못된 숫자를 입력하셨습니다. 프로그램을 종료합니다";
    }

    public String printInputSameNumberError(){
        return "입력하신 숫자 안에 동일한 숫자가 있습니다. 프로그램을 종료합니다";
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

    public void gameEndMessage(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

}
