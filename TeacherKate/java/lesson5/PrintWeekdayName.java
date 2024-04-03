package lesson5;

public class PrintWeekdayName {
    public static void main(String[] args) {
        int dayNum = -34;
        String dayOfTheWeek; //Null

        switch (dayNum) {
            case 1: dayOfTheWeek = "Monday"; break;
            case 2: dayOfTheWeek = "Tuesday"; break;
            case 3: dayOfTheWeek = "Wednesday"; break;
            case 4: dayOfTheWeek = "Thursday"; break;
            case 5: dayOfTheWeek = "Friday"; break;
            case 6: dayOfTheWeek = "Saturday"; break;
            case 7: dayOfTheWeek = "Sunday"; break;
            default: dayOfTheWeek = "Unknown day"; break;
        }
        System.out.println("Today is " + dayOfTheWeek);
    }
}
