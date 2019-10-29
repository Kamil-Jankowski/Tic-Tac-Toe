package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int xInput;
        int yInput;

        // taking input from user
        System.out.print("Enter cells: ");
        String input = scanner.nextLine().replace("\"", "");
        char[] symbols = input.toCharArray();
        char[][] game;

        // placing symbols onto game field
        game = createGameField(symbols);

        // printing game field
        printGameField(game);

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

            // place new mark on the grid
            try {
                placeMarkOnTheGrid(game, rowCoordinate, columnCoordinate);
                running = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
            } catch (Exception e){
                System.out.println("This cell is occupied! Choose another one!");
            }
        }
        // printing game field
        printGameField(game);

        // checking game state
        //analyzeGameState(game);
    }

    private static char[][] createGameField(char[] inputString){
        char[][] field = new char[3][3];
        for (int row = 0; row < field.length; row++) {
            for (int elem = row * 3; elem < row * 3 + 3; elem++) {
                field[row][elem % 3] = inputString[elem];
            }
        }
        return field;
    }

    private static void printGameField(char[][] gameField){
        System.out.println("---------");
        for (char[] rows : gameField) {
            System.out.print("| ");
            for (char elemInARow : rows) {
                System.out.printf("%s ", elemInARow);
            }
            System.out.print("|\n");
        }
        System.out.println("---------");
    }

    private static void placeMarkOnTheGrid(char[][] gameField, int row, int col) throws Exception{
        if (gameField[row][col] != 'X' && gameField[row][col] != 'O') {
            gameField[row][col] = 'X';
        } else {
            throw new Exception();
        }
    }

//    private static void analyzeGameState(char[][] gameField) {
//        checkEmptyFields(gameField);
//        boolean X_wins = checkWinner(gameField, 'X');
//        boolean O_wins = checkWinner(gameField, 'O');
//        boolean possible = checkIfPossible(gameField);
//        boolean draw = checkIfDraw(gameField);
//        boolean gameOn = checkIfGameOn(gameField);
//
//        if (possible){
//            System.out.print(X_wins ? "X wins" : "");
//            System.out.print(O_wins ? "O wins" : "");
//            System.out.print(draw ? "Draw" : "");
//            System.out.print(gameOn ? "Game not finished" : "");
//        } else {
//            System.out.print("Impossible");
//        }
//    }
//
//    private static boolean checkEmptyFields(char[][] gameField) {
//        for (char[] rows : gameField) {
//            for (int column = 0; column < gameField.length; column++) {
//                if (rows[column] != 'X' && rows[column] != 'O') {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    private static boolean checkWinner(char[][] gameField, char sign) {
//        // checking rows
//        for (char[] rows : gameField) {
//            for (int column = 0; column < gameField.length - 2; column++) {
//                if (rows[column] == rows[column + 1] && rows[column] == rows[column + 2] && rows[column] == sign) {
//                    return true;
//                }
//            }
//        }
//        // checking columns
//        for(int row = 0; row < gameField.length-2; row++) {
//            for (int column = 0; column < gameField.length; column++) {
//                if (gameField[row][column] == gameField[row+1][column] && gameField[row][column] == gameField[row+2][column] && gameField[row][column] == sign) {
//                    return true;
//                }
//            }
//        }
//        //checking diagonals
//        int row = gameField.length/2;
//        int column = gameField[row].length/2;
//        if (gameField[row][column] == gameField[row+1][column+1] && gameField[row][column] == gameField[row-1][column-1] && gameField[row][column] == sign) {
//            return true;
//        } else return gameField[row][column] == gameField[row + 1][column - 1] && gameField[row][column] == gameField[row - 1][column + 1] && gameField[row][column] == sign;
//    }
//
//    private static boolean checkIfPossible(char[][] gameField) {
//        if (checkWinner(gameField, 'X') && checkWinner(gameField, 'O')){        // there can not be two winners
//            return false;
//        }
//
//        int countX = 0, countO = 0;
//        for (char[] rows : gameField) {
//            for (char elementInARow : rows) {
//                if (elementInARow == 'X') {
//                    countX++;
//                } else if (elementInARow == 'O') {
//                    countO++;
//                }
//            }
//        }
//        // difference between signs occurence cannot be greater than 1:
//        return countX - countO == 0 || countX - countO == 1 || countX - countO == -1;
//    }
//
//    private static boolean checkIfDraw(char[][] gameField) {
//        return !checkEmptyFields(gameField) &&
//                checkIfPossible(gameField) &&
//                !(checkWinner(gameField, 'X') || checkWinner(gameField, 'O'));
//    }
//
//    private static boolean checkIfGameOn(char[][] gameField) {
//        return checkEmptyFields(gameField) &&
//                !checkWinner(gameField, 'X') &&
//                !checkWinner(gameField, 'O') &&
//                checkIfPossible(gameField);
//    }
}