package lessons.lesson5;

public class PrintWeekdayName {
    public static void main(String[] args) {
        int dayNam = 7;
        String dayOfTheWeek; // Null
        Boolean isWeekend; // true or false
            switch (dayNam){

                case 6:dayOfTheWeek ="Saturday"; isWeekend = true;break;
                case 7:dayOfTheWeek ="Sunday";isWeekend = true;break;
                default:dayOfTheWeek ="Looking forward to the weekend!";isWeekend = false; break;
            }
            if (isWeekend){
                System.out.println("Today is " + dayOfTheWeek);
            } else {
                System.out.println(dayOfTheWeek);
            }

        System.out.println( "Length of the weekday name is : " + dayOfTheWeek.length());



    }
}
