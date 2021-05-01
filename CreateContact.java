package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		// Create userName
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Create password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Get the name of header and print the valuue
		String text =driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		//click the link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//create Account
		driver.findElement(By.linkText("My Home")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Mythili");
		driver.findElement(By.id("lastNameField")).sendKeys("Ravi");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Beginer for testing");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mythilisujir@gmail.com");
		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select st1 =new Select (State);
		st1.selectByVisibleText("Indiana");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Do not Waste Your time");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String Title =driver.getTitle();
		System.out.println(Title);
		
		
		
		
		
		
		
		
		
	}

}
