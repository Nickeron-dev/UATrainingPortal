package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import calculation.Arithmetics;


public class TestArithmetics {
	
	private Arithmetics arithmetics;
	
	@Rule
	public final ExpectedException expected = ExpectedException.none();
	
	@Rule
	public Timeout timeout = new Timeout(3000);
	
	@Before
	public void runT() {
		arithmetics = new Arithmetics();
	}
	
	/*
	 * @Test
	 * @Rule
	 * @Before
	 * @BeforeClass
	 * @After
	 * @AfterClass
	 * @Ignore
	 */
	
	@Test
	public void testAdd() {
		// Arithmetics arithmetics = new Arithmetics(); 
		// don't need because of @Before
		double result = arithmetics.add(3, 7);
		if (result != 10) {
			Assert.fail();
		}
		
		Assert.assertTrue("Addition error!", result == 10);
		
		Assert.assertFalse(result != 10);
		
		Assert.assertNotNull(arithmetics);
		
		// since assertEquals(double, double) is deprecated
		Assert.assertEquals(result, 10.0, 0.0); 
		
	}
	
	@Ignore
	@Test
	public void testDeduct() {
		double result = arithmetics.deduct(3, 7);
		if (result != -4) {
			Assert.fail("Assert Fail Error;");
		}
		
		Assert.assertTrue("Deduction error!", result == -4);
		
		Assert.assertFalse(result != -4);
		
		Assert.assertNotNull(arithmetics);

		// since assertEquals(double, double) is deprecated
		Assert.assertEquals(result, -4.0, 0.0);
		
	}
	
	@Test
	public void testMult() {
		double result = arithmetics.mult(3, 7);
		if (result != 21) {
			Assert.fail("Assert Fail Error;");
		}
		
		Assert.assertTrue("Addition error!", result == 21);
		
		Assert.assertFalse("Multiplication error!", result != 21);
		
		Assert.assertNotNull(arithmetics);

		// since assertEquals(double, double) is deprecated
		Assert.assertEquals(result, 21.0, 0.0);
		
	}
	
	@Test
	public void testDiv() {
		double result = arithmetics.div(10, 5);
		if (result != 2.0) {
			Assert.fail();
		}
		
		Assert.assertTrue("Addition error!", result == 2.0);
		
		Assert.assertFalse(result != 2.0);
		
		Assert.assertNotNull(arithmetics);
		
		// since assertEquals(double, double) is deprecated
		Assert.assertEquals(result, 2.0, 0.0);
		
	}
	
	//@Test(expected = ArithmeticException.class)
	@Test
	public void testDivException() {
		expected.expect(ArithmeticException.class);
		arithmetics.div(10.0, 0.0);
	}
	
	//@Test(timeout = 3000)	// in case if it will be longer than 3 sec
	@Test
	public void testDivTimeout() {
		arithmetics.div(10.0, 5.0);
	}
}
