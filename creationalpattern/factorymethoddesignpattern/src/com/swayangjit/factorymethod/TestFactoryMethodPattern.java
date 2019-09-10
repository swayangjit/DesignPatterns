package com.swayangjit.factorymethod;

public class TestFactoryMethodPattern {

	public static void main(String[] args) {
		
		GeometricShape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
		if(circle != null) {
			circle.draw();	
		}else {
			System.out.println("Cant draw a Circle");
		}
		
		GeometricShape traingle = ShapeFactory.getShape(ShapeType.TRIANGLE);
		if(traingle != null) {
			traingle.draw();	
		}else {
			System.out.println("Cant draw a triangle");
		}
		

	}

}
