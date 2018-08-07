import static org.junit.Assert.*;


public class MainTest {

    public static void main(String[] args) {

        Array arrayList = new Array();
        arrayList.create();
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(7);
        arrayList.addToTop(3);
        arrayList.ascendingSort();
        arrayList.deleteDuplicate();

        String actual = arrayList.toString();

        String exceptedAdd = "3 7 ";
        String exceptedAddToTop = "3 3 1 ";
        String ascendingSort = "1 3 3 7 ";
        String deleteDuplicate = "1 3 7 ";

        assertEquals(exceptedAdd, actual);
        assertEquals(exceptedAddToTop, actual);
        assertEquals(ascendingSort, actual);
        assertEquals(deleteDuplicate, actual);

    }

}