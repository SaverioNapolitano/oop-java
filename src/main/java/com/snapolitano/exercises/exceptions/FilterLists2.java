package com.snapolitano.exercises.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static com.snapolitano.exercises.exceptions.CheckString2.checkString;

public class FilterLists2 {
	public static List<List<String>> filterLists(List<List<String>> lists) {
		List<List<String>> filtered = new ArrayList<>();
		for (List<String> list : lists) {
			try {
				for (String string : list) {
					checkString(string);
				}
				filtered.add(list);
			} catch (ParseException ignored) {

			}
		}
		return filtered;
	}
}
