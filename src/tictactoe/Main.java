package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int xInput;
        int yInput;

        // creating new game field
        TicTacToe game = new TicTacToe();
        // printing game field
        game.printGameField();

        // playing game
        while (running) {
            // getting coordinates from user
            System.out.print("Enter the coordinates: ");
            try {
                xInput = scanner.nextInt();
                yInput = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.next();
                continue;
            }
            int rowCoordinate = -(yInput - 3);
            int columnCoordinate = xInput - 1;

            // placing new mark on the grid
            try {
                game.placeMarkOnTheGrid(rowCoordinate, columnCoordinate);
                game.printGameField();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
            } catch (Exception e){
                System.out.println("This cell is occupied! Choose another one!");
            }

            // checking game state
            running = GameAnalyzer.analyzeGameState(game.getField());
        }
    }
}