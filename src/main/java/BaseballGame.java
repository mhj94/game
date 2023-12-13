import java.util.Arrays;

public class BaseballGame {

    private final Computer computer;
    private final Player player;

    public BaseballGame(Computer computer, Player player) {
        this.computer = computer;
        this.player = player;
    }

    public void playGame() {
        System.out.println("=== 게임을 시작합니다.===");

        int attempt = 0;

        while (true) {
            attempt++;
            int[] playerNumber = player.choice();
            int[] result = computer.checkStatus(playerNumber);

            System.out.println(attempt+" 번째 시도 : " + Arrays.toString(result));
            System.out.println(result[0] + "S" + result[1] + "B");

            if (result[0] == 3) {
                System.out.println("축하합니다.");
                System.out.println(attempt + "번만에 맞추는데 성공하셨습니다.");
                break;
            }
        }
    }
}
