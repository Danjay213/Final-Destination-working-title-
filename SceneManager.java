public class SceneManager {
    private Scene scene1, scene2, scene3,
                  scene4, scene5, scene6;

    public void createScenes() {

       scene1 = new Scene(  
            1,  
            "You feel your usual path will kill you..."  
    );  

    scene1.addChoice(  
            new Choice(  
                    "Same Path",  
                    0,  
                    true,  
                    "Aircon falls on your head."  
            )  
    );  

    scene1.addChoice(  
            new Choice(  
                    "Different Path",  
                    2,  
                    false,  
                    null  
            )  
    );  

    
    // Scene 2  
    scene2 = new Scene(  
            2,  
            "A dog blocks your way..."  
    );  

    scene2.addChoice(  
            new Choice(  
                    "Feed Biscuit",  
                    0,  
                    true,  
                    "Dog got aggressive."  
            )  
    );  

    scene2.addChoice(  
            new Choice(  
                    "Pick Object",  
                    3,  
                    false,  
                    null  
            )  
    );  


    // Scene 3  
    scene3 = new Scene(  
            3,  
            "You are lost, phone dying..."  
    );  

    scene3.addChoice(  
            new Choice(  
                    "Talk to man",  
                    4,  
                    false,  
                    null  
            )  
    );  

    scene3.addChoice(  
            new Choice(  
                    "Enter alley",  
                    0,  
                    true,  
                    "Robber kills you."  
            )  
    );  

    scene3.addChoice(  
            new Choice(  
                    "Wait",  
                    0,  
                    true,  
                    "Dogs find you."  
            )  
    );  

    scene3.addChoice(  
            new Choice(  
                    "Sing song",  
                    0,  
                    true,  
                    "Man stabs you."  
            )  
    );  

    // Scene 4  
    scene4 = new Scene(  
            4,  
            "The man misleads you..."  
    );  

    scene4.addChoice(  
            new Choice(  
                    "Run",  
                    0,  
                    true,  
                    "You fall."  
            )  
    );  

    scene4.addChoice(  
            new Choice(  
                    "Shout",  
                    0,  
                    true,  
                    "Dogs hear you."  
            )  
    );  

    scene4.addChoice(  
            new Choice(  
                    "Climb gate",  
                    0,  
                    true,  
                    "You fall."  
            )  
    );  

    scene4.addChoice(  
            new Choice(  
                    "Confront man",  
                    5,  
                    false,  
                    null  
            )  
    );  

    // Scene 5  
    scene5 = new Scene(  
            5,  
            "You are close to home..."  
    );  

    scene5.addChoice(  
            new Choice(  
                    "Run home",  
                    0,  
                    true,  
                    "Hit by car."  
            )  
    );  

    scene5.addChoice(  
            new Choice(  
                    "Walk safely",  
                    6,  
                    false,  
                    null  
            )  
    );  

    // Scene 6  
    scene6 = new Scene(  
            6,  
            "...\nEverything goes silent.\nThe world fades to black."  
    );  

    scene6.addChoice(  
            new Choice(  
                    "A",  
                    0,  
                    false,  
                    null  
            )  
    );  

    scene6.addChoice(  
            new Choice(  
                    "B",  
                    0,  
                    false,  
                    "Explosion ending"  
            )  
    );  
}
public Scene getScene(int id) {

        switch(id) {

            case 1:
                return scene1;

            case 2:
                return scene2;

            case 3:
                return scene3;

            case 4:
                return scene4;

            case 5:
                return scene5;

            case 6:
                return scene6;

            default:
                return null;
        }
    }
}
    
