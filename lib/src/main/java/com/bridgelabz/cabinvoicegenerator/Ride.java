package com.bridgelabz.cabinvoicegenerator;

public class Ride
{

	public double distance;
	public double time;
	public Ride(double distance, double time) 
	{
		super();
		this.distance = distance;
		this.time = time;
	}
	@Override
	public String toString() 
	{
		return "Ride [distance=" + distance + ", time=" + time + "]";
	}

}
