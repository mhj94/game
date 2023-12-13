public class Main {

    public static void main(String[] args) {
        BaseballGame game = new BaseballGame(new Computer(), new Player());
        game.playGame();
    }
}
