package com.tripolis.qa.dialogueweb.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/contacts/listContacts.html")
public class DiaListContactsPage extends AbstractPage {

	public DiaListContactsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private static final Logger logger = LoggerFactory.getLogger(DiaListContactsPage.class);
	
	@FindBy(xpath=".//*[@id='main-hd']/ul/li/a", timeoutInSeconds="5")
	private WebElementFacade newLink; 
	
	@FindBy(id="checkAll", timeoutInSeconds="5")
	private WebElementFacade selectedAllContacts;
	
	@FindBy(xpath=".//*[@class='tbody']/tr", timeoutInSeconds="5")
	private List<WebElementFacade> listContacts;
	
	@FindBy(id="confirmBox", timeoutInSeconds="5")
	private WebElementFacade confirmButton;
	
	@FindBy(xpath=".//*[@id='body']/div[6]/div/div[4]/div[2]/button[1]", timeoutInSeconds="5")
	private WebElementFacade confirmedOkButton;
	
	@FindBy(xpath=".//*[@id='body']/div[6]/div/div[4]/div[2]/button[2]", timeoutInSeconds="5")
	private WebElementFacade confirmedCancelButton;
	
	public boolean getListContactsUrl() {
		logger.info("Get List Contacts URL");
		return driver.getCurrentUrl().contains("/dialogue/contacts/listContacts.html");
	}
	
	public void clickNewLink() {
		logger.info("Please click on New Link");
		newLink.waitUntilClickable().click();	
		logger.info("already click on New Link");
    }
	
	public void clickconfirmButton() {
		logger.info("Please click on confirmed Button");
		confirmButton.waitUntilClickable().click();
		logger.info("already click on confirmed Button");
	}
	
	public void clickConfirmedOkButton() {
		logger.info("Please click on Ok Button");
		confirmedOkButton.waitUntilEnabled().click();
		logger.info("already click on Ok Button");
	}
	
	public void clickConfirmedCancelButton() {
		logger.info("Please click on Cancel Button");
		confirmedCancelButton.waitUntilClickable().click();
		logger.info("already click on Cancel Button");
	}
	
	public void allContacts(boolean value) {
		setCheckbox(selectedAllContacts.waitUntilPresent(), value);
	}
	
	public void findContact(String value) {
		value = value.trim();
		int itemCount = listContacts.size();
		for(int i=0; i < itemCount; i++) {
			String contactEmail = listContacts.get(i).findBy(".//td[5]/div").waitUntilPresent().getText();
			if(value.equals(contactEmail)) {
				WebElementFacade selected = listContacts.get(i).findBy(".//td[1]/input[2]");
				setCheckbox(selected, true);
			}
		}
	}

}
