package com.snapolitano.exercises.oop.shape;

import java.awt.*;

public class Circle2 extends AbstractShape2 {
	Point center;
	double radius;

	public Circle2(String id, String color, Point center, double radius) {
		super(id, color);
		this.center = center;
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * this.getRadius() * this.getRadius();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.getRadius();
	}

	@Override
	public void move(Point movement) {
		this.getCenter().translate(movement.x, movement.y);
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void resize(double scale) {
		this.setRadius(this.getRadius() / scale);
	}

	@Override
	public String toString() {
		return "Circle2{" + "center=" + center + ", radius=" + radius + ", id='" + id + '\'' + ", color='" + color + '\'' + '}';
	}
}
