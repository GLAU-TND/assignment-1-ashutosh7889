package definition;

import node.Node;

public class MyLinkedList<T extends Comparable<T>> {
    private Node<T> head;
    private Node<T> iter;           //use to iterate the list

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> node) {
        head = node;
        iter = head;
    }

    public Node<T> getIter() {
        return iter;
    }

}