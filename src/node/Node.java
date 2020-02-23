package node;

public class Node<T> {
    private T data;         //Data of node
    private Node<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
