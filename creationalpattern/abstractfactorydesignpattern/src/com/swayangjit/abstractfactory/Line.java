package com.swayangjit.abstractfactory;

public class Line implements GeometricShape {

	@Override
	public void draw() {
		System.out.println("Line is drawn");
	}

}
