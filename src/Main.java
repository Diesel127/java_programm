

public class Main {

    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double maxExpense = findMaxExpense(expenses); // вызовите метод и присвойте maxExpense значение его результата
        System.out.println("Самая большая трата недели " + maxExpense);
    }

    public static double findMaxExpense(double[] expenses) { // объявите метод findMaxExpense
        double maxExpense = expenses[0];
        for (double expens : expenses) {
            if (expens > maxExpense) {
                maxExpense = expens;
            }
        }
        return maxExpense;
    }
}