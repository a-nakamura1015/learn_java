package chapter_11;

public class GamePlayer {
    public String playerName;
    public GamePlayer(String name) {
        playerName = name;
    }
    @Override
    public String toString() {
        return "[player: " + playerName + "]";
    }
    public static void main(String[] args) {
        GamePlayer[] player = new GamePlayer[3];
        player[0] = new GamePlayer("Mad Hatter");
        player[1] = new GamePlayer("March Hare");
        player[2] = new GamePlayer("Alice");
        for (int index = 0; index < player.length; index++) {
            System.out.println(player[index]);
        }
    }
}
