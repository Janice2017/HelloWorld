package Ja;

import org.junit.Test;

import junit.framework.Assert;

public class CalTest {
	@Test
	public void tstadd() {
		Calculator c=new Calculator();
		int result=c.add(3, 2);
		Assert.assertEquals(5, result);
	}
	
	public void tstsub() {
		Calculator c=new Calculator();
		int result=c.sub(2, 1);
		Assert.assertEquals(1, result);
	}
}
