package com.bridgelabz.object_oriented_problems;

import java.util.Random;

public class DeckOfCard {
    static String[] Clubs = { "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJack", "CQueen", "CKing",
            "CAce" };

    static String[] Diamonds = { "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJack", "DQueen", "DKing",
            "DAce" };

    static String[] Hearts = { "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJack", "HQueen", "HKing",
            "HAce" };

    static String[] Spades = { "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJack", "SQueen", "SKing",
            "SAce" };

    static String[][] deck = { Clubs, Diamonds, Hearts, Spades };

    public static void cardSelect() {
        Random c = new Random();
        int x = c.nextInt(4);
        int y = c.nextInt(13);
        if (deck[x][y] == null) {
            cardSelect();
        } else {
            System.out.print(deck[x][y] + ", ");
            deck[x][y] = null;
        }
    }
    public static void serve() {
        for (int i = 1; i < 5; i++) {
            System.out.println("\nFor Player" + i);
            for (int j = 1; j < 10; j++) {
                cardSelect();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome In Deck Of Cards Game");
        serve();
    }
}
