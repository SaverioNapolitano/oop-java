package com.snapolitano.exercises.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static com.snapolitano.exercises.exceptions.CheckString2.checkString;

public class FilterItems2 {
    public static List<String> filterItems(List<String> strings){
        List<String> filtered = new ArrayList<>();
        for (String string : strings) {
            try {
                checkString(string);
                filtered.add(string);
            } catch (ParseException ignored) {

            }
        }
        return filtered;
    }
}
