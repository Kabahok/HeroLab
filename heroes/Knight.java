package heroes;

public class Knight extends Hero {

    private final int MAX_STRENGTH = 100;
    private int strength;
    private int forcePower;

    public Knight(String username, int level, int health, int strength, int forcePower) throws Exception {
        super(username, level, health);
        this.setStrength(strength);
        this.setForcePower(forcePower);
    }

    private void setStrength(int strength) throws Exception {
        if (strength < 0 || strength > this.MAX_STRENGTH) throw new Exception("\"Wrong value to hero’s strength\"");
        this.strength = strength;
    }

    private void setForcePower(int forcePower) throws Exception {
        if (forcePower < 0 || forcePower > this.strength) throw new Exception("\"Wrong value to hero’s force power\"");
        this.forcePower = forcePower;
    }

    private boolean fight() {
        if (this.strength != 0) {
            return this.strength - this.forcePower > 0;
        }
        return false;
    }
}
