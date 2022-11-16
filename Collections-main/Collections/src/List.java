import java.util.ArrayList;
import java.util.Collections;

public class List {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("D");
        list1.add("a");
        list1.add("n");
        list1.add("i");
        list1.add("n");
        System.out.println("List: " + list1);
        Collections.sort(list1);
        System.out.println("After Sort: " +list1);
    }



}
