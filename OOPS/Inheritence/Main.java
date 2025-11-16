package OOPS.Inheritence;

public class Main {



    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal anm = new Animal();
        Dog Rocky = new Dog();

        System.out.println(dog.Kingdom);
        System.out.println(anm.Kingdom);
        dog.sound();
        dog.run();
        anm.run();
        anm.sound();
        
    }
}
