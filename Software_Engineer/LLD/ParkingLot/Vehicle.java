package Software_Engineer.LLD.ParkingLot;

public class Vehicle {

    int VehcleNo;
    VehicleCategory vehicleCategory;

    public Vehicle(int vehcleNo, VehicleCategory vehicleCategory) {
        VehcleNo = vehcleNo;
        this.vehicleCategory = vehicleCategory;
    }

    public int getVehcleNo() {
        return VehcleNo;
    }
    public void setVehcleNo(int vehcleNo) {
        VehcleNo = vehcleNo;
    }
    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }
    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

}
