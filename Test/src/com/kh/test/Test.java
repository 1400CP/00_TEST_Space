package com.kh.test;

import java.util.ArrayList;
import java.util.Scanner;
import com.kh.test.person.model.vo.Person;


public class Test {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
//		for(int i=0; i<=pArr.lenght; i++) {
//			System.out.println(pArr[i].getName());
//		}
		for(int i=0; i<pArr.lenght; i++) {
			System.out.println(pArr[i].getName());
		}
	}
}


//	public void count() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("문자열을 입력해주세요 : ");
//			String str = sc.nextLine();
//			
//			if(str.equals("exit")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//				
//			}else {
//				System.out.println(str.length() + "글자 입니다.");
//				// length() : 문자열에 대한 글자 수 반환 메소드
//			}
//		}
//		
//	}

