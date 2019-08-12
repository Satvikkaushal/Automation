package automation_416;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Skaushal\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement text = driver.findElement(By.xpath(".//table[@width='270']"));
	    System.out.println(text.getText());
		driver.findElement(By.xpath(".//a[starts-with(@href,'mercurysignon.php')]")).click();
		driver.findElement(By.xpath(".//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name='login']")).click();
		Boolean signedin=driver.findElement(By.xpath(".//a[@href='mercurysignoff.php']")).isDisplayed();
		String signedIn=Boolean.toString(signedin); 
		if(signedIn == "true")
		{
			System.out.println("Login Successful");
		}
		Select count = new Select(driver.findElement(By.xpath("	.//*[@name='passCount']")));
		count.selectByIndex(1);
		Select fromport = new Select(driver.findElement(By.xpath(".//*[@name='fromPort']")));
		fromport.selectByIndex(4);
		Select toport = new Select(driver.findElement(By.xpath(".//*[@name='toPort']")));
		toport.selectByIndex(3);
		driver.findElement(By.xpath(".//*[@value  ='First']")).click();
		Select airline = new Select(driver.findElement(By.xpath(".//*[@name='airline']")));
		airline.selectByIndex(2);
		driver.findElement(By.xpath(".//*[@name='findFlights']")).click();
		driver.findElement(By.xpath(".//*[@name='reserveFlights']")).click();
		driver.findElement(By.xpath(".//input[@name='passFirst0']")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name='passLast0']")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name='passFirst1']")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name='passLast1']")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name='creditnumber']")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name='cc_frst_name']")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name=\"cc_mid_name\"]")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name=\"cc_last_name\"]")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name=\"billAddress2\"]")).sendKeys("mercury");
		driver.findElement(By.xpath(".//*[@name='buyFlights']")).click();
		driver.findElement(By.xpath(".//a[starts-with(@href,'mercurysignoff.php')]")).click();
	}

}
