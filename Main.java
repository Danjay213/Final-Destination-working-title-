<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 4a8cfae41468c263580894222266b99ab0426728

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD

        Scanner scanner = new Scanner(System.in);

        System.out.println("════════════════════════════════════════════════════════════════");
        System.out.println("                     FINAL DESTINATION");
        System.out.println("════════════════════════════════════════════════════════════════");
        System.out.println();

        System.out.print("Enter your name, Player: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            name = "Player";
        }

        new GameEngine(name).run();

        scanner.close();
=======
        GameEngine game = new GameEngine();
        game.startGame();
 
>>>>>>> 4a8cfae41468c263580894222266b99ab0426728
    }
}