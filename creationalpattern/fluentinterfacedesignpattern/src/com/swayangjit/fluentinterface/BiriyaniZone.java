package com.swayangjit.fluentinterface;

public class BiriyaniZone  implements IResturant{
	 String name;
	    String IMenu;

	@Override
	public IResturant name(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		System.out.println("Enter to hotel :: " + name);
		return this;
	}

	@Override
	public IMenu show() {
		// TODO Auto-generated method stub
		 BiriyaniZoneMenuHandler handler = new BiriyaniZoneMenuHandler();
	        handler.showMenu();
	        return handler;
	}

}
