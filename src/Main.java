import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Woman woman = new Woman();


        System.out.println("Hej och välkommen till Hissen!");
                System.out.println("Spelet handlar om dig som åker upp i en hiss till ditt nya jobb och att den ligger på våningsplan 50");
        System.out.println();


        while (true) {

            System.out.println("Välj vilken våningsplan du vill åka till..");
            int floor = scanner.nextInt();

            if (floor >= 1 && floor <= 16) {
                System.out.println("Här kommer kvinnan");
                System.out.println(woman.getWomanBackground());


            } else if (floor >= 17 && floor <= 36) {
                System.out.println("Här kommer mannen");
                System.out.println();
            } else if
                (floor >= 37 && floor <= 49) {
                    System.out.println("Gamla damen kommer");
                }
            }
        }


    }
