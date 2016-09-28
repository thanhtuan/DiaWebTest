package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/contacts/createContactGroupFromFilter.html")
public class DiaCreateContactGroupFromFilterPage extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(DiaCreateContactGroupFromFilterPage.class);
	
	@FindBy(id="grouptype", timeoutInSeconds="5")
	private WebElementFacade groupType; 
	
	@FindBy(name="parentContactGroupId", timeoutInSeconds="5")
	private WebElementFacade parentContactGroup;
	
	public boolean getCreateContactGroupFromFilterUrl() {
		logger.info("Get Create Contact Group From Filter URL");
		return getDriver().getCurrentUrl().contains("/dialogue/contacts/createContactGroupFromFilter.html");
	}
	
	public void select_GroupType(String keyword) {
		groupType.selectByValue(keyword);
	}
	
	public void select_ParentContactGroup(String keyword) {
		parentContactGroup.selectByVisibleText(keyword);
	}
	
	
}
