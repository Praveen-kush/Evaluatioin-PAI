package Registration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://way2automation.com/way2auto_jquery/registration.php#load_box");
		driver.findElement(By.xpath("//fieldset[@class='fieldset']//input[@name='name']")).sendKeys("John");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Deo");
		driver.findElement(By.xpath("//label[normalize-space()='Single']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Cricket']")).click();
		//Country Dropdown
		WebElement countryDropdown = driver.findElement(By.xpath("//form[@id='register_form']//label[contains(text(),'Country:')]"));
		Select countrySelect = new Select(countryDropdown);
		countrySelect.selectByVisibleText("India");
		//DOB Dropdown
		WebElement monthDropdown = driver.findElement(By.name("Month"));
		Select monthSelect = new Select(monthDropdown);
		monthSelect.selectByVisibleText("January");
		
		WebElement dayDropdown = driver.findElement(By.name("Day"));
		Select daySelect = new Select(dayDropdown);
		daySelect.selectByVisibleText("1");
		
		WebElement yearDropdown = driver.findElement(By.name("Year"));
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//fieldset[@class='fieldset']//input[@name='phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//fieldset[@class='fieldset']//input[@name='username']")).sendKeys("johndeo123");
		driver.findElement(By.xpath("//fieldset[@class='fieldset']//input[@name='email']")).sendKeys("john.doe@example.com");
        
		WebElement uploadInput = driver.findElement(By.xpath("//fieldset[@class='fieldset']//input[@name='email']"));
		uploadInput.sendKeys("C:\\Users\\Dell\\Downloads\\Praveen Kumar Kushwaha (8).jpg");
		
		
		driver.findElement(By.xpath("//form[@id='register_form']//fieldset//textarea")).sendKeys("Automation Testing Execution");
		driver.findElement(By.xpath("//fieldset[@class='fieldset']//input[@name='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@name='c_password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		
		
		
		
		
		
	}

}
