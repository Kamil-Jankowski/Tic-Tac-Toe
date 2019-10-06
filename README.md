# Tic-Tac-Toe with AI

**Stage 3: (ongoing)**

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
