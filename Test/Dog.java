package Test;

public class Dog extends Animal{
    @Override
    public void sound() {
        super.sound();
        System.out.println("Bark");
    }
}
