package Software_Engineer.LLD.Day1;

public class Student {
    private String name ;
    private int rollNumber;
    private float marks;

    public void setName(String name){
        this.name = name;
    }
    public  String getName(){
        return name;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public  int getRollNumber(int i){
        return rollNumber;
    }

    public void setMarks(float marks){
        this.marks = marks;
    }
    public  float getMarks(){
        return marks;
    }

    public void Display(){
        System.out.println("Name :" + name);
        System.out.println("rollNumber :" + rollNumber);
        System.out.println("marks :" + marks);
    }

}
