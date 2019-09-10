package com.swayangjit.abstractfactory;

public class ThreeDShapeFactory extends AbstractFactory {

	@Override
	public GeometricShape geometricShape(ShapeType shapeType) {
		// TODO Auto-generated method stub
		if(shapeType == ShapeType.SPHERE) {
			return new Spehere();
		}
		return null;
	}

}
