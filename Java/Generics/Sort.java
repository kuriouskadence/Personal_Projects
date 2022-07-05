public abstract class Sort <T> {
    
    T[] ogArr;
    T[] ascendArr;

    public Sort(T[] ogArr) {
        this.ogArr = ogArr;
        this.ascendArr = ogArr.clone();

    }

    public abstract T[] ascendSort(); 



}
