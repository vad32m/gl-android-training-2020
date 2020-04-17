import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    private static Map<Integer, String> WEAPONS_MAP = new HashMap<>();

    static {
        WEAPONS_MAP.put(0, "rock");
        WEAPONS_MAP.put(1, "paper");
        WEAPONS_MAP.put(2, "scissors");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please, choose: rock (r) - paper (p) - scissors (s) or exit (e)");
            Scanner consoleScanner = new Scanner(System.in);

            String usersOption = consoleScanner.next();
            String programsOption = WEAPONS_MAP.get(new Random().nextInt(3));

            switch (usersOption) {
                case "r":
                    System.out.println(String.format("You choose rock, I choose %s", programsOption));
                    checkRock(programsOption);
                    break;
                case "p":
                    System.out.println(String.format("You choose paper, I choose %s", programsOption));
                    checkPaper(programsOption);
                    break;
                case "s":
                    System.out.println(String.format("You choose scissors, I choose %s", programsOption));
                    checkScissors(programsOption);
                    break;
                case "e":
                    System.exit(0);
            }
        }
    }

    private static void checkScissors(String programsOption) {
        switch (programsOption) {
            case "scissors":
                System.out.println("The game is tied");
                break;
            case "rock":
                System.out.println("I win: rock crushes scissors");
                break;
            case "paper":
                System.out.println("You win: scissors cuts paper");
                break;
        }
    }

    private static void checkPaper(String programsOption) {
        switch (programsOption) {
            case "paper":
                System.out.println("The game is tied");
                break;
            case "rock":
                System.out.println("You win: paper covers rock");
                break;
            case "scissors":
                System.out.println("I win: scissors cuts paper");
                break;
        }
    }

    private static void checkRock(String programsOption) {
        switch (programsOption) {
            case "rock":
                System.out.println("The game is tied");
                break;
            case "paper":
                System.out.println("I win: paper covers rock");
                break;
            case "scissors":
                System.out.println("You win: rock crushes scissors");
                break;
        }
    }

}