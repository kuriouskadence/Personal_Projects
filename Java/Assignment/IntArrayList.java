public class IntArrayList{
    int[] arrayList;

    public IntArrayList() {
     int[] arrayList = new int[0];
    }
    
    public IntArrayList(int[] array) {
        this.arrayList = array;
    }

    public int[] add(int n) {
        int lastIndex = arrayList.length;
        int[] copyArray = new int[arrayList.length + 1];
        for(int i = 0; i < arrayList.length; i++) {
            copyArray[i] = arrayList[i];
        }
        copyArray[lastIndex] = n;
        arrayList = copyArray;
        return arrayList;
    }

    public int[] add(int n, int index) {
        int[] copyArray = new int[arrayList.length];
        for(int i = 0; i < arrayList.length; i++) {
            copyArray[i] = arrayList[i];
        }
        copyArray[index] = n;

        return copyArray;
    }

    public int get(int n) {
        return arrayList[n];
    } 

    public int[] remove(int n) {
        int[] copyArray = new int[arrayList.length - 1];
        for(int i = 0; i < arrayList.length; i++) {
            if( arrayList[i] != n) {
                copyArray[i] = arrayList[i];
            }
        }

        return copyArray;
    }

    public int[] clear() {
        int[] copyArray = new int[0];
        arrayList = copyArray;
        return arrayList;
    }

    public boolean contains(int n) {
        for(int i = 0; i < arrayList.length; i++) {
            if(arrayList[i] == n) {
                return true;
            }
        }
        return false;
    }

    public int search(int n) {
        for(int i = 0; i < arrayList.length; i++) {
            if(arrayList[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if(arrayList.length == 0) {
            return true;
        }
        return false;
    }
    // need some help with set because its similar to add with two perams
    // i remember you saying something about how they were different but i cant remember
    // public int[] set(int n, int index) {

    // }

    public int getSize() {
        return arrayList.length;
    }

    public int getSum(int n) {
        int sum = 0;
        if(arrayList[n] > 0) {
            sum = arrayList[n] + getSum(arrayList[n] - 1);
        } else {
            return 0;
        }

        return sum;
    }

    public int getProduct(int n) {
        int product = 0;
        if(arrayList[n] > 0) {
            product = arrayList[n] * getSum(arrayList[n] - 1);
        } else {
            return 0;
        }

        return product;
    }

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