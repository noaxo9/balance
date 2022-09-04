public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int money = 1100;
        int bonus = money/100;


        if (money > 1000)  {
            System.out.println(" Бонус " + bonus);
            System.out.println(" Баланс " + (balance + money + bonus));
        }
        if (money < 1000)  {
            System.out.println(" Бонус 0 ");
            System.out.println(" Баланс " + (balance + money));

        }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}