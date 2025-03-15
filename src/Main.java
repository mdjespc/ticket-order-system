import model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ticket Order System");

        Node<Integer> example1 = new Node<>(10);
        System.out.println(example1.getValue());

        Node<String> example2 = new Node<>("Hello");
        System.out.println(example2.getValue());


        Queue<Node<Integer>> Q = new Queue<>();
        Q.enqueue(new Node<>(10));
        System.out.println(Q);

        Q.enqueue(new Node<>(20));
        System.out.println(Q);

        Q.enqueue(new Node<>(30));
        Q.enqueue(new Node<>(40));
        System.out.println(Q);

        Q.enqueue(new Node<>(50));
        Q.enqueue(new Node<>(60));
        Q.enqueue(new Node<>(70));
        Q.enqueue(new Node<>(80));
        System.out.println(Q);

        Q.enqueue(new Node<>(90));
        Q.enqueue(new Node<>(100));
        System.out.println(Q);
    }
}