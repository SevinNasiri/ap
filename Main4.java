import java.util.Scanner;

public class Main4 {

    public static double average(double[] scores){
        double sum =0 ;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        return sum/3;
    }

    public static void printAverage(double[] scores){
        double avg = average(scores);
        System.out.println("average is: " + avg);
    }

    public static void maxScore(double[] scores){
        double max = scores[0];
        for (int i = 0; i < 3; i++) {
            if (scores[i] > max){
                max = scores[i];
            }
        }
        System.out.println("max score is: " + max);

    }

    public static void scoreUpperThanAverage(double[] scores){
        double avg = average(scores);
        System.out.println("scores above average:");
        for (int i = 0; i < 3; i++) {
            if (scores[i] > avg) {
                System.out.println(scores[i]);;
            }
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Main4 s = new Main4();

        double[] scores = new double[3];

        System.out.println("enter scores:");

        for (int i = 0; i < 3; i++) {
            scores[i] = scanner.nextDouble();
        }

        s.printAverage(scores);
        s.maxScore(scores);
        s.scoreUpperThanAverage(scores);
    }
}
