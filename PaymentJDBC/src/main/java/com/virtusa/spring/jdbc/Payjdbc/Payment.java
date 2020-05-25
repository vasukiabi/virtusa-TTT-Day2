package com.virtusa.spring.jdbc.Payjdbc;

public class Payment {
	private int Money;
	private String name;
	private int accnum;

		public Payment( int Money,String name,int accnum) {
			
			this.Money = Money;
			this.name=name;
			this.accnum=accnum;
			//this.show();
			//System.out.println("PAY con");
		}
		
		public int getMoney() {
			return Money;
		}
		public void setMoney(int Money) {
			this.Money = Money;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAccnum() {
			return accnum;
		}
		public void setAccnum(int accnum) {
			this.accnum = accnum;
		}
		
		@Override
		public String toString() {
			return "Payment [Money=" + Money + ", name=" + name  +",accnum=" +accnum + "]";
		}

}
