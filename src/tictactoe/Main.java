package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // taking input from user
        System.out.print("Enter cells: ");
        String input = scanner.nextLine();
        char[] symbols = input.toCharArray();
        // printing result game field
        System.out.println("---------");
        System.out.printf("| %s %s %s |\n", symbols[1], symbols[2], symbols[3]);
        System.out.printf("| %s %s %s |\n", symbols[4], symbols[5], symbols[6]);
        System.out.printf("| %s %s %s |\n", symbols[7], symbols[8], symbols[9]);
        System.out.println("---------");
    }
}