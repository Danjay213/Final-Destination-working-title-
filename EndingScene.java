<<<<<<< HEAD
    public class EndingScene extends Scene {
 
    public EndingScene(String id, String narrative) {
        super(id, narrative);
    }
 
    @Override
    public String getSceneType() {return "ENDING";
 
     }
 
    @Override
    public boolean isGameOver()  { return false; }
 
    @Override
    public boolean isEnding()    { return true; }  
}

=======
public class EndingScene extends Scene {

    public EndingScene(String id, String narrative) {
        super(id, narrative);
    }

    @Override
    public String getSceneType() {return "ENDING";

     }

    @Override
    public boolean isGameOver()  { return false; }

    @Override
    public boolean isEnding()    { return true; }   
}
>>>>>>> fe76ab7deed45ce469b8538d9df06615c8299bb7
