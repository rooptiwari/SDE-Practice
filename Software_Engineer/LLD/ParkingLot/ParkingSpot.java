package Software_Engineer.LLD.ParkingLot;

public class ParkingSpot {


    int ParkingNo;
    VehicleCategory parkingType;
    int parkingCount;
    boolean isAvailable;

    public ParkingSpot(int parkingNo, VehicleCategory parkingType, int parkingCount, boolean isAvailable) {
        ParkingNo = parkingNo;
        this.parkingType = parkingType;
        this.parkingCount = parkingCount;
        this.isAvailable = isAvailable;
    }

    public int getParkingNo() {
        return ParkingNo;
    }

    public void setParkingNo(int parkingNo) {
        ParkingNo = parkingNo;
    }

    public VehicleCategory getParkingType() {
        return parkingType;
    }

    public void setParkingType(VehicleCategory parkingType) {
        this.parkingType = parkingType;
    }

    public int getParkingCount() {
        return parkingCount;
    }

    public void setParkingCount(int parkingCount) {
        this.parkingCount = parkingCount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public static ParkingSpot parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot){
        parkingSpot.isAvailable = false;
        return parkingSpot;
    }




}

