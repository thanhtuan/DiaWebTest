package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/directemails/editHtml.html")
public class DiaContentDirectEmailHTMLSourcePage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaContentDirectEmailHTMLSourcePage.class);
	
	@FindBy(id="emailHtmlSourceTA", timeoutInSeconds="5")
	private WebElementFacade emailHtmlSourceBody;
	
	public boolean getDirectEmailHTMLSourcePageUrl() {
		logger.info("Get Direct Email HTML Source Page URL");
		return getDriver().getCurrentUrl().contains("/dialogue/content/directemails/editHtml.html");
	}
	
	public void enter_HtmlSourceBody(String keyword) {
		logger.info("Please input Html Source Body");
		emailHtmlSourceBody.waitUntilPresent().clear();
		emailHtmlSourceBody.waitUntilPresent().type(keyword);
		logger.info("already input Html Source Body");
    }

	public String getSuccessfulMessage() {
		return getTextMessageByAttribute("taglineSucces");
	}
}
