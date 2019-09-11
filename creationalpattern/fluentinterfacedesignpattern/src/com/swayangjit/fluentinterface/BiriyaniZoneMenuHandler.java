package com.swayangjit.fluentinterface;

import java.util.ArrayList;
import java.util.List;

public class BiriyaniZoneMenuHandler implements IMenu {
	List<IItem> menuList = new ArrayList<IItem>();
	List<IItem> selectedList = new ArrayList<IItem>();

	public BiriyaniZoneMenuHandler() {
		this.addItems();
	}

	@Override
	public IMenu order(int index) {
		// TODO Auto-generated method stub
		IItem item = menuList.get(index);
		selectedList.add(item);
		System.out.println("Order given ::");
		item.name();

		return this;
	}

	@Override
	public IMenu eat() {
		// TODO Auto-generated method stub
		for (int i = 0; i < selectedList.size(); i++) {
			IItem item = menuList.get(i);
			System.out.println("eating ");
			item.name();
		}
		return this;
	}

	@Override
	public IMenu pay() {
		// TODO Auto-generated method stub
		int cost = 0;
		for (int i = 0; i < selectedList.size(); i++) {
			IItem item = menuList.get(i);
			System.out.println("eating ");
			cost = cost + item.cost();
		}
		System.out.println("Paying Rupees" + cost);
		return this;
	}

	@Override
	public IItem get(int index) {
		// TODO Auto-generated method stub
		if (index < 3) {
			return menuList.get(index);
		}
		return null;
	}

	public void addItems() {

		IItem chickenBiriyani = new IItem() {

			@Override
			public IItem name() {
				System.out.println("Chicken Biriyani");
				return this;
			}

			@Override
			public int cost() {
				// TODO Auto-generated method stub
				return 280;
			}
		};

		IItem tandoori = new IItem() {

			@Override
			public IItem name() {
				System.out.println("Tandoori");
				return this;
			}

			@Override
			public int cost() {
				// TODO Auto-generated method stub
				return 200;
			}
		};

		menuList.add(chickenBiriyani);
		menuList.add(tandoori);
	}

	public void showMenu() {
		System.out.println("MENU IN Biriyani Zone");
		for (IItem item : menuList) {
			item.name();
		}
	}
}
