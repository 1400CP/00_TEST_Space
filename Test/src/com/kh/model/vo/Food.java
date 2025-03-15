package com.kh.model.vo;

import java.util.ArrayList;

public class Food {
	
// 1. 직렬화 선언
	ArrayList<Food> list = new ArrayList<Food>();
	
// 2. 필드 선언		
	private String name;
	private int kcal;

//	private String name;
//	private int kcal;
	
// 3. 기본 생성자, 매개변수 생성자
	public Food() {}
	
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
	
	
// 4. 필드에 대한 게터 세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	
// 5. toString() 메소드 리턴
	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}
	
}
