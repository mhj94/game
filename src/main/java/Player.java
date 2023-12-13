import java.util.Scanner;

/**
 * 플레이어가 숫자를 입력한다.
 *
 * @author : hyun
 * @return : 입력한 숫자
 * @see : choice() 입력한 숫자를 받아, 쪼개서 배열에 저장
 */
public class Player {
    public int[] choice() {
        Scanner scan = new Scanner(System.in);  // 입력받을 수 있게
        System.out.println("세자리 숫자 입력해주세요");

        int choiceNum = scan.nextInt(); // 입력받은 숫자 -> int 타입 choiceNum
        String choiceNumStr = String.valueOf(choiceNum); // choiceNum -> String타입

        int[] choiceNumArr = new int[choiceNumStr.length()]; // 반환할 int배열 생성

        if((choiceNumStr.length() !=3) || !choiceNumStr.matches("\\d{3}")) {
            System.out.println("세자리 숫자로 입력해주세요");
            return choice();
        }

        // String타입으로 바꾼 입력값을 글자마다 쪼개서 int배열에 저장
        for (int i=0; i<choiceNumStr.length(); i++) {
            choiceNumArr[i] = Character.getNumericValue(choiceNumStr.charAt(i));
        }

        return choiceNumArr;
    }

}
