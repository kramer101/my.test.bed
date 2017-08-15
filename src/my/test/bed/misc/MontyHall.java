package my.test.bed.misc;

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
        int winner = RandomUtils.nextInt(1, 4);
        System.out.println(winner);

        Set<Integer> remainingChoices = getDoorsToTry(winner);

        Scanner scanner = new Scanner(System.in);

        int userDoorSelection = -1;
        do {
            System.out.println("Choose door " + remainingChoices + ": ");
            userDoorSelection = scanner.nextInt();

        } while (!isDoorSelectionValid(remainingChoices, userDoorSelection));


        String userAction = "";

        do  {
            System.out.println("You selected door " + userDoorSelection + ". Keep or switch?");
            userAction = scanner.next();
        } while (!isSelectedActionValid(userAction));

        boolean keep = userAction.equalsIgnoreCase("keep");
        int finalSelection = getFinalSelection(keep, userDoorSelection, remainingChoices);


        System.out.println(finalSelection ==  winner ? "WON!" : "LOST");


    }

    private int getFinalSelection(final boolean keep,
                                  final int userDoorSelection,
                                  final Set<Integer> remainingChoices) {
        if (keep) return userDoorSelection;
        remainingChoices.removeIf(integerParam -> integerParam == userDoorSelection);
        return remainingChoices.iterator().next();
    }

    private boolean isSelectedActionValid(final String userAction) {
        return userAction.equalsIgnoreCase("keep")
                || userAction.equalsIgnoreCase("switch");
    }


    private boolean isDoorSelectionValid(final Set<Integer> remainingChoices, final int userDoorSelection) {
        return remainingChoices.contains(userDoorSelection);

    }


    private Set<Integer> getDoorsToTry(final int winner) {
        Set<Integer> remainingSet =
                choices.stream().filter(value -> value != winner).collect(Collectors.toSet());

        Set<Integer> doorsToTry = new HashSet<>();
        doorsToTry.add(winner);

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



}
