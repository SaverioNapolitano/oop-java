package com.snapolitano.exercises.oop.shape;

import java.awt.*;

public class AbstractShape implements Computable, Movable, Resizable {
	String color;

	String id;

	public AbstractShape(String color, String id) {
		this.color = color;
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.length() == 7) {
			this.color = color;
			if (color.startsWith("#")) {
				try {
					Integer.parseInt(color.substring(1), 16);
					return;
				} catch (NumberFormatException ignored) {

				}
			}
		}
		throw new IllegalArgumentException();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getPerimeter() {
		return 0;
	}

	@Override
	public void move(Point movement) {

	}

	@Override
	public void resize(double scale) {

	}
}
