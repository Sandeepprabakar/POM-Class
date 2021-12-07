package com.POMclass;

import org.openqa.selenium.WebDriver;

import com.pom1.Address;
import com.pom1.Evening_Dress;
import com.pom1.Login;
import com.pom1.Order;
import com.pom1.Payment;
import com.pom1.Shipping;
import com.pom1.printeddress;

public class Page_Object_Manager_Automation {
	public WebDriver driver;
	
	private Evening_Dress ed;
	private printeddress pd;
	private Order or;
	private Login log;
	private Shipping sh;
	private Payment pay;
	private Address add;
	
	public Page_Object_Manager_Automation(WebDriver driver2) {
		this.driver = driver2;
	}
	public Evening_Dress getEveningdress() {
		if (ed==null) {
			ed = new Evening_Dress(driver);
			
		}
		return ed;
	}
	public printeddress getPrinteddress() {
		if (pd==null) {
			pd = new printeddress(driver);
		}
		return pd;
	}
	public Order getOrder() {
		if (or==null) {
			or = new Order(driver);
		}
		return or;
	}
	public Login getLogin() {
		if (log==null) {
			log = new Login(driver);
		}
		return log;
	}
	public Shipping getShipping() {
		if (sh==null) {
			sh = new Shipping(driver);
		}
		
		return sh;
	}
	public Payment getPayment() {
		if (pay==null) {
			pay = new Payment(driver);
		}
		return pay;
	}
	public Address getAddress() {
		if (add==null) {
			add = new Address(driver);
		}
		return add;
	}
	
	
	

}
