package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
	/*
	 * 예외 발생시키기
	 * - throw new Exception();
	 */
	try {
		throw new IOException();
	} catch (Exception e) {
		e.printStackTrace();
	}

	//NullPointerException
//	
//	String str = null;
//	
//	System.out.println(str.equals("abc"));
	
	// ArrayIndexOutOfBoundsException
	  int[] arr = new int[10];
	  for(int i = 0; i <= arr.length; i++) {
		  System.out.println(arr[i]);
	  }
	
	
	  
	  
	  
	  
	}

}
