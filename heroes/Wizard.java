package heroes;

public class Wizard extends Hero {
    private final int MAX_MANA = 100;
    private int mana;
    private int spellPower;


    public Wizard(String username, int level, int health, int mana, int spellPower) throws Exception {
        super(username, level, health);
        this.setMana(mana);
        this.setSpellPower(spellPower);
    }

    private void setMana(int mana) throws Exception {
        if (mana < 0 || mana > this.MAX_MANA) throw new Exception("\"Wrong value to hero’s mana\"");
        this.mana = mana;
    }

    private void setSpellPower(int spellPower) throws Exception {
        if (spellPower < 0 || spellPower > this.mana) throw new Exception("\"Wrong value to hero’s spell power\"");
        this.spellPower = spellPower;
    }

    private boolean spell() {
        if (mana != 0) {
            return this.mana - this.spellPower > 0;
        }
        return false;
    }
}
