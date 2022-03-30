public class IntArrayList{
    int[] arrayList;

    public IntArrayList() {
        this.arrayList = new int[4];
    }
    
    public IntArrayList(int[] array) {
        this.arrayList = array;
    }

    // dont like lastIndex
    public void add(int n) {
        int[] copyArray = new int[arrayList.length + 1];
        for(int i = 0; i < arrayList.length; i++) {
            copyArray[i] = arrayList[i];
        }
        copyArray[arrayList.length] = n;
        arrayList = copyArray;
    }
    
    // BAD
    public void add(int elem, int index) {
        int[] copyArray = new int[arrayList.length];
        for(int i = 0; i < arrayList.length; i++) {
            arrayList[index] = elem;
            copyArray[i] = arrayList[i];
        }
    }

    public int get(int n) {
        return arrayList[n];
    } 

    // BAD
    public int[] remove(int elem) {
        int[] copyArray = new int[arrayList.length - 1];
        for(int i = 0; i < arrayList.length; i++) {
            if(arrayList[i] == elem) {
                copyArray[i] = arrayList[i];
            }
        }
        return copyArray;
    }

    // Messy
    public void clear() {
        int[] copyArray = new int[0];
        arrayList = copyArray;
    }

    public boolean contains(int elem) {
        for(int i = 0; i < arrayList.length; i++) {
            if(arrayList[i] == elem) {
                return true;
            }
        }
        return false;
    }

    public int search(int elem) {
        for(int i = 0; i < arrayList.length; i++) {
            if(arrayList[i] == elem) {
                return i;
            }
        }
        return -1;
    }

    // Better way to write
    public boolean isEmpty() {
        if(arrayList.length == 0) {
            return true;
        }
        return false;
    }

    // Dummy
    // need some help with set because its similar to add with two perams
    // i remember you saying something about how they were different but i cant remember
    public int[] set(int elem, int index) {
         arrayList[index] = elem;
         return arrayList;
    }

    public int getSize() {
        return arrayList.length;
    }

    // CHECK THE PARAMETER
    public int getSum(int elem) {
        int sum = 0;
        if(arrayList[elem] > 0) {
            sum = arrayList[elem] + getSum(arrayList[elem] - 1);
        } else {
            return 0;
        }

        return sum;
    }

    // CHECK THE PARAMETER
    public int getProduct(int elem) {
        int product = 0;
        if(arrayList[elem] > 0) {
            product = arrayList[elem] * getSum(arrayList[elem] - 1);
        } else {
            return 0;
        }
        

        return product;
    }

    //  LAST COMMA
    @Override
    public String toString() {
        String rtnStr = "";
        rtnStr += "[ ";
        for(int i = 0; i < arrayList.length; i++) {
            rtnStr += arrayList[i] + ", " ;
         }

         rtnStr += "]";

        return rtnStr;
    }


}