package abstract_example;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Dog:");
        d.fetch();
        d.sound();
        d.sleep();

        System.out.println();

        System.out.println("Cat:");
        c.sound();
        c.sleep();

        System.out.println();

        System.out.println("using reference:");
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound();
        animal2.sound();
        animal2.sleep();
    }
}
