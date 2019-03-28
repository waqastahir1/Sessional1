package labSessional;

import static org.junit.Assert.*;

import org.junit.Test;

public class repeating {

	@Test
	public void test() {

			String s="hello@123 @jac";
			char ch='@';
			int result=Main.compare(s,ch);
			assertEquals(result,6);
		
	}

}
