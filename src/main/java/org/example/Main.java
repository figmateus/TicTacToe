package org.example;
import ticTacToe.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Board board = new Board();
        System.out.println("-----JOGO DA VELHA-----");
        System.out.println();
        System.out.print("Digite o nome do jogador 1: ");
        Player player1 = new Player(scan.next(), 'X');
        System.out.print("Digite o nome do jogador 2: ");
        Player player2 = new Player(scan.next(), 'O');
        System.out.println();
        System.out.println("---JOGO DA VELHA---");
        System.out.println("O jogador 1:"+ player1.getName() + " é:" + player1.getToken());
        System.out.println("O jogador 2:"+ player2.getName() + " é:" + player2.getToken());
        board.startBoard();
        System.out.println("Digite o numero que deseja jogar: ");
        char position = scan.next().charAt(0);


    }
}