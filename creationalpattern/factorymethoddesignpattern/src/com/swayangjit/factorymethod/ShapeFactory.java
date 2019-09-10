package com.swayangjit.factorymethod;

public abstract class ShapeFactory {

	public static GeometricShape getShape(ShapeType shapeType) {
		GeometricShape shape = null;
		switch (shapeType) {
		case CIRCLE:
			shape = new Circle();
			break;

		case RECTANGLE:
			shape = new Rectangle();
			break;
		case LINE:
			shape = new Line();
			break;
			
		default:
			break;
		}

		return shape;
	}

}
