package lesson5;

public class WeekDayCase {
    public static void main(String[] args) {
        int dayNum = 3;
        String dayOfTheWeek;

        switch (dayNum) {
            case 1:
                dayOfTheWeek = "Monday";
                break;
            case 2:
                dayOfTheWeek = "Tuesday";
                break;
            case 3:
                dayOfTheWeek = "Wednesday";
                break;
            case 4:
                dayOfTheWeek = "Thursday"; // second method
                break;
            case 5:
                dayOfTheWeek = "Friday";
                break;
            default: dayOfTheWeek = "Unknown day"; break;
        }
        System.out.println("Today is" + dayOfTheWeek);
    }
}