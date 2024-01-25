package org.example;


public class PlayerCharacter {

    static int x = 0;
    static int y = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void move(char input) {
        if (input == 'w') {
            y++;
        } else if (input == 's') {
            y--;
        } else if (input == 'd') {
            x++;
        } else if (input == 'a') {
            x--;
        }
    }

    public static void resetPos() {
        x = 0;
        y = 0;
    }
}