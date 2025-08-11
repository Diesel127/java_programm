
public class Main {
    public static void main(String[] args) {
        double price = 256;
        int totalMonths = 12;

        double totalCost = 0;

        // опишите условие цикла.
        // в качестве переменной итерирования можно использовать переменную month
        for (int i = 1; i <= 12; i++) {
            if (i % 3 == 0) {
                price = price / 2;
                totalCost += price;
            } else {
                totalCost += price;
            }

        }
        System.out.println("Общая стоимость за " + totalMonths + " месяцев: " + totalCost + " руб.");
    }
}