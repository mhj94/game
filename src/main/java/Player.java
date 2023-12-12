import java.util.Scanner;

public class Player {
    // 필드
    int choiceNum;
    int[] choiceArr;

    // 메서드
    public int[] choice() {
        Scanner scan = new Scanner(System.in);  // 입력받을 수 있게
        int choiceNum = scan.nextInt(); // 입력받은 숫자 -> int 타입 choiceNum
        String choiceNumStr = String.valueOf(choiceNum); // choiceNum -> String타입

        int[] choiceNumArr = new int[choiceNumStr.length()]; // 반환할 int배열 생성

        // String타입으로 바꾼 입력값을 글자마다 쪼개서 int배열에 저장
        for (int i=0; i<choiceNumStr.length(); i++) {
            choiceNumArr[i] = Character.getNumericValue(choiceNumStr.charAt(i));
        }

        return choiceNumArr;

    }

    public static void main(String[] args) {
        Player player = new Player();
        int[] choice = player.choice();
        System.out.print(choice[0]);
        System.out.print(choice[1]);
        System.out.print(choice[2]);
    }
}
