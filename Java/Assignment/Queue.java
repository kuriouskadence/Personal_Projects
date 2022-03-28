public class Queue extends IntArrayList{
    int[] array;

    public Queue() {
        super();
    }
    public Queue(int[] array) {
        super(array);
    }

    public int peek() {
        return array[0];
    }

    public int[] poll() {
    int[] copyArray = new int[array.length - 1];
        for(int i = 1; i < array.length; i++) {
            copyArray[i - 1] = array[i];
        }
        array = copyArray;
        return array;
    }
}