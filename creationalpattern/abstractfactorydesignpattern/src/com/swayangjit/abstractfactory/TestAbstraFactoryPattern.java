package com.swayangjit.abstractfactory;

public class TestAbstraFactoryPattern {

	public static void main(String[] args) {

		AbstractFactory factory = FactoryProvider.getFactory(FactoryType.TWO_D_SHAPE_FACTORY);
		if (factory == null) {
			System.out.println("Factory for given name doesn't exist.");
		}

		GeometricShape circle = factory.geometricShape(ShapeType.LINE);
		if (circle != null) {
			circle.draw();
		} else {
			System.out.println("Cant draw a Circle");
		}

		factory = FactoryProvider.getFactory(FactoryType.THREE_D_SHAPE_FACTORY);
		GeometricShape spehere = factory.geometricShape(ShapeType.SPHERE);
		if (spehere != null) {
			spehere.draw();
		} else {
			System.out.println("Cant draw a triangle");
		}

	}

}
