import java.lang.Math;
public class ParkingTicket {
    
    ParkedCar car;
    ParkingMeter meter;
    PoliceOfficer police;

    public ParkingTicket(ParkedCar car, ParkingMeter meter, PoliceOfficer police) {
        this.car = car;
        this.meter = meter;
        this.police = police;
    }

    public double calcFine() {
        double minsOver = car.getNumMinsParked() - meter.getMinsPurchased();
        if(minsOver <= 0) {
            return 0;
        }
        double amtDue = 25;
        if(minsOver <= 60) {
            return amtDue;
        }
        if(minsOver > 60) {
            minsOver -= 60;
        }
        double additionalHours = Math.ceil(minsOver / 60);
        amtDue += additionalHours * 10;

        return amtDue;
    }

    @Override
    public String toString() {
        String ticketStr = "";
        ticketStr += "Make: " + car.getMake() + "\n";
        ticketStr += "Model: " + car.getModel() + "\n";
        ticketStr += "Color: " + car.getColor() + "\n";
        ticketStr += "Car's Liscense Plate Number: " + car.getLiscensePlateNumber() + "\n";
        ticketStr += "Number of Minutes Parked: " + car.getNumMinsParked() + "\n";
        ticketStr += "Number of Minutes Purchased: " + meter.getMinsPurchased() + "\n";
        ticketStr += "Number of Minutes Over: " + (car.getNumMinsParked() - meter.getMinsPurchased()) + "\n";
        ticketStr += "Name of Police Officer: " + police.getName() + "\n";
        ticketStr += "Badge Number of Police Officer: " + police.getBadgeNumber() + "\n";

        return ticketStr;
    }
}
