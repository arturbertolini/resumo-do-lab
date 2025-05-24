package com.seuUsuario.board;

public class Board {
    private final int rows = 3;
    private final int cols = 3;
    private char[][] board;

    public Board() {
        board = new char[rows][cols];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("Estado atual do tabuleiro:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean placeMark(int row, int col, char mark) {
        if(row >= 0 && row < rows && col >= 0 && col < cols) {
            if(board[row][col] == '-') {
                board[row][col] = mark;
                return true;
            }
        }
        return false;
    }
}
