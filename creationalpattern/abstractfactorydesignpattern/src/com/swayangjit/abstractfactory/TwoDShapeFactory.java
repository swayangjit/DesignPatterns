package com.swayangjit.abstractfactory;

public class TwoDShapeFactory extends AbstractFactory{
	@Override
	public GeometricShape geometricShape(ShapeType shapeType) {
		if(shapeType == ShapeType.LINE ) {
			return new Line();
		}else if(shapeType == ShapeType.RECTANGLE ) {
			return new Rectangle();
		}
		return null;
	}

}
