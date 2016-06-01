package com.tripolis.qa.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/admin/content/editWorkspace.html")
public class DiaEditWorkspacePage extends PageObject {
	
	public WebDriver driver=null;
	Logger logger = LoggerFactory.getLogger(DiaEditWorkspacePage.class);
	
	public DiaEditWorkspacePage(WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="label", timeoutInSeconds="10")
	private WebElementFacade label;
	
	@FindBy(id="name", timeoutInSeconds="5")
	private WebElementFacade name;
	
	@FindBy(xpath=".//*[@id='workspaceForm']/div/div[3]/input[2]", timeoutInSeconds="5")
	private WebElementFacade contactDatabase;
	
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
	
	public boolean getEditWorkspacesUrl() {
		logger.info("Get Edit Workspaces URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/content/editWorkspace.html");
	}
	
	public void enter_Label(String keyword) {
		logger.info("Please Edit Label");
		label.clear();
		label.type(keyword);
		logger.info("already Edit Label");
    }
	
	public void enter_Name(String keyword) {
		logger.info("Please Edit Name");
		name.clear();	
		keyword = keyword.toLowerCase();
		keyword = keyword.replaceAll(" ", "");
		name.type(keyword);
		logger.info("already Edit Name");
    }
	
	public void contactDatabaseState() {
		contactDatabase.shouldNotBeEnabled();
	}
	
	public void enter_PublicDomainNameLinkAndPage(String keyword) {
		logger.info("Please Edit Public URL for links and pages");
		publicDomainNameLinkAndPage.clear();
		publicDomainNameLinkAndPage.type(keyword);
		logger.info("already Edit Public URL for links and pages");
    }
	
	public void enter_PublicDomainNameImages(String keyword) {
		logger.info("Please Edit Public URL for images");
		publicDomainNameImages.clear();
		publicDomainNameImages.type(keyword);
		logger.info("already Edit Public URL for images");
    }
	
	public void enter_BounceDomainName(String keyword) {
		logger.info("Please Edit Bounce domain name");
		bounceDomainName.clear();
		bounceDomainName.type(keyword);
		logger.info("already Edit Bounce domain name");
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
