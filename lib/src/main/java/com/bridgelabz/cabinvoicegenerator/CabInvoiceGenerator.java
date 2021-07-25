package com.bridgelabz.cabinvoicegenerator;

import java.util.HashMap;

public class CabInvoiceGenerator
{
	public HashMap<Integer,Ride[]> rideRepository = new HashMap<>();
	private static final double FARE_PER_KM = 10;
	private static final double FARE_PER_MINUTE = 1;
	private static final double MINIMUM_FARE = 5;

	public double getfare(double distance, double time)
	{
		double fare = distance*FARE_PER_KM + time*FARE_PER_MINUTE;
		return Math.max(MINIMUM_FARE, fare); 
	}

	public InvoiceSummary calculateTotalFare(int userId,Ride[] rides) 
	{
		double totalFare = 0;
		for (Ride ride : rides) 
		{
			totalFare+=getfare(ride.distance, ride.time);
		}
		rideRepository.put(userId,rides);
		return  new InvoiceSummary(userId,rides.length, totalFare);
	}
}
