package heroes;

public class Elf extends Hero {
    private final int MAX_ARROWS = 100;
    private int arrowsCount;

    public Elf(String username, int level, int health, int arrows) throws Exception{
        super(username, level, health);
        this.setArrows(arrows);
    }

    private void setArrows(int arrows) throws Exception {
        if (arrows > this.MAX_ARROWS || arrows < 0) throw new Exception("Wrong value to hero’s count of arrows");
        this.arrowsCount = arrows;
    }

    private boolean shootArrow() {
        if (this.arrowsCount != 0) {
            return this.arrowsCount - 1 > 0;
        }
        return false;
    }
}
