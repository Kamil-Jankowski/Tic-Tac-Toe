package tictactoe;

class TicTacToe {
    private char[][] field;

    // constructors
    TicTacToe() {
        setField();
    }

    TicTacToe(char[] inputString) {
        setField();
    }

    // getters and setters
    private void setField() {
        field = new char[3][3];
        this.createGameField();
    }

    char[][] getField(){
        return field;
    }

    // methods
    private void createGameField(){
        for (int row = 0; row < field.length; row++) {
            for (int elem = row * 3; elem < row * 3 + 3; elem++) {
                field[row][elem % 3] = ' ';
            }
        }
    }

    private char[][] createGameField(char[] inputString){
        for (int row = 0; row < field.length; row++) {
            for (int elem = row * 3; elem < row * 3 + 3; elem++) {
                field[row][elem % 3] = inputString[elem];
            }
        }
        return field;
    }

    void printGameField(){
        System.out.println("---------");
        for (char[] rows : this.field) {
            System.out.print("| ");
            for (char elemInARow : rows) {
                System.out.printf("%s ", elemInARow);
            }
            System.out.print("|\n");
        }
        System.out.println("---------");
    }

    void placeMarkOnTheGrid(int row, int col) throws Exception{
        int[] counter = GameAnalyzer.countOccurrences(this.field);
        int xCount = counter[0], oCount = counter[1];
        if (this.field[row][col] != 'X' && this.field[row][col] != 'O') {
            this.field[row][col] = xCount <= oCount ? 'X' : 'O';
        } else {
            throw new Exception();
        }
    }
}
