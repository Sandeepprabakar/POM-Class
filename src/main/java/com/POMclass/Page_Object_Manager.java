package com.POMclass;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel;
import com.pom.Booking_Confm;
import com.pom.Home_Page;
import com.pom.Logout;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Manager {
	public WebDriver driver;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	private Home_Page hp;
	private Search_Hotel sh;
	private Select_Hotel sh1;
	private Booking_Confm bc;
	private Logout l;
	private Book_Hotel bh;

	public Home_Page getHomepage() {
		if (hp==null) {
			
		 hp = new Home_Page(driver);
		}
		return hp;
	}
	public Search_Hotel getSearchhotel() {
		if (sh==null) {
			sh = new Search_Hotel(driver);
			}
		return sh;
	}
	public Select_Hotel getSelecthotel() {
		if (sh1==null) {
			sh1 = new Select_Hotel(driver);
			
		}
		return sh1;
	}
	public Booking_Confm getBookingconfm() {
		if (bc==null) {
			 bc = new Booking_Confm(driver);
		}
		
		return bc;
	}
	public Logout getLogout() {
	if (l==null) {
		l = new Logout(driver);
		
	}
		return l;
	}
	public Book_Hotel getBookhotel() {
		if (bh==null) {
			
			bh = new Book_Hotel(driver);
		}
		return bh;
	}

	
	
	
	
	
	

}
