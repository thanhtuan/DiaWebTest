package com.tripolis.qa.dialogueweb.pages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/login.html")
public class DiaLoginPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaLoginPage.class);
	
	@FindBy(id="loginContainer", timeoutInSeconds="5")
	private WebElementFacade loginForm;
	
	@FindBy(id="domainName", timeoutInSeconds="5")
	private WebElementFacade clientDomainName;
	
	@FindBy(id="j_username", timeoutInSeconds="5")
	private WebElementFacade userName;
	
	@FindBy(id="j_password", timeoutInSeconds="5")
	private WebElementFacade passWord;
	
	@FindBy(id="loginButton", timeoutInSeconds="5")
	private WebElementFacade loginButton;
	
	public void enter_DomainName(String keyword) {
		logger.info("Please input DomainName");
		clientDomainName.waitUntilPresent().clear();
		clientDomainName.waitUntilPresent().type(keyword);
		logger.info("already input DomainName");
    }
	
	public void enter_UserName(String keyword) {
		logger.info("Please input UserName");
		userName.waitUntilPresent().clear();
		userName.waitUntilPresent().type(keyword);
		logger.info("already input UserName");
    }
	
	public void enter_passWord(String keyword) {
		logger.info("Please input Password");
		passWord.waitUntilPresent().clear();
		passWord.waitUntilPresent().type(keyword);
		logger.info("already input Password");
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
		logger.info("Please click on Login button");
		loginButton.waitUntilClickable().click();
		logger.info("already click on Login button");
    }
	
	public String getErrorMessage() {
		return getTextMessageByAttribute("tagline");
	}
	
	public boolean getErrorLoginUrl() {
		return getDriver().getCurrentUrl().contains("/login.html?login_error=1");
	}
}
