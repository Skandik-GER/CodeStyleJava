import java.util.Scanner;

public class DepositCalculator {
    double calculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);

        return random(pay, 2);
    }

    double calculateSimplePercent(double amount, double yearRate, int depositPeriod) {
        return random(amount + amount * yearRate * depositPeriod, 2);
    }

    double random(double value, int places) {
        double Scale = Math.pow(10, places);

        return Math.round(value * Scale) / Scale;
    }

    void calculating( ) {
        int period, action;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();

        double Var = 0;

        if (action == 1) {
            Var = calculateSimplePercent(amount, 0.06, period);

        } else if (action == 2) {

            Var = calculateComplexPercent(amount, 0.06, period);
        }

        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + Var);
    }

public static void main(String[] args){

        new DepositCalculator().calculating();

    }
}