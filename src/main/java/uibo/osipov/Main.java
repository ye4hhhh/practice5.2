package uibo.osipov;

public class Main {
    public static void main(String[] args) {
        WorkService test = new WorkService();
        int result = test.calculate(100000, 60000, 150000);
        System.out.println("Количество месяцев отдыха: " + result);
    }
}
