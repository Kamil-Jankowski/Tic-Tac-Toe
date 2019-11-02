package tictactoe;

final class GameAnalyzer {

    static boolean analyzeGameState(char[][] gameField) {
        checkEmptyFields(gameField);
        boolean X_wins = checkWinner(gameField, 'X');
        boolean O_wins = checkWinner(gameField, 'O');
        boolean possible = checkIfPossible(gameField);
        boolean draw = checkIfDraw(gameField);
        boolean gameOn = checkIfGameOn(gameField);

        if (possible){
            if (X_wins){
                System.out.print("X wins");
                return false;
            } else if (O_wins){
                System.out.print( "O wins");
                return false;
            } else if (draw){
                System.out.print("Draw");
                return false;
            } else if (gameOn){
                return true;
            }
            return true;
        } else {
            System.out.print("Impossible");
            return false;
        }
    }

    static int[] countOccurrences(char[][] field){
        int[] numberOfXAndO = new int[2];
        for (char[] rows : field) {
            for (char elementInARow : rows) {
                if (elementInARow == 'X') {
                    numberOfXAndO[0]++; // X
                } else if (elementInARow == 'O') {
                    numberOfXAndO[1]++;
                }
            }
        }
        return numberOfXAndO;
    }

    private static boolean checkWinner(char[][] gameField, char sign) {
        // checking rows
        for (char[] rows : gameField) {
            for (int column = 0; column < gameField.length - 2; column++) {
                if (rows[column] == rows[column + 1] && rows[column] == rows[column + 2] && rows[column] == sign) {
                    return true;
                }
            }
        }
        // checking columns
        for(int row = 0; row < gameField.length-2; row++) {
            for (int column = 0; column < gameField.length; column++) {
                if (gameField[row][column] == gameField[row+1][column] && gameField[row][column] == gameField[row+2][column] && gameField[row][column] == sign) {
                    return true;
                }
            }
        }
        //checking diagonals
        int row = gameField.length/2;
        int column = gameField[row].length/2;
        if (gameField[row][column] == gameField[row+1][column+1] && gameField[row][column] == gameField[row-1][column-1] && gameField[row][column] == sign) {
            return true;
        } else return gameField[row][column] == gameField[row + 1][column - 1] && gameField[row][column] == gameField[row - 1][column + 1] && gameField[row][column] == sign;
    }

    private static boolean checkEmptyFields(char[][] gameField) {
        for (char[] rows : gameField) {
            for (int column = 0; column < gameField.length; column++) {
                if (rows[column] != 'X' && rows[column] != 'O') {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkIfPossible(char[][] gameField) {
        if (checkWinner(gameField, 'X') && checkWinner(gameField, 'O')){        // there can not be two winners
            return false;
        }
        int[] counter = countOccurrences(gameField);
        int countX = counter[0], countO = counter[1];
        // difference between signs occurrence cannot be greater than 1:
        return countX - countO == 0 || countX - countO == 1 || countX - countO == -1;
    }

    private static boolean checkIfDraw(char[][] gameField) {
        return !checkEmptyFields(gameField) &&
                checkIfPossible(gameField) &&
                !(checkWinner(gameField, 'X') || checkWinner(gameField, 'O'));
    }

    private static boolean checkIfGameOn(char[][] gameField) {
        return checkEmptyFields(gameField) &&
                !checkWinner(gameField, 'X') &&
                !checkWinner(gameField, 'O') &&
                checkIfPossible(gameField);
    }
}
