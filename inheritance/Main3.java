package inheritance;

public class Main3 {
    public static void main(String[] args) {

        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();
        Deer de = new Deer();

        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.println(d instanceof Mammal);
        a.move();
        d.move();
        a.sleep();
        de.sleep();
    }
}
