package com.base_class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	public static Select rt;

	public static WebDriver browserlaunch(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");

			driver = new FirefoxDriver();

		} else if (type.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\driver\\ie.exe");

			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Browser Mismatch");
		}

		driver.manage().window().maximize();
		return driver;

	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void currenturl(WebDriver driver2) {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);

	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void clickonelement(WebElement element) {

		element.click();

	}

	public static void inputelement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void wait(int secs) {

		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);

	}

	public static void mouseaction(WebElement element, String str) {
		Actions act = new Actions(driver);

		if (str.equalsIgnoreCase("left")) {
			act.click(element).build().perform();
		}
		if (str.equalsIgnoreCase("right")) {
			act.contextClick(element).build().perform();
		}
		if (str.equalsIgnoreCase("doubleclick")) {
			act.doubleClick(element).build().perform();
		}
		if (str.equalsIgnoreCase("move")) {
			act.moveToElement(element).build().perform();
		}
	}

	public static void dropdown(WebElement element, String type, String value) {
		rt = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			rt.selectByIndex(parseInt);
		} else if (type.equalsIgnoreCase("value")) {
			rt.selectByValue(value);

		} else if (type.equalsIgnoreCase("text")) {
			rt.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("multiple")) {
			boolean multiple = rt.isMultiple();
			System.out.println(multiple);

		}

	}

	public static void jsclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	public static void jsscroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void jsscroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");

	}

	public static void screenshot(String b) throws IOException {
		TakesScreenshot str = (TakesScreenshot) driver;

		File source = str.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\screenshot\\" + b + ".png");

		FileUtils.copyFile(source, destination);
	}
	public static void loop(int value,WebElement element) {
		for (int i = 0; i < value; i++) {
			clickonelement(element);
			
		}
		
		
		
	}
	

}
