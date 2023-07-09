package com.snapolitano.exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Letter2Test {

    Letter2 letter2;
    @BeforeEach
    void setUp(){
        letter2 = new Letter2("sender name", "recipient name");
    }

    @Test
    void addLine() {
        letter2.addLine("first line of the body");
        letter2.addLine("second line of the body");
        letter2.addLine(". . .");
        letter2.addLine("last line of the body");
        assertEquals("""
                Dear recipient name:
                
                first line of the body
                second line of the body
                . . .
                last line of the body
                
                Sincerely,
                
                sender name""", letter2.getText());
    }

    @Test
    void getText() {
        assertEquals("Dear recipient name:\n\n\nSincerely,\n\nsender name", letter2.getText());
    }
}