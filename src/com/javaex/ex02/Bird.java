package com.javaex.ex02;

public abstract class Bird {
    //필드
	private String name;

	//생성자
	public Bird() {
//		super();
	}
	public Bird(String name) {
//		super();
		this.name = name;
	}

	
	//메소드-gs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//메소드-일반
	public abstract void showName();
	public void sing() {
		System.out.println("참새("+this.name+")가 소리내어 웁니다.");
	}
	public void fly() {
		System.out.println("참새("+ this.name +")가 날아다닙니다.");
	}

	
    

}
