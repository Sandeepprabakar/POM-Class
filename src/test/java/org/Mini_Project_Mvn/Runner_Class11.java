package org.Mini_Project_Mvn;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.base_class.Base_Class;
import com.pom1.Address;
import com.pom1.Evening_Dress;
import com.pom1.Login;
import com.pom1.Order;
import com.pom1.Payment;
import com.pom1.Shipping;
import com.pom1.printeddress;

public class Runner_Class11 extends Base_Class {
	public static WebDriver driver = browserlaunch("chrome");
	public static Evening_Dress ed = new Evening_Dress(driver);
	public static printeddress pd = new printeddress(driver);
	public static Order or = new Order(driver);
	public static Login log = new Login(driver);
	public static Shipping sh = new Shipping(driver);
	public static Payment pay = new Payment(driver);
	public static Address add = new Address(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		url("http://automationpractice.com/index.php?id_category=10&controller=category");

		currenturl(driver);

		wait(3);

		clickonelement(ed.getPrinteddress());

		wait(5);
		clickonelement(pd.getLarger());
		wait(8);

		clickonelement(pd.getClose());
		wait(8);

		for (int i = 0; i < 2; i++) {

			mouseaction(pd.getIcon(), "doubleclick");

		}
		dropdown(pd.getSize(), "index", "1");

		clickonelement(pd.getColour());

		clickonelement(pd.getCart());

		Thread.sleep(8000);
		screenshot("automationpom1");

		Thread.sleep(8000);

		clickonelement(pd.getCheckout());
		Thread.sleep(10000);

		clickonelement(or.getCheckout());
		wait(10);

		inputelement(log.getEmail(), "sandeep99@gmail.com");

		inputelement(log.getPassword(), "Autom@tiontesting99");

		clickonelement(log.getSubmit());

		wait(10);

		clickonelement(add.getCheckout());

		wait(10);

		clickonelement(sh.getRadiobutton());

		wait(6);

		clickonelement(sh.getCheckout());
		wait(6);

		clickonelement(pay.getPay());

		wait(4);
		clickonelement(pay.getConfirm());

		screenshot("automationmvn2");

	}

}
