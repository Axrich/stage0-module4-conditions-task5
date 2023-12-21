package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void main(String[] args) {
        LeapYearPrinter printer = new LeapYearPrinter();

        printer.isLeapYear(2000);
        printer.isLeapYear(2021);
        printer.isLeapYear(2024);
    }
}
