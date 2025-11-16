package Software_Engineer.LLD.ParkingLot;


public class Ticket {
    int id;
    Vehicle vehicle;
    String EntryTiming;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
