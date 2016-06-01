package com.tripolis.qa.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/admin/content/createWorkspace.html")
public class DiaCreateWorkspacePage extends PageObject {

	public WebDriver driver=null;
	Logger logger = LoggerFactory.getLogger(DiaCreateWorkspacePage.class);
	
	public DiaCreateWorkspacePage(WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="label", timeoutInSeconds="10")
	private WebElementFacade label;
	
	@FindBy(id="name", timeoutInSeconds="5")
	private WebElementFacade name;
	
	@FindBy(name="pContactDatabaseId", timeoutInSeconds="5")
	private WebElementFacade pContactDatabase;
	
	@FindBy(id="publicDomainName", timeoutInSeconds="10")
	private WebElementFacade publicDomainNameLinkAndPage;
	
	@FindBy(id="publicDomainNameImages", timeoutInSeconds="10")
	private WebElementFacade publicDomainNameImages;
	
	@FindBy(id="bounceDomainName", timeoutInSeconds="10")
	private WebElementFacade bounceDomainName;
	
	@FindBy(name="addUnsubscribeHeader", timeoutInSeconds="5")
	private WebElementFacade addListUnsubscribeHeader;
	
	@FindBy(id="submitOk", timeoutInSeconds="10")
	private WebElementFacade saveButton;
	
	public boolean getCreateWorkspacesUrl() {
		logger.info("Get Create Workspaces URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/content/createWorkspace.html");
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
	
	public void select_ContactDatabase(String keyword) {
		pContactDatabase.selectByVisibleText(keyword);
	}
	
	public void enter_PublicDomainNameLinkAndPage(String keyword) {
		logger.info("Please input Public URL for links and pages");
		publicDomainNameLinkAndPage.clear();
		publicDomainNameLinkAndPage.type(keyword);
		logger.info("already input Public URL for links and pages");
    }
	
	public void enter_PublicDomainNameImages(String keyword) {
		logger.info("Please input Public URL for images");
		publicDomainNameImages.clear();
		publicDomainNameImages.type(keyword);
		logger.info("already input Public URL for images");
    }
	
	public void enter_BounceDomainName(String keyword) {
		logger.info("Please input Bounce domain name");
		bounceDomainName.clear();
		bounceDomainName.type(keyword);
		logger.info("already input Bounce domain name");
    }
	
	public void checkbox_AddListUnsubscribeHeader() {
		addListUnsubscribeHeader.click();
	}
	
	public void clickSaveButton() {
		logger.info("Please click on save Button");
		saveButton.click();
		logger.info("already click on save Button");
	}
}
