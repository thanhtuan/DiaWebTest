package com.tripolis.qa.dialogueweb.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/admin/content/listWorkspaces.html")
public class DiaListWorkspacesPage extends AbstractPage {
	
	public DiaListWorkspacesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	Logger logger = LoggerFactory.getLogger(DiaListWorkspacesPage.class);
	
	@FindBy(xpath=".//*[@id='table_row1']/td[1]/input[2]", timeoutInSeconds="5")
	private WebElementFacade selectedDeletedWorkspace;
	
	@FindBy(id="modalText", timeoutInSeconds="5")
	private WebElementFacade confirmedMessage;
	
	public boolean getListWorkspacesUrl() {
		logger.info("Get List Workspaces URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/content/listWorkspaces.html");		
	}
	
	public String getconfirmedMessage() {
		return confirmedMessage.waitUntilPresent().getText();
	}
	
	public void select_Workspaces() {
		selectedDeletedWorkspace.waitUntilClickable().click();
	}
	
}
