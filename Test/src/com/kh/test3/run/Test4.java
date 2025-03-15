package com.kh.test3.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test4 {
	
	public static void main (String[] args) {
		
		String serverIP;
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println(serverIP);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
				
		
	}

}
