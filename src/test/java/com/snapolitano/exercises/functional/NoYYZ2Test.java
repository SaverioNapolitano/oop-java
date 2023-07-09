package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoYYZ2Test {

    @Test
    void noYYZ() {
        assertEquals(List.of("ay", "by", "cy"), NoYYZ2.noYYZ(new ArrayList<>(List.of("a", "b", "c"))));
        assertEquals(List.of("ay", "by"), NoYYZ2.noYYZ(new ArrayList<>(List.of("a", "b", "cy"))));
        assertEquals(List.of("xxy", "yay", "zzy"), NoYYZ2.noYYZ(new ArrayList<>(List.of("xx", "ya", "zz"))));

    }
}