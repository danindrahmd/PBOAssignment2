import java.util.HashSet;

public class Set {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(18);
        set1.add(25);
        set1.add(26);
        set1.add(10);
        System.out.println("Set: " +set1);
        set1.clear();
        System.out.println("After Clear: " +set1);

    }
}
