package automation_416;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class website {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Skaushal\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.ebay.com/");
		
		driver.findElement(By.xpath(".//*[@class='gh-tb ui-autocomplete-input']")).sendKeys("Cell Phones");
		driver.findElement(By.xpath(".//*[@value='Search']")).click();
		driver.findElement(By.xpath(".//*[@class='s-item__image-img']")).click();
		driver.findElement(By.xpath(".//*[@id=\"isCartBtn_btn\"]")).click();
		driver.findElement(By.xpath(".//*[@data-test-id=\"cta-top\"]")).click();
}
}
