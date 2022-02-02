public class StackLinkedList <E> implements LinkedListSpecs <E> {

   private Node<E> top; // this will be the top of the stack
    private int size;
    
    public StackLinkedList() {
       top = null;
       size = 0;
    }

    public StackLinkedList(E topVal) {
        this.top = new Node<E>(topVal); // makes it so next is null
        size = 1;
    }

    @Override
    public void push(E addVal) {
        Node<E> addNode = new Node<E>(addVal, top);
        top = addNode;
        size++;
    }

    @Override
    public E pop() {
        E popVal = top.getValue();
        top = top.getNext();
        size--;
        return popVal;
    }

    @Override
    public E peek() {
        return top.getValue();
    }
    @Override
    public int getSize() {
        return size;
    }

}
