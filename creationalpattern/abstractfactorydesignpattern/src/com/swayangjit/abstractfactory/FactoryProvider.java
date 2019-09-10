package com.swayangjit.abstractfactory;

public abstract class FactoryProvider {

	public static AbstractFactory getFactory(FactoryType factoryType) {

		AbstractFactory factory = null;
		switch (factoryType) {
		case TWO_D_SHAPE_FACTORY:
			factory = new TwoDShapeFactory();
			break;

		case THREE_D_SHAPE_FACTORY:
			factory = new ThreeDShapeFactory();
			break;

		default:
			break;
		}

		return factory;
	}

}
