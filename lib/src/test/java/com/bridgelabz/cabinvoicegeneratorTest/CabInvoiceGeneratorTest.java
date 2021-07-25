package com.bridgelabz.cabinvoicegeneratorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.cabinvoicegenerator.CabInvoiceGenerator;

public class CabInvoiceGeneratorTest 
{
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare()
	{
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		double distance = 5.0;
		double time = 2;
		double totalfare =  cabInvoiceGenerator.getfare(distance,time);
		assertEquals(52, totalfare,0.0);
	}

	@Test
	public void givenDistanceAndTime_WhenLessThanMinimumFare_ShouldReturnTotalFare()
	{
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		double distance = 0.1;
		double time = 2;
		double totalfare =  cabInvoiceGenerator.getfare(distance,time);
		assertEquals(5, totalfare,0.0);
	}
}
