package inheritance;

public class Main1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        My_Calculation m = new My_Calculation();
        Calculation c = new Calculation();
        c.calculator(a,b);
        m.calculator(a,b);
        m.subtraction(a,b);
        m.multiplication(a,b);
    }
}
