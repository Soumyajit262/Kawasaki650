package com.hrm.comcast.Testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoIbiboHotelList {
	@Test
	public void goIbiboHotelBooking()
	{
		/*Launching the Browser*/
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*Application Launch*/
		driver.get("https://www.goibibo.com/hotels/");
		
		/*Selecting India*/
		driver.findElement(By.xpath("//h4[text()='India']")).click();
		

		
		/*Choose the check-in and check-out time*/
		driver.findElement(By.xpath("//div[text()='Check-in']")).click();
		driver.findElement(By.xpath("//span[text()='March 2022']/ancestor::section[@class='dcalendar-newstyles__CalenderOuterWrapper-sc-1i003by-1 eERgSh']/descendant::span[text()='31']")).click();
		driver.findElement(By.xpath("//span[text()='April 2022']/ancestor::div[@class='dcalendar-newstyles__CalenderMonthContainer-sc-1i003by-2 kCupBq']/descendant::span[text()='1']")).click();
		
		/*Choose the number of guests*/
		
		driver.findElement(By.xpath("//span[text()='Guests & Rooms']")).click();
		
		driver.findElement(By.xpath("//span[text()='Children']/ancestor::div[@class='dwebCommonstyles__CenteredDivWrap-sc-112ty3f-1 PaxWidgetstyles__ContentItemWrapperDiv-sc-gv3w6r-2 ibYPGm fAmNIr']/descendant::span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='Children']/ancestor::div[@class='dwebCommonstyles__CenteredDivWrap-sc-112ty3f-1 PaxWidgetstyles__ContentItemWrapperDiv-sc-gv3w6r-2 ibYPGm fAmNIr']/descendant::span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='Children']/ancestor::div[@class='dwebCommonstyles__CenteredDivWrap-sc-112ty3f-1 PaxWidgetstyles__ContentItemWrapperDiv-sc-gv3w6r-2 ibYPGm fAmNIr']/descendant::span[text()='+']")).click();
	      
		/*Choose the age of first child*/
	    driver.findElement(By.xpath("//span[text()='1']/ancestor::div[@class='dwebCommonstyles__CenteredDivWrap-sc-112ty3f-1 PaxWidgetstyles__ContentItemWrapperDiv-sc-gv3w6r-2 ibYPGm fAmNIr']/descendant::h4")).click();
	    driver.findElement(By.xpath("//li[text()='5']")).click();
	    
	    /*Choose the age of second child*/
	    driver.findElement(By.xpath("//span[text()='2']/ancestor::div[@class='dwebCommonstyles__CenteredDivWrap-sc-112ty3f-1 PaxWidgetstyles__ContentItemWrapperDiv-sc-gv3w6r-2 ibYPGm fAmNIr']/descendant::h4")).click();
	    driver.findElement(By.xpath("//li[text()='7']")).click();
	    
	    /*Choose the age of third child*/
	    driver.findElement(By.xpath("//span[text()='3']/ancestor::div[@class='dwebCommonstyles__CenteredDivWrap-sc-112ty3f-1 PaxWidgetstyles__ContentItemWrapperDiv-sc-gv3w6r-2 ibYPGm fAmNIr']/descendant::h4")).click();
	    driver.findElement(By.xpath("//li[text()='10']")).click();
	    
	   /*Click on done after choosing the age of children*/
	    driver.findElement(By.xpath("//button[text()='Done']")).click();
	    
	    /*choose the destination place*/
		WebElement search = driver.findElement(By.xpath("//input[@id='downshift-1-input']"));	
		search.click();
		search.sendKeys("Goa");
		driver.findElement(By.xpath("//input[@value='Goa']")).click();
		driver.findElement(By.xpath("//ul[@class='HomePageAutosuggeststyles__SearchMenuStyles-sc-1v6s32j-3 dhKBlu']")).click();
		
		 /*click on search*/
		driver.findElement(By.xpath("//button[text()='Search Hotels']")).click();
		
		/*Printing the list of hotels*/
		List<WebElement> hotelNames = driver.findElements(By.xpath("//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-9 bjZxoj']"));
		int count = 0;
		for(WebElement wb : hotelNames)
		{
			System.out.println("Hotel Name is: " + wb.getText());
			count++;
		}
		
		System.out.println("Total number of hotels are: " + count);
		
	    
	}

}
