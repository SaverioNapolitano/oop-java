package com.snapolitano.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LetterTest {
    @Test
    void getText() {
        Letter letter = new Letter("me", "you");
        letter.addLine("Hello");
        letter.addLine("World!");
        String dst = """
                Dear you:

                Hello
                World!
                                
                Sincerely,
                                
                me""";
        assertEquals(dst, letter.getText());
    }
}