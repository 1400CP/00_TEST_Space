package com.kh.model.vo;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.model.vo.Food;
import com.kh.model.vo.Fruit;

public class Test21{
	
//	Fruit객체를 저장 후 출력하려고 하는데 문제
	
	
//	- 전달받은 fileName 으로 파일 객체를 생성한다.
//
//	- 파일 객체와 연결하는 파일 출력스트림(????)을 생성한다.
//
//	- 파일에 Food 객체를 기록할 수 있는 객체 출력스트림을 추가한다.
//
//	- 파일에 Food 객체 정보를 기록하고 스트림들을 닫는다.
//
//	- Food 객체 샘플 : "사과", 20
	
	public void fileSave(String fileName) {}
	Scanner sc = new Scanner(System.in);
	String fileName = sc.nextLine();
//	1. ?
	
	String fn = fileName;
//	2. ??
	
	
	@Override
	public String toString() {
		return "Food [name=" + fn + ", kcal=" + kcal + "]";
	}
//	3. ???
	
	
	public void fileSave(int fileName2) {}
	String fileName2 = sc.nextLine();
//	4. ???

	String fn2 = fileName;
//	5. ???
	
	@Override
	public String toString() {
		return "Food [name=" + fn + ", kcal=" + fn2 + "]";
	}
//	6.???
	
}
