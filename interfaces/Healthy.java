package interfaces;

public interface Healthy {
    final int MAX_HEALTH = 100;

    int getHealth();
    void recoverHealth(int value);
    void loseHealth(int value);
}
