public class Freshman extends Student {
    String colorOfBackpack;
    double amtSchoolSpirit;

    public Freshman() {
        colorOfBackpack = "";
        amtSchoolSpirit = 0;
    }
    public Freshman(String colorOfBackpack, double amtSchoolSpirit) {
        this.colorOfBackpack = colorOfBackpack;
        this.amtSchoolSpirit = amtSchoolSpirit;
    }

    public void setColorOfBackpack(String colorOfBackpack) {
        this.colorOfBackpack = colorOfBackpack;
    }

    public String getColorOfBackpack() {
        return colorOfBackpack;
    }
    
    // @Override
    // public String toString() {
    //     return super.toString();
    // }

}
