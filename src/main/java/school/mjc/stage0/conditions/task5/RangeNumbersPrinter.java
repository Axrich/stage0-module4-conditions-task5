package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Number is between 1 and 5");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Number is between 6 and 10");
                break;
            default:
                System.out.println("Out of range");
        }
    }

    public static void main(String[] args) {
        RangeNumbersPrinter printer = new RangeNumbersPrinter();

        printer.printRange(3);
        printer.printRange(8);
        printer.printRange(15);
    }
}
