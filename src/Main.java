import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        int sum = 0;
        while (!end) {
            if (sc.hasNextInt()){
                int num = sc.nextInt();
                sum += num;
            } else if (sc.hasNextLine()) {
                String i = sc.nextLine();
                if (i.equalsIgnoreCase("enter")){
                    end = true;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}