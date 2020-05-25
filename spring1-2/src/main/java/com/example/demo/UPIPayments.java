package com.example.demo;

//import com.virtusa.spring.collections.springcollections.Person;

public class UPIPayments extends PaymentBeam1  {
	
	
	
	private String UPImessage1;
	//private String message2;
	
	
	
	private WalletPayments wp;
	public void setUPImessage1(String UPImessage1){
	this.UPImessage1 = UPImessage1;
	}
	public String getUPImessage1(){
		//System.out.println("UPI Payment Message1 : " + UPImessage1);
		return UPImessage1;
		}


	
	public UPIPayments(WalletPayments wp) {
		super(2000,"Krishin");
		this.wp = wp;
	}
	
	public WalletPayments getWalletPayments() {
		return wp;
	}
	
	
	public void setWalletPayments(WalletPayments wp) {
		this.wp = wp;
	}
	
	public String toString() {
		return " UPIPayments[wp=" + wp  + ", getUPImessage1()=" + getUPImessage1()
				+ ", getWalletPayments()=" + getWalletPayments() + "]";
	}
}
