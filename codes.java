import java.util.Scanner; //java.util.scanner package

public class MonthToDaysConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the month: ");
        String monthName = scanner.nextLine();
        scanner.close();

        int numberOfDays = getNumberOfDays(monthName);

        if (numberOfDays != -1) {
            System.out.println("Number of days in " + monthName + " is: " + numberOfDays);
        } else {
            System.out.println("Invalid month name. Please enter a valid month name.");
        }
    }

    private static int getNumberOfDays(String monthName) {
        switch (monthName.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;
            case "april":
            case "june":
            case "september":
            case "november":
                return 30;
            case "february":
                return 28; // For simplicity, not considering leap years in this example
            default:
                return -1; // Invalid month name
        }
    }
}
