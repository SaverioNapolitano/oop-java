package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RecurringCharsTest {

    @Test
    void recurringChars() {
        assertEquals(new HashSet<Character>(), RecurringChars.recurringChars("Ciao"));
        assertEquals(new HashSet<Character>(Set.of('l')), RecurringChars.recurringChars("Hello"));
        assertEquals(new HashSet<Character>(Set.of('l', 'o')), RecurringChars.recurringChars("Hello World!"));
    }
}