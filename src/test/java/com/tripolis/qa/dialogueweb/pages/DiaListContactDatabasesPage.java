package com.tripolis.qa.dialogueweb.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/admin/contacts/listContactDatabases.html")
public class DiaListContactDatabasesPage extends AbstractPage {
	
	public DiaListContactDatabasesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	Logger logger = LoggerFactory.getLogger(DiaListContactDatabasesPage.class);
	
	@FindBy(id="checkAll", timeoutInSeconds="5")
	private WebElementFacade selectedAllContactDatabases;
	
	@FindBy(xpath=".//*[@class='tbody']/tr", timeoutInSeconds="5")
	private List<WebElementFacade> listDB;
	
	@FindBy(id="modalText", timeoutInSeconds="5")
	private WebElementFacade confirmedMessage;
	
	public boolean getListContactDatabasesUrl() {
		logger.info("Get List Contact Databases URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/contacts/listContactDatabases.html");
		
	}
	
	public String getconfirmedMessage() {
		return confirmedMessage.waitUntilPresent().getText();
	}
	
	public void allContactDatabases(boolean value) {
		setCheckbox(selectedAllContactDatabases.waitUntilPresent(), value);
	}
	
	public void findContactDatabases(String value) {
		value = value.trim();
		int itemCount = listDB.size();
		for(int i=0; i < itemCount; i++) {
			String DBlabel = listDB.get(i).findBy(".//td[2]/div").waitUntilPresent().getText();
			if(value.equals(DBlabel)) {
				WebElementFacade selected = listDB.get(i).findBy(".//td[1]/input[2]");
				setCheckbox(selected, true);
			}
		}
	}
	
}
