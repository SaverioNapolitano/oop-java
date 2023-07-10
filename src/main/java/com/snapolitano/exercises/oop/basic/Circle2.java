package com.snapolitano.exercises.oop.basic;

import java.awt.*;

public class Circle2 {
	Point center;
	int radius;

	public Circle2(Point center, int radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("radius can't be " + (radius == 0 ? "zero" : "negative)"));
		}
		this.center = center;
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * this.getRadius() * this.getRadius();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public boolean contains(Point p) {
		return p.distance(this.getCenter()) <= this.getRadius();
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public void translate(int dx, int dy) {
		this.getCenter().translate(dx, dy);
	}

	@Override
	public String toString() {
		return "Circle2{" + "center=" + center + ", radius=" + radius + '}';
	}
}
