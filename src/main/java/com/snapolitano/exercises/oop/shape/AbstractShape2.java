package com.snapolitano.exercises.oop.shape;

import java.awt.*;
import java.util.HexFormat;

public abstract class AbstractShape2 implements Movable2, Computable2, Resizable2 {
	String id;
	String color;

	public AbstractShape2(String id, String color) {
		this.id = id;
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		try {
			HexFormat.fromHexDigits(id, 1, id.length() - 1);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("String does not conform to RGB standard");
		}
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public abstract void move(Point movement);

	public abstract void resize(double scale);
}
