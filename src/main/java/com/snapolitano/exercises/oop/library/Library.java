package com.snapolitano.exercises.oop.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library extends Rent {
	ArrayList<Rent> rents;

	public Library() {
		super(null, null, null, null);
		rents = new ArrayList<>();
	}

	public boolean addRent(Rent rent) {
		return rents.add(rent);
	}

	public boolean removeRent(Rent rent) {
		return rents.remove(rent);
	}

	public ArrayList<Rent> getExpired(LocalDate now) {
		return rents.stream().filter(rent -> rent.isExpired(now)).collect(Collectors.toCollection(ArrayList::new));
	}
}
