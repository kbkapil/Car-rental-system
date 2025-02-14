import java.util.ArrayList;
import java.util.List;

public class InsertDeleteLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Insert 10 elements into the list
        for (int i = 0; i < 10; i++) {
            list.add("Element " + i);
            System.out.println("Inserted: " + list);
        }

        // Delete every other element from the list
        for (int i = list.size() - 1; i >= 0; i -= 2) {
            list.remove(i);
            System.out.println("Deleted: " + list);
        }
    }
}