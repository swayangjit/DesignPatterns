package com.swayangjit.singleton;

/**Static block initialization implementation is similar to eager initialization, 
 * except that instance of class is created in the static block that provides option for exception handling.
 */
public class StaticBlockSingleTon {
	private static StaticBlockSingleTon instance;
	
	private StaticBlockSingleTon() {}
	
	static {
		try {
			instance = new StaticBlockSingleTon();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured during creation");
		}
	}
	
	public StaticBlockSingleTon getInstance() {
		return instance;
	}
}
