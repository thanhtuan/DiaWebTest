package com.tripolis.qa.dialogueweb.pages;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/directemails/browse.html")
public class DiaListDirectEmailsPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaListDirectEmailsPage.class);
	
	@FindBy(xpath=".//*[@class='tbody']/tr", timeoutInSeconds="5")
	private List<WebElementFacade> listDirectEmails;
	
	public boolean getListDirectEmailsUrl() {
		logger.info("Get List DirectEmails URL");
		return getDriver().getCurrentUrl().contains("/dialogue/content/directemails/browse.html");
	}

	public void findDirectEmail(String value) {
		value = value.trim();
		int itemCount = listDirectEmails.size();
		for(int i=0; i < itemCount; i++) {
			String emaillabel = listDirectEmails.get(i).findBy(".//td[2]/div").waitUntilPresent().getText().trim();
			if(value.equals(emaillabel)) {
				WebElementFacade selected = listDirectEmails.get(i).findBy(".//td[2]/div");
				selected.waitUntilClickable().click();
			}
		}
	}
}
