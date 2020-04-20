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

    private static Map<Integer, Weapon> NUMBERED_WEAPONS_MAP = new HashMap<>();

    static {
        NUMBERED_WEAPONS_MAP.put(0, Weapon.R);
        NUMBERED_WEAPONS_MAP.put(1, Weapon.P);
        NUMBERED_WEAPONS_MAP.put(2, Weapon.S);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please, choose: rock (r) - paper (p) - scissors (s) or exit (e)");

            Weapon usersWeapon = readUsersWeapon();
            Weapon randomWeapon = getRandomWeapon();

            System.out.println(String.format("You choose %s, I choose %s", usersWeapon.name, randomWeapon.name));
            fight(usersWeapon, randomWeapon);
        }
    }

    private static Weapon readUsersWeapon() {
        Scanner consoleScanner = new Scanner(System.in);
        String usersInput = consoleScanner.next();
        if (usersInput.equals("e")) {
            System.out.println("Bye!");
            System.exit(0);
        }
        return Weapon.valueOf(usersInput.toUpperCase());
    }

    private static Weapon getRandomWeapon() {
        return NUMBERED_WEAPONS_MAP.get(new Random().nextInt(3));
    }

    private static void fight(Weapon usersWeapon, Weapon opponentWeapon) {
        switch (usersWeapon) {
            case R:
                rockBeats(opponentWeapon);
                break;
            case P:
                paperBeats(opponentWeapon);
                break;
            case S:
                scissorsBeats(opponentWeapon);
                break;
        }
    }

    private static void rockBeats(Weapon opponentWeapon) {
        switch (opponentWeapon) {
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

    private static void paperBeats(Weapon opponentWeapon) {
        switch (opponentWeapon) {
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

    private static void scissorsBeats(Weapon opponentWeapon) {
        switch (opponentWeapon) {
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

}
