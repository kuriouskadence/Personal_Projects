
public class MemberInfo {
 
    private String memName;
    private int gradYear;
   private boolean hasGoodStanding;


    public MemberInfo(String memName, int gradYear, boolean hasGoodStanding){
        this.memName = memName;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public void setHasGoodStanding(boolean hasGoodStanding) {
        this.hasGoodStanding = hasGoodStanding;
    }


    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return hasGoodStanding;
    }

    @Override 
    public String toString() {
        return "[" + memName + ", " + gradYear + ", " + hasGoodStanding + "]";
    } 
    
}