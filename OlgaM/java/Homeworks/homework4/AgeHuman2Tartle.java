package homework4;
public class AgeHuman2Tartle { // Create new Java class AgeHuman2Tartle

	public static void main (String[] args) { // Create runnable method main
	
		int agehuman  = 100; // Declare variables and initialize them with human's age in years 
		int agetartle = 5;  // Declare variables and initialize them with tartle’s age in years 
		/* Calculate your tartle’s age in «human» years
		based on assumption that one tartle’s year equals to 3 years of a human */
		int zooage = agetartle * 3;
		
		// The code below will print the words "Черепаший возраст: " to the screen
		System.out.println("Черепаший возраст: " + agetartle );
		// The code below will print the words "Человечий возраст: " to the screen
		System.out.println("Человечий возраст: " + agehuman );
		/* The code below will print the words "Черепаший возраст, умноженный 
		на 5, равен Человечьему в годах: " to the screen */
		System.out.println("Черепаший возраст, умноженный на 5, равен Человечьему в годах: " + zooage );
    }
}