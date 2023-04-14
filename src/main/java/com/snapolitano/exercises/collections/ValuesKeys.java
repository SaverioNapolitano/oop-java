package com.snapolitano.exercises.collections;

import java.util.Collection;
import java.util.Map;

public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map){
        Collection<String> collection = map.values();
        for (String string : collection) {
            if (map.containsKey(string)) {
                return true;
            }
        }
        return false;
    }
}
