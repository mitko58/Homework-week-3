import java.util.Random;
import java.util.Scanner;

public class HomeworkWeek3 {
    public static void main(String[] args) {
        printMovement();
        printFightingSystem();
        printIsBatteryOn();
        printCommunicate();
    }

    private static void printCommunicate() {
        for (int i = 10; i > 1 ; i-=2) {
            System.out.println("I am robotttt " +i);
        }
    }

    private static void printIsBatteryOn() {
        Random rn = new Random();
        int random1 = rn.nextInt(1000) + 1;
        int random2 = rn.nextInt(1000) + 1;
        if (random1>random2){
            System.out.println("Има ток в контакта");
        }else if (random2>random1){
            System.out.println("Няма ток в контакта");
        }
    }

    private static void printFightingSystem() {
        Scanner scanner = new Scanner(System.in);
        int battery = 4;
        int pixels = Integer.parseInt(scanner.nextLine());
        Random rn = new Random();
        int random = rn.nextInt(10) + 1;
        if (pixels % 2 == 0) {
            System.out.println("Мишката е засечена. Подготовка за атака!");
        }
        if (pixels % 2 == 0 && random == 5) {
            battery -= 1;
            System.out.println("Мебелите са изпотрошени");
            System.out.println();
        } else if (pixels % 2 == 0) {
            battery -= 1;
            System.out.println("Мишката е нокаутирана");
        } else {
            System.out.println("Пикселите не се делят на 2 без остатък");
        }
    }

    private static void printMovement() {
        Scanner scanner = new Scanner(System.in);
        String typeOfObject = scanner.nextLine();
        if (typeOfObject.equals("Wall")){
            System.out.println("Go Sideways");
        }else if (typeOfObject.equals("Chair")){
            System.out.println("Jump");
        }else if (typeOfObject.equals("Nothing")){
            System.out.println("Forward");
        }else{
            System.out.println("Skipped object");
        }
    }
}
