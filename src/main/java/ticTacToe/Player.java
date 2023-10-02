package ticTacToe;

public class Player {
    private String name;
    private char token;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, char token) {
        this.name = name;
        this.token = token;
    }

    public char getToken() {
        return token;
    }

    public void setToken(char token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void movement(char[][] board, char number){
        int[] pos = position(number);
        int row = pos[0];
        int column = pos[1];


        if(board[row][column] == token){
            System.out.println("Posição já preenchida!");
        }else {
         board[row][column] = token;
         System.out.println("Movimento realizado!");
        }

    }

    public int[] position(char number){
        int[] position = new int[1];
        position[0] = 0;
        position[1] = 0;
        switch (number){
            case 1:
                position[0] = 2;
                position[1] = 2;
                break;
            case 2:
                position[0] = 2;
                position[1] = 8;
                break;
            case 3:
                position[0] = 2;
                position[1] = 14;
                break;
            case 4:
                position[0] = 8;
                position[1] = 2;
                break;
            case 5:
                position[0] = 8;
                position[1] = 8;
                break;
            case 6:
                position[0] = 8;
                position[1] = 14;
                break;
            case 7:
                position[0] = 14;
                position[1] = 2;
                break;
            case 8:
                position[0] = 14;
                position[1] = 8;
                break;
            case 9:
                position[0] = 14;
                position[1] = 14;
                break;
            default:
                position[0] = 0;
                position[1] = 0;
                break;
        }

        return position;
    }

}




