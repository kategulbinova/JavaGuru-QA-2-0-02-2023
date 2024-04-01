package Lessons.lesson5;

public class PrintWeekNameDay {
    public static void main(String[] args) {

        int dayNum = 1;
        String dayOfTheWeek;

        switch (dayNum) {
            case 1: dayOfTheWeek = "Monday";      break;
            case 2: dayOfTheWeek = "Tuesday";     break;
            case 3: dayOfTheWeek = "Wednesday";   break;
            case 4: dayOfTheWeek = "Thursday";    break;
            case 5: dayOfTheWeek = "Friday";      break;
            case 6: dayOfTheWeek = "Saturday";    break;
            case 7: dayOfTheWeek = "Sunday";      break;
            default:dayOfTheWeek = "unknown day"; break;
        }
        System.out.println("Today is " +dayOfTheWeek );
    }
}
