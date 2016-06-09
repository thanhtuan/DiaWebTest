package com.tripolis.qa.dialogueweb.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/admin/content/editWorkspace.html")
public class DiaEditWorkspacePage extends AbstractPage {
	
	public DiaEditWorkspacePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	Logger logger = LoggerFactory.getLogger(DiaEditWorkspacePage.class);
	
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
	
	public boolean getEditWorkspacesUrl() {
		logger.info("Get Edit Workspaces URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/content/editWorkspace.html");
	}
	
	public void contactDatabaseState() {
		contactDatabase.shouldNotBeEnabled();
	}
	
	public void enter_PublicDomainNameLinkAndPage(String keyword) {
		logger.info("Please Edit Public URL for links and pages");
		publicDomainNameLinkAndPage.waitUntilPresent().clear();
		publicDomainNameLinkAndPage.waitUntilPresent().type(keyword);
		logger.info("already Edit Public URL for links and pages");
    }
	
	public void enter_PublicDomainNameImages(String keyword) {
		logger.info("Please Edit Public URL for images");
		publicDomainNameImages.waitUntilPresent().clear();
		publicDomainNameImages.waitUntilPresent().type(keyword);
		logger.info("already Edit Public URL for images");
    }
	
	public void enter_BounceDomainName(String keyword) {
		logger.info("Please Edit Bounce domain name");
		bounceDomainName.waitUntilPresent().clear();
		bounceDomainName.waitUntilPresent().type(keyword);
		logger.info("already Edit Bounce domain name");
    }
	
	public void checkbox_AddListUnsubscribeHeader(boolean value) {
		setCheckbox(addListUnsubscribeHeader.waitUntilPresent(), value);
	}

}
