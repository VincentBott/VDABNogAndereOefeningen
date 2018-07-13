package org.betavzw;
/* Sinds java 7 mag een string gebruikt worden in een switch
 * bron: http://docs.oracle.com/javase/7/docs/technotes/guides/language/strings-switch.html
 */

public class SwitchWithString {
    public static void main(String[] args) {
        String dayOfWeek = "Tuesday";
        String typeOfDay;
        switch (dayOfWeek) {
            case "Monday":
                typeOfDay = "Start of work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Friday":
                typeOfDay = "End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
                typeOfDay = "Invalid day of the week";
        }
        System.out.println(typeOfDay);
    }

}
