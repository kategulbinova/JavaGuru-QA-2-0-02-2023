package Lessons.lesson5;

public class PrintWeekdayName {
    public static void main(String[] args) {
        int dayNum = 5;
        if (dayNum == 1) {
            System.out.println("Monday");
        } else if (dayNum == 2) {
            System.out.println("Tuesday");
        } else if (dayNum == 3) {
            System.out.println("Wednesday");
        } else if (dayNum == 4) {
            System.out.println("Thursday");
        } else if (dayNum == 5) {
            System.out.println("Friday");
        } else if (dayNum == 6) {
            System.out.println("Saturday");
        } else if (dayNum == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day number");
        }

        if (dayNum == 1) {
            System.out.println("Monday");
        } else {
            if (dayNum == 2) {
                System.out.println("Tuesday");
            } else {
                if (dayNum == 3) {
                    System.out.println("Wednesday");
                } else {
                    if (dayNum == 4) {
                        System.out.println("Thursday");
                    } else {
                        if (dayNum == 5) {
                            System.out.println("Friday");
                        } else {
                            if (dayNum == 6) {
                                System.out.println("Saturday");
                            } else {
                                if (dayNum == 7) {
                                    System.out.println("Sunday");
                                } else {
                                    System.out.println("Invalid day number");
                                }
                            }
                        }
                    }
                }
            }
        }
        if (dayNum == 1) {
            System.out.println("Monday");
        }
        if (dayNum == 2) {
            System.out.println("Tuesday");
        }
        if (dayNum == 3) {
            System.out.println("Wednesday");
        }
        if (dayNum == 4) {
            System.out.println("Thursday");
        }
        if (dayNum == 5) {
            System.out.println("Friday");
        }
        if (dayNum == 6) {
            System.out.println("Saturday");
        }
        if (dayNum == 7) {
            System.out.println("Sunday");
        }
        if (dayNum < 1 || dayNum > 7) {
            System.out.println("Invalid day number");
        }
        String dayName;
        switch (dayNum) {
            case 1 -> dayName = "Monday";
            case 2 -> dayName = "Tuesday";
            case 3 -> dayName = "Wednesday";
            case 4 -> dayName = "Thursday";
            case 5 -> dayName = "Friday";
            case 6 -> dayName = "Saturday";
            case 7 -> dayName = "Sunday";
            default -> dayName = "Invalid day number";
        }
        System.out.println(dayName);

        dayNum = 6;
        switch (dayNum) {
            case 1, 2, 3, 4, 5 -> dayName = "Looking forward to the weekend";
            case 6, 7 -> dayName = "Weekend!";
            default -> dayName = "Invalid day number";
        }
        System.out.println(dayName);
    }
}
