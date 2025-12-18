package inheritance;

public class My_Calculation extends Calculation{

    public void multiplication(int x , int y){
        z = x*y;
        System.out.println("the product of the given numbers: " + z);
    }

    public void calculator(int x , int y){
        z = x - y;
        System.out.println("subtract: " + z);
    }
}
