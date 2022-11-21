package jUnittestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddString {

	@Test
	public void test() {
		jUnitFunction ob1 = new jUnitFunction();
		String result = ob1.sumstr("Software", "Engineering");
		assertEquals("SoftwareEngineering",result);
	}

}
