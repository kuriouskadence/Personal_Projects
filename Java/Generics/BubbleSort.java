public class BubbleSort <T extends Comparable> extends Sort<T>{
    
    public BubbleSort(T[] ogArr){
        super(ogArr);
    }


    @Override  
    public T[] ascendSort() {
        for( int i = 0; i < ascendArr.length - 1; i++){
            for(int j = i + 1; j < ascendArr.length; j++){
                if (ascendArr[i].compareTo(ascendArr[j]) > 0) {
                    T temp = ascendArr[i];
                    ascendArr[i] = ascendArr[j];
                    ascendArr[j] = temp;

                }
            }
        }
        return ascendArr;
    } 


    public static void main(String[] args) {
        BubbleSort<String> bs = new BubbleSort<>(args);
        bs.ascendSort();
        String print = "[ ";
        for( int i = 0; i < bs.ascendArr.length; i++){
            print += bs.ascendArr[i] + ", ";
        }
        print += " ]";

        System.out.println(print);

        Integer[] intArr = {1, 9, 0 ,7 ,8 ,6, 7};
        BubbleSort<Integer> bsi = new BubbleSort<>(intArr);
        bsi.ascendSort();
        print = "[ ";
        for( int i = 0; i < bsi.ascendArr.length; i++){
            print += bsi.ascendArr[i] + ", ";
        }
        print += " ]";

        System.out.println(print);

    }




    
}