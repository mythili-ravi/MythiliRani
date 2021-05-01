package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9159089712");
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		String leadid = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
		System.out.println(leadid);
		WebElement Name = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		Name.click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("id must");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String errmsg = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(errmsg);
		if (errmsg.equals("No records to display")) {
			System.out.println("Verified no records found");}
		else {
			System.out.println("Verified records found");
			
		}
		
		
	}

		
	

}
