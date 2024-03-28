package lessons.lesson5;

public class LookingForwardToTheWeekend {
    public static void main(String[] args) {

        int dayNum = 1;
        String dayOfTheWeek; //Null
        boolean isWeekend; // true or false

        switch (dayNum) {

            case 6: dayOfTheWeek = "Saturday"; isWeekend = true; break;
            case 7: dayOfTheWeek = "Sunday"; isWeekend = true; break;
            default: dayOfTheWeek = "Looking Forward To The Weekend"; isWeekend = false; break;
        }

        if (isWeekend) {
            System.out.println("Today is " +dayOfTheWeek );
    }   else {
            System.out.println(dayOfTheWeek);
        }
    }
}
