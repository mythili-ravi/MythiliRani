package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("mythilisujir.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String text1 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).getText();
		System.out.print(text1);
		WebElement Name = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		Name.click();
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(text2);
		
		
		
		if (text1.equals(text2)) {
			
			System.out.println("Duplicated lead name same as captured lead name");}
			else {
			System.out.println("Duplicated lead name is different");
		}
	}

	}


