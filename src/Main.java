
public class Main {
    public static void main(String[] args) {

        double roubles = 5000;      // стартовая сумма
        double yearRate = 4;        // годовая ставка, %
        int numOfMonth = 36;        // срок, мес.
        int monthRefill = 1000;     // ежемесячное пополнение

        double monthRate = yearRate / 12;       // месячная ставка, %
        double feePerMonth = 5000 * 0.001;      // 0.1% от первоначальной суммы = 5 ₽

        for (int i = 0; i < numOfMonth; i++) {
            double depositInterest = roubles * monthRate / 100; // проценты за месяц
            roubles += depositInterest;                         // прибавили проценты
            roubles += monthRefill;                             // пополнили счёт
            roubles -= feePerMonth;                             // списали обслуживание
        }

        System.out.println("Через " + numOfMonth + " месяцев накопится " + roubles + " рублей");

        if (roubles >= 41000) {
            System.out.println("Ура! Можно идти в магазин за новым объективом!");
        } else {
            System.out.println("Нужно ещё немного подкопить.");
        }
    }
}
