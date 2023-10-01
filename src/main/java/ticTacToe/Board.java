package ticTacToe;

public class Board {


    public void startBoard(){
        char[][] board = new char[17][17];
        int col = 0;
        int row = 0;

        for(row = 0; row < 17; row++){
            for(col = 0; col < 17; col++){
                board[row][col] = ' ';
            }
        }

        for (col = 0; col < 17; col++){
            board[5][col] = '-';
        }

        for (col = 0; col < 17; col++){
            board[11][col] = '-';
        }

        for (row = 0; row < 17; row++){
            board[row][5] = '|';
        }

        for (row = 0; row < 17; row++){
            board[row][11] = '|';
        }

        board[2][2]='1';
        board[2][8]='2';
        board[2][14]='3';
        board[8][2]='4';
        board[8][8]='5';
        board[8][14]='6';
        board[14][2]='7';
        board[14][8]='8';
        board[14][14]='9';

        for(row=0; row<17; row++) {
            for(col = 0; col<17; col++)
                System.out.print(board[row][col]);
            System.out.println();
        }
    }
}
