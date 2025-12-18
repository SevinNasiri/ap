package inheritance;

import javax.crypto.spec.PSource;

public class Super_Class {
    int num;
    int age;

    Super_Class(int num , int age){
        this.num = num;
        this.age = age;
    }

    public void display(){
        System.out.println("This is the display method of superclass");
    }
}
