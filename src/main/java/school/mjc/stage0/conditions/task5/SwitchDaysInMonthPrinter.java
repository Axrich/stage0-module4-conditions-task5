package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        int daysInMonth;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                System.out.println("Invalid month");
                return;
        }

        System.out.println("Number of days in month " + month + ": " + daysInMonth);
    }

    public static void main(String[] args) {
        SwitchDaysInMonthPrinter printer = new SwitchDaysInMonthPrinter();
        printer.amountOfDays(7);
    }
}
