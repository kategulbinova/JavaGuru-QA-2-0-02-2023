package homeworks; //current java class location

public class MyHamsterAge { //new java class created
    public static void main(String[] args){ //created runnable main method
        int myAge = 40; // my age
        float hamsterAge = 1.9F; //  my hamster age
        float hamsterHumanAge; // declaring variable for my hamster age in human years
        float ageDifference; // difference between my age and my hamster age
        hamsterHumanAge = hamsterAge*25; // calculation of previous variable
        ageDifference = hamsterHumanAge - myAge;
        System.out.print("My hamster age in humane years is : " ); //print text inside brackets
        System.out.println(hamsterHumanAge); // print the result of hamster age in human years
        System.out.print("My hamster is older than me for : " ); //print text inside brackets
        System.out.print(ageDifference+" years"); // print the result of hamster age in human years
    }

}