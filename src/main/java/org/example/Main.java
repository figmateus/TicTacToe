package org.example;
import ticTacToe.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("------JOGO DA VELHA------");
        System.out.println();
        System.out.print("Digite o nome do jogador 1: ");
        scan.next();
        System.out.print("Digite o nome do jogador 2: ");
        scan.next();
        System.out.println();
        System.out.println("---JOGO DA VELHA---");
        System.out.println();
        Board board = new Board();
        board.startBoard();


    }
}