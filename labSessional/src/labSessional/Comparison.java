package labSessional;

import static org.junit.Assert.*;

import org.junit.Test;

public class Comparison {

	@Test
	public void test() {
		String s="hello@123";
		char ch='@';
		int result=Main.compare(s,ch);
		assertEquals(result,6);
	}

}
