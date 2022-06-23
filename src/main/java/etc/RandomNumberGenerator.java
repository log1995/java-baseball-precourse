package etc;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {

    private final static int START = 1;
    private final static int END = 9;
    private static int[] RandomNumsArr = new int[3];

    public int[] generate() {
        RandomNumsArr[0] = Randoms.pickNumberInRange(START, END);
        for(int i= 1; i < 3; i++) {
            RandomNumsArr[i] = Randoms.pickNumberInRange(START, END);
            getUniqueNumber(i);
        }
        return RandomNumsArr;
    }

    private void getUniqueNumber(int i) {
        while(compareNums(RandomNumsArr, i))
            RandomNumsArr[i] = Randoms.pickNumberInRange(START, END);
    }

    public boolean compareNums(int[] numArr, int i) {
        for(int j = 0; j < i; j++)
            if(numArr[j] == numArr[i])
                return true;
        return false;
    }
}
