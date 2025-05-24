package com.seuUsuario.board;

import java.util.Scanner;

public class Game {
    private Board board;
    private char currentPlayer;
    private Scanner scanner;

    public Game() {
        board = new Board();
        currentPlayer = 'X';
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Iniciando o jogo...");
        boolean playing = true;
        while (playing) {
            board.printBoard();
            System.out.println("Jogador " + currentPlayer + ", entre com linha e coluna (0, 1 ou 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(board.placeMark(row, col, currentPlayer)) {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Posição inválida, tente novamente.");
            }
        }
    }
}
