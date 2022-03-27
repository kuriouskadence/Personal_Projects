public class Stack extends IntArrayList{
    int[] array;

    public Stack(int[] array) {
       super(array);
    }

    public int peek() {
        return array[array.length];
    }

    public int pop() {
        int top = peek();
        int[] copyArray = new int[array.length - 1];
        for(int i = 0; i < array.length; i++) {
            if(i != top) {
                copyArray[i] = array[i];
            }
        }
        array = copyArray;
        return top;
    }

    public int[] push(int n) {
        int[] copyArray = new int[array.length + 1];
        for(int i = 0; i < array.length; i++) {
            copyArray[i] = array[i + 1];
        }

        copyArray[array.length] = n;
        
        array = copyArray;
        return array;


    }






}
