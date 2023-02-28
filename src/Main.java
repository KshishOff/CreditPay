public class Main {
    public static void main(String[] args) {
        MonthRate service = new MonthRate();
        double annualRate = 9.99;
        int months = 12;
        int money = 1_000_000;
        double a = service.calculate(annualRate, months, money);


        System.out.printf("Ваш ежемесячный платеж составит: " + "%.0f", a);
    }


}

