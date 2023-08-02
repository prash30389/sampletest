package AssignmentQspiders;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListener.class)
public class Assignments14 {

	WebDriver driver;// ----------------------for click on particular web
	// element-----------------------------------------

	public static void sendKeysByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].value='h'", element);
	}

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumContent\\selenium assigment\\SeleniumAssigmentt\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("On script start" + new Date());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	// --------------------Write a script to Handle Auto Complete
	// widgets---------------------------
	@Test
	public void scriptOne() throws InterruptedException {

		driver.get("http://demo.automationtesting.in/AutoComplete.html");
		WebElement web = driver.findElement(By.xpath("(//div[@class='container'])[3]/div[2]/div[1]/div/input"));
        web.sendKeys("h");
		
		List<WebElement> suggstedListElm = driver.findElements(By.xpath(
				"//ul[contains(@class,'ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all')]//a"));

		for (WebElement sle : suggstedListElm)

			System.out.println(sle.getText());

		System.out.println("------------------------------------------------------");
		System.out.println();
	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}

}
