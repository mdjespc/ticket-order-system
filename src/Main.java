import model.Node;
import model.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ticket Order System");

        Queue<Node<Integer>> queue = new Queue<>();

        queue.enqueue(new Node<>(10));
        queue.enqueue(new Node<>(20));
        queue.enqueue(new Node<>(30));
        queue.enqueue(new Node<>(40));
        queue.enqueue(new Node<>(50));

        System.out.println(queue.at(0));
        System.out.println(queue.at(1));
        System.out.println(queue.at(2));
        System.out.println(queue.at(3));
        System.out.println(queue.at(4));
    }
}