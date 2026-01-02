package interface_example;

public class Circle implements Shape{

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int calculateArea(){

        return (int) (Math.PI * radius * radius);
    }



    public int calculatePerimeter(){

        return (int) (Math.PI * radius * 2);

    }





}
