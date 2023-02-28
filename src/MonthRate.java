public class MonthRate {
    public double calculate(double annualRate, int months, int money) {
        double monthrate = annualRate / 12 / 100;
        double x = 1 + monthrate;
        double y = monthrate * Math.pow(x, months);
        double z = Math.pow(x, months) - 1;
        double koef = y / z;
        double result = koef * money;
        return result;
    }
}
