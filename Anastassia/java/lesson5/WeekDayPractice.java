package lesson5;

public class WeekDayPractice {
    public static void main(String[] args) {
        int dayNum = 2;
        String dayOfTheWeek;

        switch (dayNum) {
            case 1:
                dayOfTheWeek = "Saturday";
                break;
            case 2:
                dayOfTheWeek = "Sunday";
                break;

            default:
                dayOfTheWeek = "Looking forward to the weekend";
                break;
        }
        System.out.println(dayOfTheWeek);

        System.out.println("Length of the weekday word is " + dayOfTheWeek.length());
    }
}