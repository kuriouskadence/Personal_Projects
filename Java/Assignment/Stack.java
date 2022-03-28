public class Stack extends IntArrayList{

    public Stack() {
        super();
    }

    public Stack(int[] array) {
       super(array);
    }

    // OBVIOUSLY BREAK
    // THIS TOO
    public int peek() {
        return get(getSize() - 1);
    }

    // YOU CAN USE THE INTARRAYLIST METHODS
    // public int pop() {
       
    // }

    // weird
    // use methods from super
    public void push(int elem) {
        add(elem);
    }

}
