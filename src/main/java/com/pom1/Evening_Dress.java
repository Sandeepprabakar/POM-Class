package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evening_Dress {
	public WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Printed Dress')]")
	private WebElement printeddress;

	public Evening_Dress(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);	}
	
	public WebElement getPrinteddress() {
		return printeddress;
	}
	
	

}
