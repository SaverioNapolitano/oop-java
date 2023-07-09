package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckLicencePlate2Test {

    @Test
    void checkLicencePlate() {
        assertThrows(IllegalArgumentException.class, () -> CheckLicencePlate2.checkLicencePlate("1A234CC"));
        assertThrows(IllegalArgumentException.class, () -> CheckLicencePlate2.checkLicencePlate("AA234C"));
    }
}