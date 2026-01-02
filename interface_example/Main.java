package interface_example;

import org.w3c.dom.css.Rect;

import java.util.RandomAccess;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle perimeter: " + c.calculatePerimeter());

        Rectangle r = new Rectangle(4 , 6);
        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Rectangle Perimeter: "+ r.calculatePerimeter());

        Shape s1 = new Circle(7);
        System.out.println("Circle Area (interface): " + s1.calculateArea());
        System.out.println("Circle Perimeter (interface): " + s1.calculatePerimeter());

        Shape s2 = new Rectangle(8,2);
        System.out.println("Rectangle Area (interface): " + s2.calculateArea());
        System.out.println("Rectangle Perimeter (interface): " + s2.calculatePerimeter());
    }
}
