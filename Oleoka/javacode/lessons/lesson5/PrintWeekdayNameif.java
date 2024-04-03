package lessons.lesson5;

public class PrintWeekdayNameif {
    public static void main(String[] args) {
        int dayName = 4;

        String  dayOfTheWeek; // Null
    switch (dayName){
        case 1: dayOfTheWeek = " Monday";break;
        case 2: dayOfTheWeek =  " Wednesday";break;
        case 3: dayOfTheWeek =  " KK";break;
        case 4: dayOfTheWeek = " 4";break;
        case 5: dayOfTheWeek = " Friday";break;
        case 6: dayOfTheWeek =  "Saturday";break;
        default: dayOfTheWeek = "UnknowDay"; break;

    }
        System.out.println("Today is " + dayOfTheWeek );


    }

}

