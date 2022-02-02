public class Node <E> {

    private E value;
    private Node<E> next;

    public Node() {
        value = null;
        next = null;
    }
    
    public Node(E value) {
        this.value = value;
        next = null;
    }

    public Node(E value, Node<E> next){
        this.value = value;
        this.next = next;
    }

    public void setValue(E value) {
        this.value = value;
    }
    public E getValue() {
        return value;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getNext() {
        return next;
    }

    public boolean hasNext() {
        return next != null; //if next != null then next has a next, if not then false//
    }




}