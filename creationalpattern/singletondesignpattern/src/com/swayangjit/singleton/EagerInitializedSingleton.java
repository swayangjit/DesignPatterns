package com.swayangjit.singleton;

/**
 *  The instance of Singleton Class is created at the time of class loading, 
 *  this is the easiest method to create a singleton class 
 *  but it has a drawback that instance is created even though client application might not be using it.
 */
public class EagerInitializedSingleton {
	
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {
		
	}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
