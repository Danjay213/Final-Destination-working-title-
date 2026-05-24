import java.io.PrintWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GameLogger {

    private static final String LOG_FILE = "game_log.txt";

    public static void logSession(String playerName, int deathCount, String outcome) {
        String entry = "[" + System.currentTimeMillis() + "]"
                     + "  Player: " + playerName
                     + "  |  Deaths: " + deathCount
                     + "  |  Outcome: " + outcome;

        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println(entry);
        } catch (Exception e) {
            System.out.println("Warning: could not save session — " + e.getMessage());
        }
    }

    public static void displayLog() {
        System.out.println("\n════ PAST SESSIONS ════");

        try {
            List<String> lines = Files.readAllLines(Paths.get(LOG_FILE));
            if (lines.isEmpty()) {
                System.out.println("No sessions recorded yet.");
            } else {
                for (String line : lines) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println("No session log found. Play a round first!");
        }

        System.out.println("═══════════════════════\n");
    }
}