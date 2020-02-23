package node;

public class Node<T> {
    private T data;         //Data of node
    private Node<T> next;

    public T getData() {    //getter method
        return data;
    }

    public void setData(T data) {   //setter method
        this.data = data;
    }

    public Node<T> getNext() {  //getter method for referential variable
        return next;
    }

    public void setNext(Node<T> next) { //setter method for referential variable
        this.next = next;
    }
}
