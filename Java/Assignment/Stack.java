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
    public int[] push(int elem) {
        int[] copyArray = new int[getSize() + 1];
            
        copyArray[copyArray.length - 1] = elem;

        return copyArray;
    }

}
