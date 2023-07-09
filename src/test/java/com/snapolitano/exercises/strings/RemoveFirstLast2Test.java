package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstLast2Test {

    @Test
    void removeFirstLast() {
        assertEquals("google", RemoveFirstLast2.removeFirstLast("google"));
        assertEquals( "enem", RemoveFirstLast2.removeFirstLast( "aenema"));
        assertEquals( "", RemoveFirstLast2.removeFirstLast( "FF"));
        assertEquals( "F", RemoveFirstLast2.removeFirstLast( "F"));
    }
}