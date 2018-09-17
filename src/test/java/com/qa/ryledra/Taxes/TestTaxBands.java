package com.qa.ryledra.Taxes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestTaxBands {
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(
				new Object[][] {{7500,0},{17000,10},{25000,15},{37000, 20},{50000,25}});
	}
	
	private int input;
	private int expected;
	
	public TestTaxBands(int input, int expected)	{
		this.input = input;
		this.expected = expected;
	}
	
	@Test
	public void testTaxBand()	{
		Taxes tax = new Taxes();
		String fail = "Input " + input + " returns " + tax.taxBand(input) + " expected " + expected + "\n";
		assertEquals(fail, expected, tax.taxBand(input));
	}

}
