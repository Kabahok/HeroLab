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

    public static Hero createHero(String string) throws Exception{
        String[] strings = string.split(" ");
        String heroClass = strings[1];
        String username = strings[2];
        int level = Integer.parseInt(strings[3]);
        int health = Integer.parseInt(strings[4]);

        System.out.printf("%s %s [%s level %s health] is online%n", heroClass, username, level, health);

        switch (heroClass) {
            case "Elf" -> {
                int arrowsCount = Integer.parseInt(strings[5]);
                return new Elf(username, level, health, arrowsCount);
            }

            case "Wizard" -> {
                int mana = Integer.parseInt(strings[5]);
                int spellPower = Integer.parseInt(strings[6]);
                return new Wizard(username, level, health, mana, spellPower);
            }

            case "Knight" -> {
                int strength = Integer.parseInt(strings[5]);
                int forcePower = Integer.parseInt(strings[6]);
                return new Knight(username, level, health, strength, forcePower);
            }

            default -> throw new IllegalArgumentException("Unknown hero class: " + heroClass);
        }
    }

    @Override
    public String action(Player player) {
        return null;
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
    public boolean damage(int value) {
        return false;
    }
}
