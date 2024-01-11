package com.javaex.ex02;

public class Duck extends Bird {
	
	
	//메소드-일반
    public void sing() { //()안에 들어가는 형식을 super와 맞춰야함. 근데 setName이면 여기서 super.getName을 받는게 맞는건지? 갑자기 헷갈림
    	System.out.println("오리("+super.getName()+")가 소리내어 웁니다.");
    }

    public void fly() {
    	System.out.println("오리("+ super.getName() +")가 날지 않습니다.");
    }
    
    public void showName() {
    	System.out.println("오리의 이름은 " + super.getName() +"입니다.");
    }

}
