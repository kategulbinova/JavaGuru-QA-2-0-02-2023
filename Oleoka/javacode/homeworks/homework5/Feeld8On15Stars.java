package homeworks.homework5;

public class Feeld8On15Stars {
    public static void main(String[] args) {
        String star = "*";//Null

        for (int a = 0 ;a <= 7; a++)
        {
            System.out.println(star.concat(star).concat(star).concat(star).concat(star).concat(star).concat(star).concat(star).concat(star).concat(star).concat(star).concat(star).concat(star).concat(star).concat(star));

        }
        System.out.println("The end");

        for (int y= 0; y<8; y++){
            for (int x = 0; x<15; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
