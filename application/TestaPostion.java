package application;

import chess.*;
import application.UI;

public class TestaPostion {
    public static void main(String[] args) {
        ChessMatch chessmatch = new ChessMatch();
        UI.printBoard(chessmatch.getPieces());

    }    
}