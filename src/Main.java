
public class Main {
    public static void main(String[] args) {



        int days = 3; // количество дней, в которые Байт будет тренироваться
        int run = 2; // число пробежек в день

        for (int i = 1; i <= days; i++) { // внешний цикл для смены дней
            System.out.println("День " + i);
            for (int j = 1; j <= run; j++) { // вложенный цикл для пробежек с новой переменной
                System.out.println("  Пробежка " + j);
            }
        }
    }
}