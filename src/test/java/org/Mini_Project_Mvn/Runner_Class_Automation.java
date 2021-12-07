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

import com.POMclass.Page_Object_Manager_Automation;
import com.base_class.Base_Class;
import com.pom1.Address;
import com.pom1.Evening_Dress;
import com.pom1.Login;
import com.pom1.Order;
import com.pom1.Payment;
import com.pom1.Shipping;
import com.pom1.printeddress;

public class Runner_Class_Automation extends Base_Class {
	public static WebDriver driver = browserlaunch("chrome");

	public static Page_Object_Manager_Automation pom = new Page_Object_Manager_Automation(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		url("http://automationpractice.com/index.php?id_category=10&controller=category");

		currenturl(driver);

		wait(3);

		clickonelement(pom.getEveningdress().getPrinteddress());

		wait(5);
		clickonelement(pom.getPrinteddress().getLarger());
		wait(8);

		clickonelement(pom.getPrinteddress().getClose());
		wait(8);

		for (int i = 0; i < 2; i++) {

			mouseaction(pom.getPrinteddress().getIcon(), "doubleclick");

		}
		dropdown(pom.getPrinteddress().getSize(), "index", "1");

		clickonelement(pom.getPrinteddress().getColour());

		clickonelement(pom.getPrinteddress().getCart());

		Thread.sleep(8000);
		screenshot("automationpom1");

		Thread.sleep(8000);

		clickonelement(pom.getPrinteddress().getCheckout());
		Thread.sleep(10000);

		clickonelement(pom.getOrder().getCheckout());
		wait(10);

		inputelement(pom.getLogin().getEmail(), "sandeep99@gmail.com");

		inputelement(pom.getLogin().getPassword(), "Autom@tiontesting99");

		clickonelement(pom.getLogin().getSubmit());

		wait(10);

		clickonelement(pom.getAddress().getCheckout());

		wait(10);

		clickonelement(pom.getShipping().getRadiobutton());

		wait(6);

		clickonelement(pom.getShipping().getCheckout());
		wait(6);

		clickonelement(pom.getPayment().getPay());

		wait(4);
		clickonelement(pom.getPayment().getConfirm());

		screenshot("automationmvn2");

	}

}
