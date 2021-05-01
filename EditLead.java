package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
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
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Mythili");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		
		String header = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		
		System.out.println(header);
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Barclays");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		String str1 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(str1);
		
		String companyname = str1.replaceAll("yyyy", "");
		System.out.println(companyname);
		
		if (companyname.equals("Barclays")) {
			System.out.println("Company name updated");}
		else {
			System.out.println("Company name not updated");
		}
		
		
		
		
		
		
		

	}


	}


