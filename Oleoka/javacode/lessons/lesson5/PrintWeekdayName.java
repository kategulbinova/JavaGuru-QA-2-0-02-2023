package lessons.lesson5;

public class PrintWeekdayName {
    public static void main(String[] args) {
        int dayNam = 6;
        String dayOfTheWeek; // Null
            switch (dayNam){
                case 1:dayOfTheWeek ="Looking"; break;
                case 2:dayOfTheWeek ="Looking"; break;
                case 3:dayOfTheWeek ="Looking"; break;
                case 4:dayOfTheWeek ="Looking"; break;
                case 5:dayOfTheWeek ="Looking"; break;
                case 6:dayOfTheWeek ="Saturday";break;
                case 7:dayOfTheWeek ="Sunday";break;
                default:dayOfTheWeek ="Unknow Day"; break;
            }
                System.out.println("Today is"  + dayOfTheWeek);




    }
}
