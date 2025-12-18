package midterm;

public class Main {
    public static void main(String[] args) {

        Products p1 = new Products("apple" , "vgk5" ,
                "32" , "SSD" , "nkl" , "200");

        System.out.println(p1.getName());
        System.out.println(p1.getBrand());
        System.out.println(p1.getBrand());
        System.out.println(p1.getMemory());

        String[] printInfo = new String[2];
        printInfo[0] = "samsung";
        printInfo[1] = "vgk5";

        for (int i=0 ; i < 2 ; i++){
            System.out.println(printInfo[i]);
        }

    }
}
