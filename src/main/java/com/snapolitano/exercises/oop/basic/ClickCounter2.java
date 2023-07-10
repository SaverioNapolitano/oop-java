package com.snapolitano.exercises.oop.basic;

/**
 * A click counter keeping track of how many times the click() method is called.
 *
 * @author saverionapolitano
 * @version 2023.07.05
 */
public class ClickCounter2 {
	int value;

	/**
	 * Initialize a new ClickCounter
	 */
	public ClickCounter2() {
		reset();
	}

	/**
	 * Resets the value of this counter to 0.
	 */
	public void reset() {
		value = 0;
	}

	/**
	 * Gets the current value of this counter.
	 *
	 * @return the current numbers of clicks.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Advances the value of this counter by 1.
	 */
	public void click() {
		value++;
	}

	/**
	 * Undo accidental clicks by decreasing internal counter.
	 */
	public void undo() {
		value = Math.max(0, value - 1);
	}
}
