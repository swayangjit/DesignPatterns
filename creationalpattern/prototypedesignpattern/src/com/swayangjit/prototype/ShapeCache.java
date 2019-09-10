package com.swayangjit.prototype;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeCache = new Hashtable<>();

	public static Shape getShape(String id) throws CloneNotSupportedException {
		return (Shape) shapeCache.get(id).clone();
	}

	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeCache.put(circle.getId(), circle);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeCache.put(rectangle.getId(), rectangle);
	}

}
