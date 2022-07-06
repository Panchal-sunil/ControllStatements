package org.sample;

public class NestedIf {

	public static void main(String[] args) {
		int age=10;
		int  wt=20;
		
		if(age>=10) 
			if(wt>=20 ) {
				System.out.println("True");
			}  
			else {
			System.out.println("False");
		
		}
			else {
			System.out.println("equal");
		}
	}
}
