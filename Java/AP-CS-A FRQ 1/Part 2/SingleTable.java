public class SingleTable {

    private int numSeats;
    private int height;
    private double viewQuality;

    public SingleTable(int numSeats, int height, double viewQuality) {
        /** the constructors - instantiates (creates) the objects, allows us to put in what the object is  */
        this.numSeats = numSeats;
        this.height = height;
        this.viewQuality = viewQuality;
    }
    
    
    public int getNumSeats() {
        return numSeats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return viewQuality;
    }

    public void setViewQuality(double value) {
        viewQuality = value; 
    }
    /** because all objects already have a toString, im saying to do my version instead */
    @Override
    /** this converts the entire class into a string */
    public String toString() {
        String returnStr = "{ ";
        /** +=  ex: --> int a = 4; a += 2; a now equals 6 */
        returnStr += "numSeats: " + numSeats + ", ";
        returnStr += "height: " + height + ", ";
        returnStr += "viewQuality: " + viewQuality+ " }";
        return returnStr;
    }
}
