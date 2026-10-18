import java.util.Scanner;
import java.util.Random;

public class practice {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("[Server] What is your name?");
        System.out.print("\n\nEnter your name: ");
        String name = scanner.nextLine();
        System.out.print("\n[Server] Greetings, " + name + "!");

        System.out.print("\n\nTreasure Chest Gacha");
        System.out.print("\n====================");
        System.out.print("\n1. Open a Chest");
        System.out.print("\n2. Exit");
        System.out.print("\n====================\n");
        System.out.print(name + ": ");
        int menuAnswer = scanner.nextInt();

        switch (menuAnswer) {

            case 1:
                openChest();
                break;

            case 2:
                System.out.print("\n[Server] Thank you for playing!");
                break;

            default:
                System.out.print("Invalid Answer!");
        }

        scanner.close();

    }

    static void openChest() throws InterruptedException {

        System.out.print("\n[Server] Opening Treasure Chest...\n\n");

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(500);
        }

        Random random = new Random();

        int reward = random.nextInt(3) + 1;

        System.out.print("\n[Server] You opened a Treasure Chest!");

        switch (reward) {

            case 1:
                System.out.print("\n\n[Server] You found 3 Bronze coins!");
                break;

            case 2:
                System.out.print("\n\n[Server] You found 1 Common Sword!");
                break;

            case 3:
                System.out.print("\n\n[Server] You found 1 Health Potion!");

        }
    }
}