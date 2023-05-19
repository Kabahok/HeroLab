package heroes;

import interfaces.*;

public class Hero implements Inventory, Armed, Player, Healthy {
    protected String username;
    protected int level;
    protected int health;
    protected Arming weapon;
    Armor[] clothes;
    Thing[] items;

    public Hero(String username, int level, int health) throws Exception {
        this.setUsername(username);
        this.setHealth(health);
        this.setLevel(level);
    }

    private void setUsername(String username) throws Exception {
        if (username.length() < 5) throw new Exception("Wrong value to hero’s username");
        this.username = username;
    }

    private void setLevel(int level) throws Exception {
        if (level < 0) throw new Exception("\"Wrong value to hero’s level\"");
        this.level = level;
    }

    private void setHealth(int health) throws Exception {
        if (health < 0) throw new Exception("\"Wrong value to hero’s health\"");
        this.health = health;
    }

    @Override
    public boolean change(Arming item) {
        return false;
    }

    @Override
    public boolean dress(Armor item, int value) {
        return false;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public void recoverHealth(int value) {

    }

    @Override
    public void loseHealth(int value) {

    }

    @Override
    public boolean put(Thing thing, int value) {
        return false;
    }

    @Override
    public boolean useItem(int value) {
        return false;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public void levelUp() {

    }

    @Override
    public String action(Player player) {
        return null;
    }

    @Override
    public boolean damage(int value) {
        return false;
    }
}
