package OOPS.Inheritence;

public class Dog extends Animal{



    public String Kingdom = "DogKingdom";
    @Override
     public void sound(){
         System.out.println("Dog Barks");
     }
    public void eat(){
        System.out.println("Dog eat");
    }

}
