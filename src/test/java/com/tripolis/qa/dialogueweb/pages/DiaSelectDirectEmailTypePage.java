package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/directemails/selectType.html")
public class DiaSelectDirectEmailTypePage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaSelectDirectEmailTypePage.class);
	
	@FindBy(name="emailTypeDefId", timeoutInSeconds="5")
	private WebElementFacade directEmailTypeDropDown;
	
	public boolean getSelectDirectEmailTypeUrl() {
		logger.info("Get Select Direct Email Type URL");
		return getDriver().getCurrentUrl().contains("/dialogue/content/directemails/selectType.html");
	}
	
	public void select_DirectEmailType(String keyword) {
		directEmailTypeDropDown.selectByVisibleText(keyword);
	}

}
