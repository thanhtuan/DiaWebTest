package com.tripolis.qa.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DiaEditContactDatabaseDetailsPage extends PageObject {

	public WebDriver driver=null;
	Logger logger = LoggerFactory.getLogger(DiaEditContactDatabaseDetailsPage.class);
	
	public DiaEditContactDatabaseDetailsPage(WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=".//*[@id='main']/div/div[1]", timeoutInSeconds="5")
	private WebElementFacade headerNameText;
	
	@FindBy(xpath=".//*[@id='label']", timeoutInSeconds="5")
	private WebElementFacade label;
	
	@FindBy(xpath=".//*[@id='name']", timeoutInSeconds="5")
	private WebElementFacade name;
	
	@FindBy(css="option[selected]", timeoutInSeconds="5")
	private WebElementFacade presentationField;
	
	@FindBy(xpath=".//*[@id='submitOk']", timeoutInSeconds="5")
	private WebElementFacade submit;
	
	public String getHeaderNameText() {
		return headerNameText.getText();
	}
	
	public void enter_Label(String keyword) {
		logger.info("Please input Label");
		label.clear();
		label.type(keyword);
		logger.info("already input Label");
    }
	
	public void enter_Name(String keyword) {
		logger.info("Please input Name");
		name.clear();	
		keyword = keyword.toLowerCase();
		keyword = keyword.replaceAll(" ", "");
		name.type(keyword);
		logger.info("already input Name");
    }
	
	public void select_PresentationField(String keyword) {
		presentationField.selectByVisibleText(keyword);
	}
	
	public void clickSubmitButton() {
		submit.click();
	}
	
	public boolean getEditContactDatabaseUrl() {
		logger.info("Get Edit Contact Database URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/contacts/editContactDatabaseDetails.html");	
	}
	
}
