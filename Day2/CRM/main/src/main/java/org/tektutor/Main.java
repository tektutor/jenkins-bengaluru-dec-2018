package org.tektutor;

public class Main {

	public void printModuleName() {
		System.out.println ("Main module");
	}

	public static void main ( String[] args ) {

		FrontEnd fe = new FrontEnd();
		BusinessLayer bl = new BusinessLayer();
		DataAccessLayer dal = new DataAccessLayer();
		Main mainObj= new Main();
		
		fe.printModuleName();
		bl.printModuleName();
		dal.printModuleName();
		mainObj.printModuleName();

	}

}
