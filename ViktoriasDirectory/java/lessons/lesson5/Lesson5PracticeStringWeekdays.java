package Lessons.lesson5;

public class Lesson5PracticeStringWeekdays {
    public static void main(String[] args) {
        int dayNum = 6;
        String dayOfTheWeek; //Null
        boolean isWeekend; //true or false


        switch (dayNum) {
            case 1: dayOfTheWeek = "Monday"; isWeekend = false; break;
            case 2: dayOfTheWeek = "Tuesday"; isWeekend = false; break;
            case 3: dayOfTheWeek = "Wednesday"; isWeekend = false; break;
            case 4: dayOfTheWeek = "Thursday"; isWeekend = false; break;
            case 5: dayOfTheWeek = "Friday"; isWeekend = false; break;
            case 6: dayOfTheWeek = "Saturday"; isWeekend = true; break;
            case 7: dayOfTheWeek = "Sunday"; isWeekend = true; break;
            default: dayOfTheWeek = "Unknown day"; isWeekend = false; break;
        }
        if (isWeekend) {
            System.out.println("Today is " + dayOfTheWeek);
        } else {
            System.out.println("Looking forward to the Weekend!");

        }
    }
}
