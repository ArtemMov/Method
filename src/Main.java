import java.time.LocalDate;

import static java.time.Year.isLeap;

public class Main {
    public static void main(String[] args) {
        printIsLeapYear(2024);

        recommendApplicationVersion(0, 2022);

        System.out.println(calculateDeliveryDays(30));
    }
    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный.");
        } else {
            System.out.println(year + " не является високосным.");
        }
    }
    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }
    private static boolean IsLeap(int year) {
        return year % 4 == 0 && year % 100 != year % 400 == 0;
    }
    static void recommendApplicationVersion(int clientOS, int deviceYear){
        boolean deviceIsOld = icDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld){
            System.out.print("lite");
        }
        System.out.print("версию для ");
        if (clientOS == 0){
            System.out.print("IOS");
        }else {
            System.out.print("Andoid");
        }
        System.out.println("Установите %s версию приложения для %s по ссылке", version, device);}
    private static boolean icDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }
    public static String calculateDeliveryDays(int deliveryDistance){
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays++;
        }else if (deliveryDistance > 100){
            return "Не возможно расчитать срок доставки.";
        }
        return "Потребуется дней "+ deliveryDays;
    }
}