public class Application{
    public static void main (String[] args){
        ParkedCar car = new ParkedCar("Toyota", "Rav4", "Silver", "S2GJ8KW", 30);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer police = new PoliceOfficer("Bob", "1907867");  
        System.out.println(police.issueParkingTicket(car, meter));
    }
}