package com.tripolis.qa.pages;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/login.html")
public class DiaLoginPage extends PageObject {
	
	@FindBy(id="loginContainer")
	private WebElementFacade loginForm;
	
	@FindBy(id="domainName")
	private WebElementFacade clientDomainName;
	
	@FindBy(id="j_username")
	private WebElementFacade userName;
	
	@FindBy(id="j_password")
	private WebElementFacade passWord;
	
	@FindBy(id="loginButton")
	private WebElementFacade loginButton;
	
	@FindBy(css="div#tagline center")
	private WebElementFacade errorMessage;
	
	public WebDriver driver=null;
	private static final Logger logger = LoggerFactory.getLogger(DiaLoginPage.class);

	public DiaLoginPage(WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public void enter_DomainName(String keyword) {
		logger.info("Please input DomainName");
		clientDomainName.type(keyword);
		logger.info("already DomainName");
    }
	
	public void enter_UserName(String keyword) {
		logger.info("Please input UserName");
		userName.type(keyword);
		logger.info("already UserName");
    }
	
	public void enter_passWord(String keyword) {
		logger.info("Please input Password");
		passWord.type(keyword);
		logger.info("already Password");
    }
	
	public boolean isshowloginForm() {
		try {
			loginForm.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void click_login() {
		loginButton.click();
		
    }
	
	public boolean getErrorLoginUrl() {
		return driver.getCurrentUrl().contains("/login.html?login_error=1");
	}
	
	public void navigateToHomePage() {
		logger.info("navigate To Home Page");
		switchToPage(DiaHomePage.class).open();
		
		logger.info("/dialogue/home.html");
	}
}
