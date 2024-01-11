package com.javaex.ex01;

public abstract class Shape {
	//필드
	protected String fillColor;
	
	//생성자

	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	//메소드-일반
	public abstract void draw();
}


