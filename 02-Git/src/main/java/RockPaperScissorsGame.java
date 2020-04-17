import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    private enum Weapon {
        R("rock"),
        P("paper"),
        S("scissors");

        private final String name;

        Weapon(String name) {
            this.name = name;
        }
    }

    private static Map<Integer, Weapon> WEAPONS_MAP = new HashMap<>();

    static {
        WEAPONS_MAP.put(0, Weapon.R);
        WEAPONS_MAP.put(1, Weapon.P);
        WEAPONS_MAP.put(2, Weapon.S);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please, choose: rock (r) - paper (p) - scissors (s) or exit (e)");

            Scanner consoleScanner = new Scanner(System.in);
            String usersInput = consoleScanner.next();

            if (usersInput.equals("e")) {
                System.exit(0);
            }
            Weapon usersWeapon = Weapon.valueOf(usersInput.toUpperCase());
            Weapon programsOption = WEAPONS_MAP.get(new Random().nextInt(3));

            switch (usersWeapon) {
                case R:
                    System.out.println(String.format("You choose rock, I choose %s", programsOption.name));
                    checkRock(programsOption);
                    break;
                case P:
                    System.out.println(String.format("You choose paper, I choose %s", programsOption.name));
                    checkPaper(programsOption);
                    break;
                case S:
                    System.out.println(String.format("You choose scissors, I choose %s", programsOption.name));
                    checkScissors(programsOption);
                    break;
            }
        }
    }

    private static void checkScissors(Weapon programsOption) {
        switch (programsOption) {
            case S:
                System.out.println("The game is tied");
                break;
            case R:
                System.out.println("I win: rock crushes scissors");
                break;
            case P:
                System.out.println("You win: scissors cuts paper");
                break;
        }
    }

    private static void checkPaper(Weapon programsOption) {
        switch (programsOption) {
            case P:
                System.out.println("The game is tied");
                break;
            case R:
                System.out.println("You win: paper covers rock");
                break;
            case S:
                System.out.println("I win: scissors cuts paper");
                break;
        }
    }

    private static void checkRock(Weapon programsOption) {
        switch (programsOption) {
            case R:
                System.out.println("The game is tied");
                break;
            case P:
                System.out.println("I win: paper covers rock");
                break;
            case S:
                System.out.println("You win: rock crushes scissors");
                break;
        }
    }

}