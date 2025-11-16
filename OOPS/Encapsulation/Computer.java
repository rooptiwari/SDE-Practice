package OOPS.Encapsulation;

public class Computer {
    private String motherBord;
    private String hardDisc;
    private String SSD;

    public Computer(String motherBord, String hardDisc, String SSD){
        this.hardDisc = hardDisc;
        this.motherBord = motherBord;
        this.SSD = SSD;
    }


    public String getMotherBord() {
        return motherBord;
    }

    public void setMotherBord(String motherBord) {
        this.motherBord = motherBord;
    }

    public String getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(String hardDisc) {
        this.hardDisc = hardDisc;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }
}
