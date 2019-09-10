package com.swayangjit.prototype;

public class TestPrototypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		ShapeCache.loadCache();
		Shape circle = ShapeCache.getShape("1");
		circle.draw();
		
	}

}
