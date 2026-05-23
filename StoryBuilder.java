public class StoryBuilder {
 
    public static Scene[] buildScenes(String playerName) {
 
        Scene[] scenes = new Scene[25]; 
 
        int i = 0;
 
        // ── PREAMBLE ─────────────────────────────────────
        Scene preamble = new Scene(
                "PREAMBLE",
                StoryLines.PREAMBLE(playerName)
        );
        preamble.addChoice(new Choice("A", "Continue...", "SCENE_1"));
        scenes[i++] = preamble;
 
        // ── SCENE 1 ──────────────────────────────────────
        Scene s1 = new Scene(
                "SCENE_1",
                StoryLines.SCENE_1(playerName)
        );
        s1.setHint("But the same path feels so eerie...");
        s1.addChoice(new Choice("A", "Go straight", "DEATH_AC_FALL"));
        s1.addChoice(new Choice("B", "Trust instinct", "SCENE_2"));
        scenes[i++] = s1;
 
        // ── DEATH AC ─────────────────────────────────────
        Scene dAC = new Scene(
                "DEATH_AC_FALL",
                StoryLines.DEATH_AC_FALL(playerName)
        );
        dAC.setGameOver(true);
        scenes[i++] = dAC;
 
        // ── SCENE 2 ──────────────────────────────────────
        Scene s2 = new Scene(
                "SCENE_2",
                StoryLines.SCENE_2(playerName)
        );
        s2.addChoice(new Choice("A", "Feed dogs", "DEATH_DOG_BITE"));
        s2.addChoice(new Choice("B", "Defend yourself", "SCENE_3"));
        scenes[i++] = s2;
 
        // ── DEATH DOG ────────────────────────────────────
        Scene dDog = new Scene(
                "DEATH_DOG_BITE",
                StoryLines.DEATH_DOG_BITE(playerName)
        );
        dDog.setGameOver(true);
        scenes[i++] = dDog;
 
        // ── SCENE 3 ──────────────────────────────────────
        Scene s3 = new Scene(
                "SCENE_3",
                StoryLines.SCENE_3(playerName)
        );
 
        s3.addChoice(new Choice("A", "Trust man", "SCENE_4"));
        s3.addChoice(new Choice("B", "Alley", "DEATH_ALLEY_KNIFE"));
        s3.addChoice(new Choice("C", "Wait", "DEATH_DOGS_RETURN"));
        s3.addChoice(new Choice("D", "Sing", "DEATH_SINGING"));
 
        scenes[i++] = s3;
 
        // ── DEATH ALLEY ──────────────────────────────────
        Scene dAlley = new Scene(
                "DEATH_ALLEY_KNIFE",
                StoryLines.DEATH_ALLEY_KNIFE(playerName)
        );
        dAlley.setGameOver(true);
        scenes[i++] = dAlley;
 
        // ── DEATH DOG RETURN ─────────────────────────────
        Scene dDogs = new Scene(
                "DEATH_DOGS_RETURN",
                StoryLines.DEATH_DOGS_RETURN(playerName)
        );
        dDogs.setGameOver(true);
        scenes[i++] = dDogs;
 
        // ── DEATH SING ───────────────────────────────────
        Scene dSing = new Scene(
                "DEATH_SINGING",
                StoryLines.DEATH_SINGING(playerName)
        );
        dSing.setGameOver(true);
        scenes[i++] = dSing;
 
        // ── SCENE 4 ──────────────────────────────────────
        Scene s4 = new Scene(
                "SCENE_4",
                StoryLines.SCENE_4(playerName)
        );
 
        s4.addChoice(new Choice("A", "Run", "DEATH_SLIP"));
        s4.addChoice(new Choice("B", "Shout", "DEATH_SHOUT"));
        s4.addChoice(new Choice("C", "Climb", "DEATH_GATE"));
        s4.addChoice(new Choice("D", "Confront", "SCENE_5"));
 
        scenes[i++] = s4;
 
        // ── DEATH SLIP ───────────────────────────────────
        Scene dSlip = new Scene(
                "DEATH_SLIP",
                StoryLines.DEATH_SLIP(playerName)
        );
        dSlip.setGameOver(true);
        scenes[i++] = dSlip;
 
        // ── DEATH SHOUT ──────────────────────────────────
        Scene dShout = new Scene(
                "DEATH_SHOUT",
                StoryLines.DEATH_SHOUT(playerName)
        );
        dShout.setGameOver(true);
        scenes[i++] = dShout;
 
        // ── DEATH GATE ───────────────────────────────────
        Scene dGate = new Scene(
                "DEATH_GATE",
                StoryLines.DEATH_GATE(playerName)
        );
        dGate.setGameOver(true);
        scenes[i++] = dGate;
 
        // ── SCENE 5 ──────────────────────────────────────
        Scene s5 = new Scene(
                "SCENE_5",
                StoryLines.SCENE_5(playerName)
        );
 
        s5.addChoice(new Choice("A", "Run home", "DEATH_SPEEDING_CAR"));
        s5.addChoice(new Choice("B", "Walk carefully", "SCENE_6"));
 
        scenes[i++] = s5;
 
        // ── DEATH CAR ────────────────────────────────────
        Scene dCar = new Scene(
                "DEATH_SPEEDING_CAR",
                StoryLines.DEATH_SPEEDING_CAR(playerName)
        );
        dCar.setGameOver(true);
        scenes[i++] = dCar;
 
        // ── SCENE 6 ──────────────────────────────────────
        Scene s6 = new Scene(
                "SCENE_6",
                StoryLines.SCENE_6(playerName)
        );
 
        s6.addChoice(new Choice("A", "Choose A", "MENU"));
        s6.addChoice(new Choice("B", "Choose B", "ENDING_EXPLOSION"));
 
        scenes[i++] = s6;
 
        // ── ENDING ───────────────────────────────────────
        Scene end = new Scene(
                "ENDING_EXPLOSION",
                StoryLines.ENDING_EXPLOSION()
        );
        end.setEnding(true);
        scenes[i++] = end;
 
        return scenes;
    }
}