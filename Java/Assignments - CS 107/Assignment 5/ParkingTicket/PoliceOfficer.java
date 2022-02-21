public class PoliceOfficer {

    private String name;
    private String badgeNumber;

    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public String getName() {
        return name;
    }
     
    public String getBadgeNumber() {
        return badgeNumber;
    }

    public boolean checkMeter(ParkedCar car, ParkingMeter meter) {
        if(car.getNumMinsParked() > meter.getMinsPurchased()) {
            return true;
        } else {
            return false;
        }
    }

    public ParkingTicket issueParkingTicket(ParkedCar car, ParkingMeter meter) {
        if(checkMeter(car, meter) == true) {
            return new ParkingTicket(car, meter, this);
        } else{
            return null;
        }
    }
}
