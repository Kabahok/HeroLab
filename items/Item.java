package items;

import interfaces.Thing;

public class Item implements Thing {
    private int count;

    public Item(int count) throws Exception {
        this.setCount(count);
    }

    private void setCount(int count) throws Exception {
        if (count > 0) this.count = count;

        else throw new Exception("\"Wrong value to item’s count\"");
    }

    @Override
    public int use() {
        return 0;
    }

    @Override
    public boolean isUsed() {
        return false;
    }
}
