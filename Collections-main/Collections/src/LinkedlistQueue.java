import java.util.LinkedList;

public class LinkedlistQueue {

    public static void main(String[] args) {
        LinkedList<Integer> Q = new LinkedList<>();

        Q.add(10);
        Q.add(100);
        Q.add(1000);

        System.out.println("Queue Size: " + Q.size());
        System.out.println("Content: " + Q);


    }

}
