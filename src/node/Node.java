package node;

public class Node<T> {
    private T data;         //Data of node
    private Node<T> next;

    public T getData() {
        return data;
    }
}
