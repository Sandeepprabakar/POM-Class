package org.Mini_Project_Mvn;

import java.awt.AWTException;

import java.awt.Robot;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.POMclass.Page_Object_Manager;
import com.base_class.Base_Class;
import com.pom.Book_Hotel;
import com.pom.Booking_Confm;
import com.pom.Home_Page;
import com.pom.Logout;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Runner_Class3_Adactin extends Base_Class {
	public static WebDriver driver = browserlaunch("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		url("https://adactinhotelapp.com/");

		wait(4000);
		currenturl(driver);

		clickonelement(pom.getHomepage().getUsername());
		inputelement(pom.getHomepage().getUsername(), "Rabbanis");

		clickonelement(pom.getHomepage().getPassword());
		inputelement(pom.getHomepage().getPassword(), "Buyadactin@1");

		clickonelement(pom.getHomepage().getLogin_Btn());
		wait(20);

		dropdown(pom.getSearchhotel().getLocation(), "index", "5");
		wait(20);
		dropdown(pom.getSearchhotel().getHotels(), "value", "Hotel Sunshine");
		wait(20);

		dropdown(pom.getSearchhotel().getRoomtype(), "text", "Deluxe");
		wait(20);

		dropdown(pom.getSearchhotel().getRoomnos(), "value", "2");
		wait(20);

		dropdown(pom.getSearchhotel().getAdultroom(), "index", "3");
		wait(20);

		dropdown(pom.getSearchhotel().getChildroom(), "index", "3");
		wait(20);

		clickonelement(pom.getSearchhotel().getSubmit());

		clickonelement(pom.getSelecthotel().getRadiobutton());

		clickonelement(pom.getSelecthotel().getContinue1());

		wait(20);

		clickonelement(pom.getBookhotel().getFirstname());
		inputelement(pom.getBookhotel().getFirstname(), "Sandeep");

		clickonelement(pom.getBookhotel().getLastname());
		inputelement(pom.getBookhotel().getLastname(), "Prabakaran");

		clickonelement(pom.getBookhotel().getAddress());
		inputelement(pom.getBookhotel().getAddress(), "Chennai");

		clickonelement(pom.getBookhotel().getCcvnum());
		inputelement(pom.getBookhotel().getCcvnum(), "1245678998745675");

		dropdown(pom.getBookhotel().getCcvtype(), "index", "2");

		dropdown(pom.getBookhotel().getCcvmonth(), "index", "11");
		dropdown(pom.getBookhotel().getCcvyear(), "index", "5");

		inputelement(pom.getBookhotel().getCcv(), "555");

		clickonelement(pom.getBookhotel().getBooknow());

		Thread.sleep(10000);
		wait(10);

		wait(50);

		clickonelement(pom.getBookingconfm().getItinerary());

		Thread.sleep(5000);
		wait(5);
		screenshot("Runner_class");

		Thread.sleep(5000);

		clickonelement(pom.getLogout().getLogout());
		wait(20);
		screenshot("Runner_Class2");

	}

}
