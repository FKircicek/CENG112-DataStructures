public class TableWarehouse implements IProduct {

    Stack Table = new Stack();

    private int count_sold = 0;

    public int getCount_sold() {
        return count_sold;
    }

    public void setCount_sold(int count_sold) {
        this.count_sold = count_sold;
    }
    @Override
    public boolean isManufactured() {
        return false;
    }

    @Override
    public boolean isStored() {
        if (Table.getTopIndex() + 1 > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isSold() {
        if (count_sold > 0) {
            return true;
        }
        return false;
    }
}