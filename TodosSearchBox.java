package com.reactTodoMVC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodosSearchBox {
	
	WebDriver ldriver;
	
	public TodosSearchBox(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//input[@class='new-todo']")
	WebElement txtSearch;
	
	@FindBy(xpath ="//input[@class='toggle']")
	WebElement clkRadiobtn;
	
	@FindBy(xpath ="//a[text()='Active']")
	WebElement clkActive;
	
	@FindBy(xpath ="//a[@class='selected']")
	WebElement clkCompleted;
	
	@FindBy(xpath ="//button[@class='clear-completed']")
	WebElement clkclearCompleted;
	
	@FindBy(xpath ="//a[text()='Source']")
	WebElement clklink1;
	
	
	public void setSearch(String usearch)
	{
		txtSearch.sendKeys(usearch);
	}
	
	public void clickRadiobtn()
	{
		clkRadiobtn.click();
	}
	
	public void clickActive()
	{
		clkActive.click();
	}
	
	public void clickCompleted()
	{
		clkCompleted.click();
	}
	
	public void clickclearCompleted()
	{
		clkclearCompleted.click();
	}
	
	public void clickLink()
	{
		clklink1.click();
	}
}
