package salesForce;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ass1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
        
        ChromeDriver driver= new ChromeDriver(options);
        driver.get("https://login.salesforce.com");
        driver.manage().window().maximize();
        
        
        driver.findElement(By.id("username")).sendKeys("nupela@testleaf.com");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("Bootcamp@1234");
        Thread.sleep(3000);
        driver.findElement(By.id("Login")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[text()='Service Console']")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[@title='Show Navigation Menu']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[text()='Home']")).click();
        //driver.findElement(By.xpath("//a[@class='menuItem'][@title='Home']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@title='Edit Goal']")).click();
        Thread.sleep(5000);
         
        driver.findElement(By.xpath("//input[contains(@class,'uiInputSmartNumber')]")).clear();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[contains(@class,'uiInputSmartNumber')]")).sendKeys("10000");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class=' label bBody'][text()='Save']")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[@title='Show Navigation Menu']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title='Dashboards']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a/div[@title='New Dashboard']")).click();
        Thread.sleep(5000);
        
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("Aparna_Workout");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='dashboardDescriptionInput']")).sendKeys("Testing");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Create']")).click();
        Thread.sleep(3000);
        WebElement f1 = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
        driver.switchTo().frame(f1);
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='slds-button doneEditing']")).click();
        Thread.sleep(3000);
        
        WebElement verifydash = driver.findElement(By.xpath("//h1/span[@class='slds-page-header__title slds-truncate']"));
        String verifydashvalue = verifydash.getText();
String toverifytext="Aparna_Workout";

if (verifydashvalue.equals(toverifytext)){
	 System.out.println("The text matches: " + verifydashvalue);
}else {
	  System.out.println("The text doesnt match");
}

       driver.findElement(By.xpath("//button[text()='Subscribe']")).click();
       Thread.sleep(3000);
       
  
      
       WebElement clickDaily = driver.findElement(By.xpath("//legend[text()='Frequency']/following::span[text()='Daily']"));
       clickDaily.click();
		Thread.sleep(3000);


	}

}
