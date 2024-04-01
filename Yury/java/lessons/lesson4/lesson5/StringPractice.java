package lessons.lesson4.lesson5;

public class StringPractice {
    public static void main(String[] args) {
        int dayNum=71;
        String dayOfTheWeek;
        switch (dayNum) {
            case 6: dayOfTheWeek ="Saturday"; break;
            case 7: dayOfTheWeek ="Sunday"; break;
            default: dayOfTheWeek ="Looking forward to the weekend"; break;
                    //for all the other variables. The system doesn't know the info
        }
        System.out.println(dayOfTheWeek);
    }
}
