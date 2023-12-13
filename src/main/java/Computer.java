import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 컴퓨터가 숫자를 생성한다.
 *
 * @author : mhj94
 * @see : generateRandomNumber() 난수를 생성한다.
 * @see : checkStatus() 플레이어 숫자와 비교한다
 * @see : contains() 플레이어 숫자가 컴퓨터가 생성한 숫자에 포함되어 있는지 비교한다
 */
public class Computer {

    private final int[] randomNumber;

    public Computer() {
        this.randomNumber = generateRandomNumber();
    }

    private int[] generateRandomNumber() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        int[] shuffleNumber = new int[3];
        for (int i = 0; i < 3; i++) {
            shuffleNumber[i] = numbers.get(i);
        }
        return shuffleNumber;
    }

    public int[] checkStatus(int[] playerNumber) {
        int[] result = new int[2];

        for (int i = 0; i < 2; i++) {
            if (randomNumber[i]==result[i]) {
                result[0]++;
            } else if (contains(randomNumber,result[i])) {
                result[1]++;
            }
        }
        return result;
    }

    private boolean contains(int[] randomNumber, int i) {
        for (int number : randomNumber) {
            if (number == i) {
               return true;
            }
        }
        return false;
    }
}
