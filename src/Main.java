public class Main {
    public static void main(String[] args) {
        // Два разных менеджера расходов
        ExpensesManager personalExpenses = new ExpensesManager();
        ExpensesManager workExpenses = new ExpensesManager();

        // Записываем личные расходы
        personalExpenses.saveExpense(1, 500); // понедельник
        personalExpenses.saveExpense(3, 1200); // среда

        // Записываем рабочие расходы
        workExpenses.saveExpense(2, 3000); // вторник
        workExpenses.saveExpense(5, 4500); // пятница

        // Печатаем по отдельности
        personalExpenses.printAllExpenses("Личные расходы");
        workExpenses.printAllExpenses("Рабочие расходы");

        // Печатаем максимальные траты
        System.out.println("Максимальные личные расходы: " + personalExpenses.findMaxExpense());
        System.out.println("Максимальные рабочие расходы: " + workExpenses.findMaxExpense());
    }
}
