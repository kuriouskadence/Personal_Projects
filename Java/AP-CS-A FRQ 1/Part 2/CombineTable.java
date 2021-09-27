public class CombineTable {

    private SingleTable t1;
    private SingleTable t2;

    public CombineTable(SingleTable t1, SingleTable t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public boolean canSeat(int numSeats) {
        int totalSeats = t1.getNumSeats() + t2.getNumSeats() - 2;
        if (totalSeats >= numSeats) {
            return true;
        } else{
            return false;
        }
        //  return totalSeats >= numSeats;
    }s
    
    public double getDesirability() {
        double desirability = (t1.getViewQuality() + t2.getViewQuality()) /2 ; 
        if(t1.getHeight() != t2.getHeight()) {
            desirability -= 10; 
        }
        return desirability;
    }
    

    @Override
    public String toString() {
        String returnStr = "{ ";
        returnStr += "Table1: " + t1 + ", ";
        returnStr += "Table2: " + t2 + " }";
        return returnStr;
    }
    
}
