package com.snapolitano.exercises.collections;

import java.util.Map;

public class ValuesKeys2 {
    public static boolean valuesKeys(Map<String, String> map) {
        for (String value : map.values()) {
            if (map.containsKey(value)) {
                return true;
            }
        }
        return false;
    }
}
