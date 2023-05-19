package interfaces;

public interface Player {
    String getUsername();
    int getLevel();
    void levelUp();
    String action(Player player);
    boolean damage(int value);
}
