import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Array implements Collection {

    private List<Integer> list;

    public void create() {
        list = new ArrayList<>();
    }

    @Override
    public void read() {
        for (int i : list) {
            System.out.println(i);
        }
    }

    @Override
    public void add(int i) {
        list.add(i);
    }

    @Override
    public void addToTop(int i) {
        list.add(0, i);
    }

    @Override
    public void addByIndex(int index, int i) {
        list.add(index, i);
    }

    @Override
    public void readByIndex(int index) {
        System.out.println(list.get(index));
    }

    @Override
    public void update(int index, int i) {
        list.set(index, i);
    }

    @Override
    public void deleteFromTop() {
        list.remove(0);
    }

    @Override
    public void deleteFromEnd() {
        list.remove(list.size()-1);
    }

    @Override
    public void deleteByIndex(int index) {
        list.remove(index);
    }

    @Override
    public void ascendingSort() {
        Collections.sort(list);
    }

    @Override
    public void decreasingSort() {
        Collections.reverse(list);
    }

    @Override
    public void reverse() {
        Collections.reverse(list);
    }

    @Override
    public void deleteDuplicate() {
        list = list.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i : list) {
            sb.append(i + " ");
        }
        return sb.toString();
    }
}