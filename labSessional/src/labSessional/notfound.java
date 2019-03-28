package labSessional;

import static org.junit.Assert.*;

import org.junit.Test;

public class notfound {

	@Test
	public void test() {
		
			String s="hello123";
			char ch='@';
			int result=Main.compare(s,ch);
			assertEquals(result,-1);
		
	}

}
