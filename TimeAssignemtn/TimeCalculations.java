import java.util.Scanner;

public class TimeCalculations {
    // Static Env vars because everything is placed in main.
    static Scanner scanner = new Scanner(System.in);
    static String[] timeFormats = { "Days", "Hours", "Minutes", "Seconds" };
    
    //Contains the steps neccesary to convert each time type to seconds
    static int[] conversionValues = { 24 * 60 * 60, 60 * 60, 60, 1 }; 

    public static void main(String[] args) {

        System.out.println("Select a mode:\n 1) conversion \n 2) comparison");
        String mode = scanner.nextLine();

        if (mode.equals("conversion") | mode.equals("1")) {
            conversionMenu();

        } else if (mode.equals("comparison") | mode.equals("2")) {
            comparisonMenu();
        }

    }

    public static void conversionMenu() {
        int formatOfTime = askTimeFormat();
        int unitAmount = askUnitAmount(formatOfTime);
        System.out.println("Time spent is: ");
        System.out.println(generateConversionString(formatOfTime, unitAmount)); 
            
    }

    public static void comparisonMenu() {
        int formatOfTime1 = askTimeFormat();
        int unitAmount1 = askUnitAmount(formatOfTime1);

        int formatOfTime2 = askTimeFormat();
        int unitAmount2 = askUnitAmount(formatOfTime2);

        int unit1InSeconds = unitAmount1 * conversionValues[formatOfTime1];
        int uni2InSeconds = unitAmount2 * conversionValues[formatOfTime2];

        if (unit1InSeconds > uni2InSeconds) {
            System.out.println("value " + unitAmount1 + " " +timeFormats[formatOfTime1]+ " is higher");
        } else if (uni2InSeconds > unit1InSeconds) {
            System.out.println("value " + unitAmount2 + " " +timeFormats[formatOfTime2]+ " is higher");
        } else {
            System.out.println("Both values are equal");
        }
    }

    // Helper methods
    /**
     * Handles user input for the time type
     * @return TimeFormat[] index containing the selected time type
     */
    public static int askTimeFormat() {
        System.out.println("Options:");
        System.out.println("Please input the time type:");
        for (int x = 1; x < timeFormats.length; x++) {
            System.out.println(" "+(x) + ")" + timeFormats[x]);
        }
        int output = scanner.nextInt();
        scanner.nextLine();
        return output;
    }

    /**
     * Handles user the time amount
     * @return int containing the input amount
     */
    public static int askUnitAmount(int timeFormatIndex) {
        System.out.println("Please input the number of " + timeFormats[timeFormatIndex] + " spent:");
        int output = scanner.nextInt();
        scanner.nextLine();
        return output;
    }

    /**
     * Converts a timeFormat index and a amount of the selected timeFormat into a human readable string.
     * @param timeFormat
     * @param timeAmount
     */
    public static String generateConversionString(int timeFormat, int timeAmount) {
        String output = "";
        //Convert naar seconden
        int totalSeconds = timeAmount * conversionValues[timeFormat];

        //Loop door alle types heen en skip als het type geen waarde heeft
        //Dit werkt doordat het grootste type als eerst in de array staat
        for (int i = 0; i <= timeFormat; i++) {
            int currentValue = totalSeconds / conversionValues[i];
            if (currentValue > 0) {
                //Voeg de waarde toe aan de output string
                output +=  currentValue + " "+ timeFormats[i]+ " ";
                //verwijder de gebruikte secondes
                totalSeconds -= currentValue * conversionValues[i];
            }
        }
        return output;
    }

}
