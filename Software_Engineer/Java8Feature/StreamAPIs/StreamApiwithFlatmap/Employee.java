package Software_Engineer.Java8Feature.StreamAPIs.StreamApiwithFlatmap;

import java.util.HashSet;
import java.util.Set;

public class Employee {
    private String name;
    private Set<String> devides;

//    public Employee(String name , Set<String> devices){
//        this.name = name;
//        this.devides = devices;
//    }

    public void addDeviceName(String deviceName){
        if(this.devides == null){
            this.devides = new HashSet<>();
        }
        this.devides.add(deviceName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getDevides() {
        return devides;
    }

    public void setDevides(Set<String> devides) {
        this.devides = devides;
    }

}
