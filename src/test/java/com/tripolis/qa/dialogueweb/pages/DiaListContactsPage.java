package com.tripolis.qa.dialogueweb.pages;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/contacts/listContacts.html")
public class DiaListContactsPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaListContactsPage.class);
	
	@FindBy(xpath=".//*[@id='main-hd']/ul/li/a", timeoutInSeconds="5")
	private WebElementFacade newLink; 
	
	@FindBy(xpath=".//*[@id='test']/thead/tr[1]/td[2]/div", timeoutInSeconds="5")
	private WebElementFacade filterEmail;
	
	@FindBy(xpath=".//*[@id='test']/thead/tr[1]/td[3]/div", timeoutInSeconds="5")
	private WebElementFacade filterName;
	
	@FindBy(xpath=".//*[@id='test']/thead/tr[1]/td[4]/div", timeoutInSeconds="5")
	private WebElementFacade filterMobile;
	
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
		return getDriver().getCurrentUrl().contains("/dialogue/contacts/listContacts.html");
	}
	
	public void clickNewLink() {
		logger.info("Please click on New Link");
		newLink.waitUntilClickable().click();	
		logger.info("already click on New Link");
    }
	
	
	public void typeAndEnterFilterEmail(String keyword) {
		logger.info("Please type and enter Filter Email");
		filterEmail.waitUntilClickable().click();
		WebElementFacade dynFilterInputEmail = filterEmail.find(By.id("dynFilterInput"));
		dynFilterInputEmail.waitUntilPresent().typeAndEnter(keyword);
		logger.info("already type and enter Filter Email");
	}
	
	public void typeAndEnterFilterName(String keyword) {
		logger.info("Please type and enter Filter Name");
		filterName.waitUntilClickable().click();
		WebElementFacade dynFilterInputName = filterName.find(By.id("dynFilterInput"));
		dynFilterInputName.waitUntilPresent().typeAndEnter(keyword);
		logger.info("already type and enter Filter Name");
	}
	
	public void typeAndEnterFilterMobile(String keyword) {
		logger.info("Please type and enter Filter Mobile");
		filterMobile.waitUntilClickable().click();
		WebElementFacade dynFilterInputMobile = filterMobile.find(By.id("dynFilterInput"));
		dynFilterInputMobile.waitUntilPresent().typeAndEnter(keyword);
		logger.info("already type and enter Filter Mobile");
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
			String contactEmail = listContacts.get(i).findBy(".//td[5]/div").waitUntilPresent().getText().trim();
			if(value.equals(contactEmail)) {
				WebElementFacade selected = listContacts.get(i).findBy(".//td[1]/input[2]");
				setCheckbox(selected, true);
			}
		}
	}

}
