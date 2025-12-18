package inheritance;

public class Sub_Class extends Super_Class{

    int num = 5;

    Sub_Class(int num , int age){
        super(num , age);
    }

    public void display(){
        System.out.println("This is the display method of subclass");
    }
    public void myMethod(){
        Sub_Class sub = new Sub_Class(num , age);

        sub.display();
        super.display();

        System.out.println("value of the variable named num in sub class: " + sub.num);
        System.out.println("value of the variable named num in super class: " + super.num);

    }
}
