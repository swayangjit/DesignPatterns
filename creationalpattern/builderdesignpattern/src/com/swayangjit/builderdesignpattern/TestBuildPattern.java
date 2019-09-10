package com.swayangjit.builderdesignpattern;

public class TestBuildPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer.ComputerBuilder("16GB", "1TB").setBlutoothEnabled(true).setGraphicsCardEnabled(true).build();
		System.out.println(computer);
		
	}

}
