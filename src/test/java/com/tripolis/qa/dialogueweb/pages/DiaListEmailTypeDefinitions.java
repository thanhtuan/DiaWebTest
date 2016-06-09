package com.tripolis.qa.dialogueweb.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;

@DefaultUrl("/dialogue/admin/content/listEmailTypeDefinitions.html")
@NamedUrls(
		  {
		    @NamedUrl(name = "wId", url = "?wId={1}")
		  }
		)
public class DiaListEmailTypeDefinitions extends AbstractPage {

	public DiaListEmailTypeDefinitions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	Logger logger = LoggerFactory.getLogger(DiaListEmailTypeDefinitions.class);
	
	@FindBy(xpath=".//*[@id='table_row1']/td[1]/input[2]", timeoutInSeconds="5")
	private WebElementFacade selectedDeletedEmailType;
	
	@FindBy(className="ui-dialogue-frame", timeoutInSeconds="5")
	private WebElementFacade confirmedPopup;
	
	@FindBy(xpath=".//*[@id='dialog']", timeoutInSeconds="5")
	private WebElementFacade confirmedMessage;
	
	@FindBy(xpath=".//*[@id='body']/div[6]/div/div[4]/div/button[1]", timeoutInSeconds="5")
	private WebElementFacade confirmedOkButton;
	
	@FindBy(xpath=".//*[@id='body']/div[6]/div/div[4]/div/button[2]", timeoutInSeconds="5")
	private WebElementFacade confirmedCancelButton;
	
	public boolean getListEmailTypeDefinitionUrl(String value) {
		logger.info("Get List Email Type Definition URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/content/listEmailTypeDefinitions.html?wId=" + value);	
	}
	
	public boolean isshowconfirmedPopup() {
		try {
			confirmedPopup.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public String getconfirmedMessage() {
		return confirmedMessage.waitUntilPresent().getText();
	}
	
	public void clickConfirmedOkButton() {
		logger.info("Please click on Ok Button");
		confirmedOkButton.waitUntilClickable().click();
		logger.info("already click on Ok Button");
	}
	
	public void clickConfirmedCancelButton() {
		logger.info("Please click on Cancel Button");
		confirmedCancelButton.waitUntilClickable().click();
		logger.info("already click on Cancel Button");
	}
	
	public void select_EmailType() {
		selectedDeletedEmailType.waitUntilClickable().click();
	}
	
}
