package com.tripolis.qa.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/home.html")
public class DiaHomePage extends PageObject {

	public WebDriver driver=null;
	Logger logger = LoggerFactory.getLogger(DiaHomePage.class);
	
	public DiaHomePage(WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText="Home")
	private WebElementFacade menuHomePage;
	
	@FindBy(id="clientname")
	private WebElementFacade spanText; 
	
	public void navigateToAdminPage() {
		logger.info("navigate To Admin Page");
		DiaAdminPage adminpage = this.switchToPage(DiaAdminPage.class);
		adminpage.open();
		logger.info("/dialogue/administration.html");
	}
	
	public void clickOnHomeMainMenu() {
		((JavascriptExecutor)driver).executeScript("document.getElementById('ElementID').click()");
		//driver.findElement(By.linkText("Home")).click();
		
    }
	
	public boolean getHomeurl() {
		logger.info("Get Home URL");
		return driver.getCurrentUrl().contains("/dialogue/home.html");
		
	}
}
