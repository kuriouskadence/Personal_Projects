public class ParkedCar {
    private String make; 
    private String model;
    private String color;
    private String liscensePlateNumber; 
    private int numMinsParked; 
    

    public ParkedCar(String make, String model, String color, String liscensePlateNumber, int numMinsParked){
        this.make = make;
        this.model = model;
        this.color = color;
        this.liscensePlateNumber = liscensePlateNumber;
        this.numMinsParked = numMinsParked;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLiscensePlateNumber() {
        return liscensePlateNumber;
    }

    public int getNumMinsParked() {
        return numMinsParked;
    }





}
