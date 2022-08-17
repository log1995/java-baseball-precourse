package io;

import camp.nextstep.edu.missionutils.Console;
import etc.UserNumberCheck;

public class ConsoleInput implements Input{

    private UserNumberCheck userNumberCheck;
    private String num;

    public ConsoleInput() {
        this.userNumberCheck = new UserNumberCheck();
    }

    @Override
    public int[] inputUserNum() {
        num = Console.readLine();
        return userNumberCheck.checkUserNums(num);
    }

    @Override
    public String inputReGameNum() {
        num = Console.readLine();
        return num;
    }

}

























//    @Override
//    public int[] inputUserNum() {
//        num = Console.readLine();
//        return checkUserNums(num);
//    }
//
//    @Override
//    public String reGame() {
//        num = Console.readLine();
//        return num;
//    }
//
//    public String getNum(){
//        return num;
//    }
//
//    public int[] getUserNums(){
//        return userNums;
//    }
//
//    public void changeNumToArr(){
//
//    }
//
//    @Override
//    public int[] checkUserNums(String num) {
//        String[] numArr = num.split("(?!^)");;
//        int[] userNums = new int[3];
//        int len = numArr.length;
//        checkLength(len);
//        checkRightNumber(numArr, len);
//
//        for(int i = 0; i < 3; i++)
//            userNums[i] = Integer.parseInt(numArr[i]);
//
//        return userNums;
//    }
//
//    // 숫자가 세자리 숫자인지 확인해주는 메서드
//    public void checkLength(int len) {
//        if(len > 3 || len < 3)
//            throw new InputWrongNumberOfDigitsException();
//    }
//
//    //사용자가 입력한 것이 숫자인지 확인해주는 메서드
//    public void checkRightNumber(String[] numArr, int len) {
//        String numRegex = "^[1-9]*$";
//
//        for(int i = 0; i < len; i++) {
//            if(!Pattern.matches(numRegex, numArr[i]))
//                throw new InputNotNumberException();
//            checkSameNumber(numArr, len, i);
//        }
//    }
//
//    //사용자가 동일한 숫자를 입력했는지 확인해주는 메서드
//    public void checkSameNumber(String[] numArr, int len, int i) {
//        for(int j = i + 1; j < len; j++) {
//            if(numArr[i].equals(numArr[j]))
//                throw new InputSameNumberException();
//        }
//    }