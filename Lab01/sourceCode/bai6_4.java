import java.util.Scanner;

public class bai6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year = -1;
        int monthIndex = -1; 

        while (true) {
            System.out.print("Enter a month (Name, Abbreviation, or Number): ");
            monthInput = scanner.nextLine().trim();
            
            System.out.print("Enter a year (e.g., 2023): ");
            String yearInput = scanner.nextLine().trim();

            try {
                year = Integer.parseInt(yearInput);
                if (year < 0) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Invalid year. Please enter a non-negative full-digit year.");
                continue;
            }

            monthIndex = getMonthIndex(monthInput);
            
            if (monthIndex == -1) {
                System.out.println("Invalid month. Try again (e.g., January, Jan., Jan, or 1).");
                continue;
            }

            int days = getDaysInMonth(monthIndex, year);
            System.out.println("The number of days is: " + days);
            break; 
        }
        scanner.close();
    }

    private static int getMonthIndex(String input) {
        String s = input.toLowerCase().replace(".", "");
        
        if (s.equals("january") || s.equals("jan") || s.equals("1")) return 1;
        if (s.equals("february") || s.equals("feb") || s.equals("2")) return 2;
        if (s.equals("march") || s.equals("mar") || s.equals("3")) return 3;
        if (s.equals("april") || s.equals("apr") || s.equals("4")) return 4;
        if (s.equals("may") || s.equals("5")) return 5;
        if (s.equals("june") || s.equals("jun") || s.equals("6")) return 6;
        if (s.equals("july") || s.equals("jul") || s.equals("7")) return 7;
        if (s.equals("august") || s.equals("aug") || s.equals("8")) return 8;
        if (s.equals("september") || s.equals("sep") || s.equals("9")) return 9;
        if (s.equals("october") || s.equals("oct") || s.equals("10")) return 10;
        if (s.equals("november") || s.equals("nov") || s.equals("11")) return 11;
        if (s.equals("december") || s.equals("dec") || s.equals("12")) return 12;
        
        return -1;
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }
}