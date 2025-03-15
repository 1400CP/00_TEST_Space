package com.kh.test;

import java.util.ArrayList;

import com.kh.model.vo.Fruit;

public class MyCollection {

	public void test() {
			
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
		
		for(int i=0; i<3; i++) {
			System.out.println(list.get(i));
		}
		
	}

}
