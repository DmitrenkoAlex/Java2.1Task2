public class Main {
    public static void main(String[] args) {

        int account = 100; //Введит сумму на счету
        int refill = 1290; // Введите сумму пополнения счета
        int bonus = 100; // сумма для начисления 1ого бонуса
        int bonusAmount = refill / bonus; // расчет бонуса

        if (refill > 1000) {
            bonusAmount = refill / bonus;
        } else {
            bonusAmount = 0;
        }

        System.out.println("Бонус:" + bonusAmount); //вывод бонуса
        System.out.println("Балланс:" + (account + refill + bonusAmount)); // вывод баланса счета с бонусом
    }
}
