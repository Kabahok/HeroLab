package interfaces;

public interface Armed {
    final int CLOTHES_COUNT = 3;

    boolean change(Arming item);
    boolean dress(Armor item, int value);
}
