package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {

	@Test
	public void testSayHello() {

		Hello obj = new Hello();

		String actualOutput = obj.sayHello();
		String expectedOutput = "Hello Java!";

		assertEquals ( expectedOutput, actualOutput );
		
	}

}
