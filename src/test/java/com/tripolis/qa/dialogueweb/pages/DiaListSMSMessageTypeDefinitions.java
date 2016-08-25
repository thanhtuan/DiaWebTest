package com.tripolis.qa.dialogueweb.pages;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;

@DefaultUrl("/dialogue/admin/content/listSmsMessageTypeDefinitions.html")
@NamedUrls(
		  {
		    @NamedUrl(name = "wId", url = "?wId={1}")
		  }
		)
public class DiaListSMSMessageTypeDefinitions extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaListSMSMessageTypeDefinitions.class);
	
	@FindBy(id="checkAll", timeoutInSeconds="5")
	private WebElementFacade selectedAllSMSType;
	
	@FindBy(xpath=".//*[@class='tbody']/tr", timeoutInSeconds="5")
	private List<WebElementFacade> listSMSTypes;
	
	@FindBy(xpath=".//*[@id='body']/div[6]/div/div[4]/div/button[1]", timeoutInSeconds="5")
	private WebElementFacade confirmedOkButton;
	
	@FindBy(xpath=".//*[@id='body']/div[6]/div/div[4]/div/button[2]", timeoutInSeconds="5")
	private WebElementFacade confirmedCancelButton;
	
	public boolean getListSMSTypeDefinitionUrl() {
		logger.info("Get List SMS Type Definition URL");
		return getDriver().getCurrentUrl().contains("/dialogue/admin/content/listSmsMessageTypeDefinitions.html");	
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
	
	public void allSMSType(boolean value) {
		setCheckbox(selectedAllSMSType.waitUntilPresent(), value);
	}
	
	public void findSMSype(String value) {
		value = value.trim();
		int itemCount = listSMSTypes.size();
		for(int i=0; i < itemCount; i++) {
			String smsTypelabel = listSMSTypes.get(i).findBy(".//td[2]/div").waitUntilPresent().getText().trim();
			if(value.equals(smsTypelabel)) {
				WebElementFacade selected = listSMSTypes.get(i).findBy(".//td[1]/input[2]");
				setCheckbox(selected, true);
			}
		}
	}
	
	public String getSuccessfulMessage() {
		return getTextMessageByAttribute("taglineSucces");
	}

}
