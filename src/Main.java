//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = 0;
        while (n < 10){
            int m = 0;
            while (m < 20){
                if (n == 0 || n == 9){
                    System.out.print("Б");
                    m++;
                } else if (m == 0 || m == 19){
                    System.out.print("Б");
                    m++;
                } else {
                    System.out.print(" ");
                    m++;
                }
            }

            System.out.println();
            n++;
        }
    }
}