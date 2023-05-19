package interfaces;

public interface Inventory {
    final int ITEMS_COUNT = 5;
    boolean put(Thing thing, int value);
    boolean useItem(int value);
}
