package org.bike;

public class ktm implements Bike{

	@Override
	public void cost() {
		System.out.println("Vehicle Cost: Rs.2,50,000");
	}

	@Override
	public void speed() {
System.out.println("Vehicle Speed: 180 KPH");		
	}
public static void main(String[] args) {
	ktm k = new ktm();
	k.cost();
	k.speed();
	
}
}
