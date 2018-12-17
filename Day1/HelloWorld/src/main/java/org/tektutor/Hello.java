package org.tektutor;

public class Hello {

	public String sayHello() {
		return "Hello Java!";
	}
	
	public static void main ( String[] args ) {

		Hello obj = new Hello();

		System.out.println ( obj.sayHello() );

	}

}
