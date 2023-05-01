package com.snapolitano.exercises.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterLists {
    public static List<List<String>> filterLists(List<List<String>> lists) {
        List<List<String>> listArrayList = new ArrayList<>();
        for (List<String> strings : lists) {
            boolean valid = true;
            for (String s : strings) {
                try {
                    CheckString.checkString(s);
                } catch (ParseException e) {
                    valid = false;
                }
            }
            if (valid) {
                listArrayList.add(strings);
            }
        }
        return listArrayList;
    }
}
