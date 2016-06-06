package com.tripolis.qa.dialogueweb.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DiaEditContactDatabaseDetailsPage extends AbstractPage {
	
	public DiaEditContactDatabaseDetailsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	Logger logger = LoggerFactory.getLogger(DiaEditContactDatabaseDetailsPage.class);
	
	@FindBy(xpath=".//*[@id='main']/div/div[1]", timeoutInSeconds="5")
	private WebElementFacade headerNameText;
	
	@FindBy(css="option[selected]", timeoutInSeconds="5")
	private WebElementFacade presentationField;
	
	public String getHeaderNameText() {
		return headerNameText.getText();
	}
	
	public void select_PresentationField(String keyword) {
		presentationField.selectByVisibleText(keyword);
	}
	
	public boolean getEditContactDatabaseUrl() {
		logger.info("Get Edit Contact Database URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/contacts/editContactDatabaseDetails.html");	
	}
	
}
