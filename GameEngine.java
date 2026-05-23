
import java.util.Scanner;

<<<<<<< HEAD
public class GameEngine {

    private Scene[] scenes;
    Scanner scanner = new Scanner(System.in);
    
    public GameEngine(String playerName){
        scenes = StoryBuilder.buildScenes(playerName);
    }

    public void run(){

        while (true){
            clearScreen();
            showMenu();

            String input = ask("Choice: ");
            input = input.toUpperCase();

            if(input.equals("A")){
                startGame();
            }else if(input.equals("B")){
                System.out.println("\nThanks for playing!");
                break;
            }else{
                System.out.println("Invalid choice.");
            }
        }
    }

    private void startGame(){

        String current = "PREAMBLE";

=======

public class GameEngine {

        Scanner sc = new Scanner(System.in);
 
        GameObject currentScene;
 
        Scene scene1, scene2, scene3, scene4, scene5, scene6;
 

    public void startGame() {

        createScenes();
 
>>>>>>> 4a8cfae41468c263580894222266b99ab0426728
        while (true) {

            Scene scene = getScene(current);

            if (scene == null) {
                System.out.println("Scene not found.");
                return;
            }

            clearScreen();

            System.out.println("────────────────────────────────────────");
            printSlowly(scene.getNarrative());

            if (scene.isGameOver()) {
                gameOver();
                return;
            }

            if (scene.isEnding()) {
                ending();
                return;
            }

            System.out.println();

            Choice[] choices = scene.getChoices().toArray(new Choice[0]);

            for(int i = 0; i < choices.length; i++){
                System.out.println(
                    choices[i].getLabel() + ". " + choices[i].getText()
                );
            }

            if(scene.getHint() != null){
                System.out.println("H. Hint");
            }

            String nextScene = null;

            while(nextScene == null){

                String input = ask("\nChoice: ");
                input = input.toUpperCase();

                if (input.equals("H") && scene.getHint() != null) {
                    System.out.println("\nHint: " + scene.getHint());
                    continue;
                }

                for(int i = 0; i < choices.length; i++){

                    if(input.equals(choices[i].getLabel())){
                        nextScene = choices[i].getNextSceneId();
                    }
                }
<<<<<<< HEAD

                if(nextScene == null){
                    System.out.println("Invalid choice.");
                }
            }

            if(nextScene.equals("MENU")){
                return;
            }

            current = nextScene;
        }
    }

    private Scene getScene(String id){

        for(int i = 0; i < scenes.length; i++){
            if(scenes[i].getId().equals(id)){
                return scenes[i];
            }
        }

        return null;
    }

    private void showMenu(){

        System.out.println("════════════════════════════════════════");
        System.out.println("           FINAL DESTINATION");
        System.out.println("════════════════════════════════════════");
        System.out.println();

        System.out.println("A. Start");
        System.out.println("B. Quit");
        System.out.println();
    }
    
    private void gameOver(){

        System.out.println("\nGAME OVER");
        System.out.println("Press ENTER to continue...");
        scanner.nextLine();
    }

    private void ending(){

        System.out.println("\nPress ENTER to continue...");
        scanner.nextLine();
    }

    private String ask(String text){

        System.out.print(text);
        return scanner.nextLine().trim();
    }

    private void clearScreen(){

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void printSlowly(String text){

        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            System.out.print(c);

            try{
                Thread.sleep(20);
         }
                catch (InterruptedException e){
                }
        }

        System.out.println();
=======
 
            } else if (mainChoice.equals("B")) {
 
                System.out.println("Thanks for playing!");
                System.exit(0);
 
            } else {
 
                System.out.println("Invalid choice.");
 
            }
        }
    }
 
    public boolean processChoice(Choice choice) {
 
        if (choice.isGameOver()) {
 
            System.out.println("\n" + choice.getDeathMessage());
            System.out.println("\nGame Over!\n");
 
            return false;
 
        }
 
        if (((Scene) currentScene).getId() == 6) {
 
            if (choice.getDescription().equals("B")) {
 
                System.out.println("\nThe house explodes out of nowhere...");
 
            }
 
            System.out.println("Returning to main menu...");
 
            return false;
 
        }
 
        if (choice.getNextScene() == 1) currentScene = scene1;
        else if (choice.getNextScene() == 2) currentScene = scene2;
        else if (choice.getNextScene() == 3) currentScene = scene3;
        else if (choice.getNextScene() == 4) currentScene = scene4;
        else if (choice.getNextScene() == 5) currentScene = scene5;
        else if (choice.getNextScene() == 6) currentScene = scene6;
 
        return true;
    }
 
    public void createScenes() {
        // Scene 1
        scene1 = new Scene(1,"You feel your usual path will kill you...");
 
        scene1.addChoice(new Choice("Same Path",0,true,"Aircon falls on your head."));
        scene1.addChoice(new Choice("Different Path",2,false,null));
      
        // Scene 2
        scene2 = new Scene(2,"A dog blocks your way...");
 
        scene2.addChoice(new Choice("Feed Biscuit",0,true,"Dog got aggressive."));
        scene2.addChoice(new Choice("Pick Object",3,false,null));

        // Scene 3
        scene3 = new Scene(3,"You are lost, phone dying...");
 
        scene3.addChoice(new Choice("Talk to man",4,false,null));
        scene3.addChoice(new Choice("Enter alley",0,true,"Robber kills you."));
        scene3.addChoice(new Choice("Wait",0,true,"Dogs find you."));
        scene3.addChoice(new Choice("Sing song",0,true,"Man stabs you."));
 
        // Scene 4
        scene4 = new Scene(4,"The man misleads you...");
 
        scene4.addChoice(new Choice("Run",0,true,"You fall."));
        scene4.addChoice(new Choice("Shout",0,true,"Dogs hear you."));
        scene4.addChoice(new Choice("Climb gate",0,true,"You fall."));
        scene4.addChoice(new Choice("Confront man",5,false,null));
 
        // Scene 5
        scene5 = new Scene(5,"You are close to home...");
 
        scene5.addChoice(new Choice("Run home",0,true,"Hit by car."));
        scene5.addChoice(new Choice("Walk safely",6,false,null));
 
        // Scene 6
        scene6 = new Scene(6,"...\nEverything goes silent.\nThe world fades to black.");
 
        scene6.addChoice(new Choice("A",0,false,null));
        scene6.addChoice(new Choice("B",0,false,"Explosion ending"));
>>>>>>> 4a8cfae41468c263580894222266b99ab0426728
    }
}