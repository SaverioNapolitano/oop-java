package com.snapolitano.exercises.oop.shape;

import java.awt.*;

public class Rectangle2 extends AbstractShape2 {

	Point upperLeft;
	Point bottomRight;

	public Rectangle2(String id, String color, Point upperLeft, Point bottomRight) {
		super(id, color);
		this.upperLeft = upperLeft;
		this.bottomRight = bottomRight;
	}

	@Override
	public double getArea() {
		return Math.abs((this.getBottomRight().getX() - this.getUpperLeft().getX()) * (this.getUpperLeft().getY() - this.getBottomRight().getY()));
	}

	public Point getBottomRight() {
		return bottomRight;
	}

	public Point getUpperLeft() {
		return upperLeft;
	}

	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}

	public void setBottomRight(Point bottomRight) {
		this.bottomRight = bottomRight;
	}

	@Override
	public double getPerimeter() {
		return Math.abs(2 * (this.getBottomRight().getX() - this.getUpperLeft().getX()) + 2 * (this.getUpperLeft().getY() - this.getBottomRight().getY()));
	}

	@Override
	public void move(Point movement) {
		this.getBottomRight().translate(movement.x, movement.y);
		this.getUpperLeft().translate(movement.x, movement.y);
	}

	@Override
	public void resize(double scale) {
		Point vector = new Point(bottomRight.x - upperLeft.x, upperLeft.y - bottomRight.y);

		this.getBottomRight().setLocation(scale * vector.x + upperLeft.x, scale * vector.y + upperLeft.y);
	}
}
