package inheritance;

public class Calculation {
    int z;

    public void calculator(int x , int y){
        z = x + y;
        System.out.println("the sum of the given numbers: " + z);
    }
    public void subtraction(int x , int y){
        z = x - y;
        System.out.println("the difference between the given numbers: " + z);
    }
}
