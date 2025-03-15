package com.kh.model.vo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test22 {
	
	// 파일에 객체를 저장하기 위한 메소드

	public void fileSave(String fileName) {

		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(fileName))) {

			objOut.writeObject(new Food("사과", 20));

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
