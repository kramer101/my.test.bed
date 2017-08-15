package my.test.bed.misc;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.RandomUtils;

public class MontyHall {

    private Set<Integer> choices = new HashSet<>();

    {
        choices.add(1);
        choices.add(2);
        choices.add(3);
    }

    public static void main(String[] args) {
        MontyHall exec = new MontyHall();

        exec.run();
    }



    private void run() {
        Player player = new Player();
        Host host = new Host();
        Set<Integer> remainingChoices = host.getDoorsToTry();

        Scanner scanner = new Scanner(System.in);

        int userDoorSelection = player.getDoorSelection(remainingChoices, scanner, System.out);

        String userAction = player.getUserAction(scanner, System.out);
        boolean keep = userAction.equalsIgnoreCase("keep");

        host.playResults(System.out, keep, userDoorSelection, remainingChoices);

    }





    class Host {
        private int winner = RandomUtils.nextInt(1, 4);

        Set<Integer> getDoorsToTry() {
            Set<Integer> remainingSet =
                    choices.stream().filter(value -> value != winner).collect(Collectors.toSet());

            Set<Integer> doorsToTry = new HashSet<>();
            //add a winning door to the set
            doorsToTry.add(winner);

            //now randomly select the remaining two doors
            int randomIndex = RandomUtils.nextInt(0, 2);
            int index = 0;
            for (Integer i : remainingSet) {
                if (index == randomIndex) {
                    doorsToTry.add(i);
                    break;
                }
                index++;
            }
            return doorsToTry;
        }

        void playResults(final PrintStream printStreamParam, final boolean keep, final int userDoorSelection,
                         final Set<Integer> remainingChoices) {
            int finalSelection = getRemainingDoor(keep, userDoorSelection, remainingChoices);

            printStreamParam.println(finalSelection ==  winner ? "WON!" : "LOST");
        }

        private int getRemainingDoor(final boolean keep,
                                     final int userDoorSelection,
                                     final Set<Integer> remainingChoices) {
            if (keep) return userDoorSelection;
            remainingChoices.removeIf(integerParam -> integerParam == userDoorSelection);
            return remainingChoices.iterator().next();
        }
    }

    class Player {

        private int userDoorSelection = -1;

        String getUserAction(final Scanner scanner, final PrintStream printStreamParam) {
            String userAction = "";

            do  {
                printStreamParam.println("You selected door " + userDoorSelection + ". Would you like to keep or switch?");
                userAction = scanner.next();
            } while (!isSelectedActionValid(userAction));

            return userAction;
        }

        private boolean isSelectedActionValid(final String userAction) {
            return userAction.equalsIgnoreCase("keep")
                    || userAction.equalsIgnoreCase("switch");
        }


        int getDoorSelection(final Set<Integer> remainingChoices, final Scanner scanner, final PrintStream printStreamParam) {

            do {
                printStreamParam.println("Choose door " + remainingChoices + ": ");
                if (scanner.hasNextInt()) {
                    userDoorSelection = scanner.nextInt();
                } else {
                    String input = scanner.nextLine();
                    printStreamParam.println("\"" + input + "\" is invalid input");
                }

            } while (!remainingChoices.contains(userDoorSelection));

            return userDoorSelection;
        }
    }
}
