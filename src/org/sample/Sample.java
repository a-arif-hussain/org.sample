package org.sample;

public class Sample {
	
	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 0; i <= 100; i++) {
			
			if (i % 2 ==1) {
				
				count ++;
				
			}
			
		}
		
		System.out.println("Count of the Odd number is :" +count);
		
	}
}


