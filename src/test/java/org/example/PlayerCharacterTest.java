package org.example;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PlayerCharacterTest {

    @Test
    void test_getX_returns0(){
        assertEquals(0, PlayerCharacter.getX());
    }

    @Test
    void test_getY_returns0(){
        assertEquals(0, PlayerCharacter.getY());
    }

    @Test
    void test_move_whenW_returnYis1(){
        char input = 'w';
        PlayerCharacter.move(input);
        assertEquals(1, PlayerCharacter.getY());
    }

    @Test
    void test_move_whenS_returnY_isNegative1(){
        char input = 's';
        PlayerCharacter.move(input);
        assertEquals(-1, PlayerCharacter.getY());
    }

    @Test
    void test_move_whenD_returnX_is1(){
        char input = 'd';
        PlayerCharacter.move(input);
        assertEquals(1, PlayerCharacter.getX());
    }

    @Test
    void test_move_whenD_returnX_isNegative1(){
        char input = 'a';
        PlayerCharacter.move(input);
        assertEquals(-1, PlayerCharacter.getX());
    }

    // Position zurücksetzen, damit die anderen Tests nicht beeinflusst werden
    @AfterEach
    void reset(){
        PlayerCharacter.resetPos();
    }

}