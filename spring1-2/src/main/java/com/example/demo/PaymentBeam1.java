package com.example.demo;

public class PaymentBeam1 {
	private int Money;
private String name;

	public PaymentBeam1( int Money,String name) {
		
		this.Money = Money;
		this.name=name;
		this.show();
	}
	
	/*
	 * public void setMessage(int Money) { this.Money = Money; }
	 * 
	 * public void getMessage() { System.out.println("Your Message : " + Money); }
	 */
	public void show()
	{
		System.out.println("Money::"+Money+" "+"name::"+name);
	}
	/*
	 * public void initIt() throws Exception {
	 * System.out.println("<<<<<<<<Init method after properties are set : " +
	 * Money); }
	 * 
	 * public void cleanUp() throws Exception {
	 * System.out.println(">>>>>>>>Spring Container is destroy! Customer clean up");
	 * }
	 */

}
