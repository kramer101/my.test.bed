package my.test.bed.hackerrank;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import my.test.bed.MyHelper;
import org.apache.commons.lang3.StringUtils;

/**
 * https://www.hackerrank.com/challenges/crossword-puzzle
 */
public class CrosswordPuzzle {

    public static void main(String[] args) {


        char[][] puzzleMatrix = new char[10][10];


        Scanner in = new Scanner(System.in);

        String words = "";

        for (int j = 0; j <= 10; j++) {
            String line = in.nextLine();
            if (j == 10) {
                words = line;
            } else {
                for (int i = 0; i < line.toCharArray().length; i++) {
                    char character = line.charAt(i);
                    puzzleMatrix[j][i] = character;
                }
            }
        }

        String[] wordsSplit = words.split(";");


        /*Set<WordInPuzzle> solved = new LinkedHashSet<>();
        Stream.of(wordsSplit).forEach(sParam -> {
            WordInPuzzle wordInPuzzle = new WordInPuzzle();
            wordInPuzzle.chars = sParam;
        });
            */


        //detect word
        for (char line[] : puzzleMatrix) {
            String lineAsString = new String(line);


        }


        int countSolved;
        char[][] puzzleMatrixReverted = new char[10][10];

        for (int i = 0; i < puzzleMatrix.length; i++) {

            for (int j = 0; j < puzzleMatrix.length; j++) {
                puzzleMatrixReverted[i][j] = puzzleMatrix[j][i];
            }
        }

        MyHelper.printCharMatrix(puzzleMatrix);
        System.out.println("");

        MyHelper.printCharMatrix(puzzleMatrixReverted);
    }




    private static void solve(int countSolved, String[] wordsSplit, char[][] puzzleMatrix, int posX, int posY) {
        if (wordsSplit.length == countSolved) {
            return;
        }

        char value = puzzleMatrix[posX][posY];

        if (value == '-') {
            Direction direction = null;

            if (puzzleMatrix[posX + 1][posY] == '-') {
                direction = Direction.RIGTH;
            } else if (puzzleMatrix[posX][posY + 1] == '-') {
                direction = Direction.DOWN;
            }
            char nextChar = '-';
            int length = 0;
            int crossLength = 0;


        }
    }




    static enum Direction {
        RIGTH, DOWN
    }


    static class WordInPuzzle {
        int[][] start;
        int[][] end;
        Direction direction;
        Set<Integer[][]> crossings = new LinkedHashSet<>();
    }
}
