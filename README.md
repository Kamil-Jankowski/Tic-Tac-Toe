# Tic-Tac-Toe

**Stage 5: (ongoing)**

_Now it is time to make a working game!_

_In the last stage, make it so you can play a full game with a friend. First one of you moves as X, and then the other one moves as O._

_You need to create a game loop. The game starts with empty cells and ends when someone wins or there is a draw. You need to output the final result after the end of the game._

_Good luck gaming!_ 

***
**Stage 4:**

_Now you need to implement human moves._

_Suppose the bottom left cell has the coordinates (1, 1) and the top right cell has the coordinates (3, 3) like in this table:_

(1, 3) (2, 3) (3, 3)<br>
(1, 2) (2, 2) (3, 2)<br>
(1, 1) (2, 1) (3, 1)

_The program should work in the following way:_

1. _Get the 3x3 field from the input as in the previous stages;_
2. _Output this 3x3 field with cells before the user's move;_
3. _Then ask the user about his next move;_
4. _Then the user should input 2 numbers that represent the cell on which user wants to make his X or O. (9 symbols representing the field would be on the first line and these 2 numbers would be on the second line of the user input);_
5. _Then output the table including the user's most recent move._

_Do not delete code that checks for table state; it will be useful in the future._

_Note that in this stage user moves as X, not O. Keep in mind that the first coordinate goes from left to right and the second coordinate goes from bottom to top. Also, notice that coordinates start with 1 and can be 1, 2 or 3._

_But what if the user enters incorrect coordinates? The user could enter symbols instead of numbers or enter coordinates representing occupied cells. You need to prevent all of that by checking a user's input and catching possible exceptions._

_The program should also check user input. If the user input is unsuitable, the program should ask him to enter coordinates again._ 

_So, you need to output a field from the first line of the input and then ask the user to enter a move. Keep asking until the user enters coordinate that represents an empty cell on the field and after that output the field with that move. You should output the field only 2 times - before the move and after a legal move._

***
**Stage 3:**

_In this stage, you should analyze a Tic-Tac-Toe field._

_Note. In this stage either 'X' or 'O' can start the game._

_After printing the field, you need to find the state in which the game is at the moment. Possible states:_

* _`"Game not finished"` - when no side has a three in a row but the field has empty cells;_
* _`"Draw"` - when no side has a three in a row and the field has no empty cells;_
* _`"X wins"` - when the field has three X in a row;_
* _`"O wins"` - when the field has three O in a row;_
* _`"Impossible"` - when the field has three X in a row as well as three O in a row. Or the field has a lot more X's that O's or vice versa (if the difference is 2 or more, should be 1 or 0)._ 

***
**Stage 2:**

_In this stage, you should write a program that reads 11 symbols (notice that input includes `"` symbols at the start
and in the end of a line) from the input, and writes an appropriate 3x3 field._

_Elements of the field can contain only `'X'`, `'O'` and `' '` symbols 
(and input contain only these symbols except `"` at the start and in the end)._

_Note, that field has a specific format and should start and end with `'---------'`, 
all lines in between should start and end with `'|'` symbol and cells and `'|'` symbols should be separated with a single space._ 

***
**Stage 1:**

_Tic-tac-toe is a game played by two players on a 3x3 field._

_One of the players plays as 'X', and the other player is 'O'. 'X' plays first, then the 'O' side plays, and so on._

_The players write 'X' and 'O' on a 3x3 field._

_The first player that writes 3 'X' or 3 'O' in a straight line (including diagonals) wins._

_Your first task in this project is to print any state of the field in the console output._
