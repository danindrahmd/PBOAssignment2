import java.util.LinkedList;

public class LinkedlistStack {

    public static void main(String[] args) {
        LinkedList<Integer> Stack = new LinkedList<>();

        Stack.push(9);
        Stack.push(99);
        Stack.push(999);
        Stack.push(9999);

        System.out.println("LinkedList: " + Stack);
    }
}
