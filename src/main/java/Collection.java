
public interface Collection {

    public String toString();

    public void create();

    public void read();

    public void readByIndex(int index);

    public void add(int i);

    public void addToTop(int i);

    public void addByIndex(int index, int i);

    public void update(int index, int i);

    public void deleteFromTop();

    public void deleteFromEnd();

    public void deleteByIndex(int index);

    public void ascendingSort();

    public void decreasingSort();

    public void reverse();

    public void deleteDuplicate();
}