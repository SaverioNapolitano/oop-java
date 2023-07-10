package com.snapolitano.exercises.oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape {
	Point upperLeft;
	Point bottomRight;

	public Rectangle(String color, String id, Point upperLeft, Point bottomRight) {
		super(color, id);
		this.upperLeft = upperLeft;
		this.bottomRight = bottomRight;
	}

	@Override
	public String toString() {
		return "Rectangle{" + "bottomRight=" + bottomRight + ", upperLeft=" + upperLeft + ", color='" + color + '\'' + ", id='" + id + '\'' + '}';
	}

	@Override
	public double getArea() {
		Point bottomLeft = new Point(upperLeft.x, bottomRight.y);
		Point upperRight = new Point(bottomRight.x, upperLeft.y);
		double a = Math.abs(getUpperLeft().getX() - upperRight.getY());
		double b = Math.abs(getUpperLeft().getY() - bottomLeft.getY());
		return a * b;
	}

	public Point getUpperLeft() {
		return upperLeft;
	}

	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}

	@Override
	public double getPerimeter() {
		Point bottomLeft = new Point(upperLeft.x, bottomRight.y);
		Point upperRight = new Point(bottomRight.x, upperLeft.y);
		double a = Math.abs(getUpperLeft().getX() - upperRight.getY());
		double b = Math.abs(getUpperLeft().getY() - bottomLeft.getY());
		return 2 * (a + b);
	}

	@Override
	public void move(Point movement) {
		getUpperLeft().setLocation(getUpperLeft().getX() + movement.getX(), getUpperLeft().getY() + movement.getY());
		getBottomRight().setLocation(getBottomRight().getX() + movement.getX(), getBottomRight().getY() + movement.getY());
	}

	public Point getBottomRight() {
		return bottomRight;
	}

	public void setBottomRight(Point bottomRight) {
		this.bottomRight = bottomRight;
	}

	@Override
	public void resize(double scale) {
		getBottomRight().setLocation((getBottomRight().getX() - getUpperLeft().getX()) * (scale - 1) + getBottomRight().getX(), (getBottomRight().getY() - getUpperLeft().getY()) * (scale - 1) + getBottomRight().getY());
	}
}
