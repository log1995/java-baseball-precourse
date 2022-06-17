package io;

import camp.nextstep.edu.missionutils.Console;

import java.util.regex.Pattern;

public class Input {

    private Output output;

    public Input(){
        this.output = new Output();
    }

    public int[] inputNum() {
        output.startMessage();
        String num = Console.readLine();
        return checkUserNums(num);
    }

    public String reGame() {
        output.reGameMessage();
        String num = Console.readLine();
        return num;
    }

    public int[] checkUserNums(String num) {
        String[] numArr = num.split("(?!^)");;
        int[] userNums = new int[3];
        int len = numArr.length;
        checkLength(numArr, len);
        checkRightNumber(numArr, len);

        for(int i = 0; i < 3; i++)
            userNums[i] = Integer.parseInt(numArr[i]);

        return userNums;
    }

    // 숫자가 세자리 숫자인지 확인해주는 메서드
    public void checkLength(String[] numArr, int len) {
        if(len > 3 || len < 3)
            throw new IllegalArgumentException();
    }

    //사용자가 입력한 것이 숫자인지 확인해주는 메서드
    public void checkRightNumber(String[] numArr, int len) {
        String numRegex = "^[1-9]*$";

        for(int i = 0; i < len; i++) {
            if(!Pattern.matches(numRegex, numArr[i]))
                throw new IllegalArgumentException(output.printInputWrongNumberError());
            checkSameNumber(numArr, len, i);
        }
    }

    //사용자가 동일한 숫자를 입력했는지 확인해주는 메서드
    public void checkSameNumber(String[] numArr, int len, int i) {
        for(int j = i + 1; j < len; j++) {
            if(numArr[i].equals(numArr[j]))
                throw new IllegalArgumentException(output.printInputSameNumberError());
        }
    }

}
