import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Linked implements Collection {

    private List<Integer> LinkedList;

    @Override
    public void create() {
        LinkedList = new LinkedList<>();
    }

    @Override
    public void read() {
        for (int i : LinkedList) {
            System.out.println(i);
        }
    }

    @Override
    public void add(int i) {
        LinkedList.add(i);
    }

    @Override
    public void addToTop(int i) {
        LinkedList.add(0, i);
    }

    @Override
    public void addByIndex(int index, int i) {
        LinkedList.add(index, i);
    }

    @Override
    public void readByIndex(int index) {
        System.out.println(LinkedList.get(index));
    }

    @Override
    public void update(int index, int i) {
        LinkedList.set(index, i);
    }

    @Override
    public void deleteFromTop() {
        LinkedList.remove(0);
    }

    @Override
    public void deleteFromEnd() {
        LinkedList.remove(LinkedList.size()-1);
    }

    @Override
    public void deleteByIndex(int index) {
        LinkedList.remove(index);
    }

    @Override
    public void ascendingSort() {
        Collections.sort(LinkedList);
    }

    @Override
    public void decreasingSort() {
        Collections.reverse(LinkedList);
    }

    @Override
    public void reverse() {
        Collections.reverse(LinkedList);
    }

    @Override
    public void deleteDuplicate() {
        LinkedList = LinkedList.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i : LinkedList) {
            sb.append(i + " ");
        }
        return sb.toString();
    }
}