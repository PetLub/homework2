public class Main {
    public static void main(String[] args) {
        int initialData = 100; //Начальный счёт клиента
        System.out.println("Начальный счёт:" + initialData);

        int accountRefill = 1200; //Сумма пополнения счёта
        int bonus = accountRefill / 100; //количество бонусов за пополнение счёта
        if (accountRefill > 1000) {
            System.out.println("Ваш бонус:" + bonus);
        }
        int finalData = accountRefill + bonus; //Итоговый счёт клиента
        System.out.println("Итоговый счёт:" + finalData);


    }
}