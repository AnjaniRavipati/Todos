package com.reactTodoMVC.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.reactTodoMVC.pageObjects.TodosSearchBox;

public class TC_SearchTest_001 extends BaseClass{

	@Test
	public void searchTest()
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		TodosSearchBox tsb = new TodosSearchBox(driver);
		tsb.setSearch(searchtxt1);
		
		logger.info("Entered text");		
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		
		//Clcik Radio button and Active link
		tsb.clickRadiobtn();
		logger.info("Selected radio button");	
		
		tsb.clickActive();
		logger.info("Click on Active link");	
		
		tsb.setSearch(searchtxt2);
		
		Actions action1 = new Actions(driver);
		action1.sendKeys(Keys.ENTER).perform();
		
		//Clicking Completed link
		tsb.clickCompleted();
		logger.info("Click on completed link");
		
		//click clear completed link
		
		tsb.clickclearCompleted();
		logger.info("Click on clearcompleted link");
		
		
		
		
		
	}
}
