package com.reactTodoMVC.testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.reactTodoMVC.pageObjects.TodosSearchBox;

public class TC_WindowHandler1_002 extends BaseClass{

@Test
public void windowHandler() throws InterruptedException {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		
		//System.out.println("Parent window"+parent);
		
		TodosSearchBox tsb = new TodosSearchBox(driver);
		 tsb.clickLink();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		int count = allWindows.size();
		
		System.out.println("Total windows"+count);
		
		for(String child:allWindows) 
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				System.out.println("Child window title is" + driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		System.out.println("Parent window title is "+ driver.getTitle());
	}

}
