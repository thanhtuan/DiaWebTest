package com.tripolis.qa.dialogueweb.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/directemails/editHtml.html")
public class DiaContentDirectEmailHTMLSourcePage extends AbstractPage {

	public DiaContentDirectEmailHTMLSourcePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private static final Logger logger = LoggerFactory.getLogger(DiaContentDirectEmailHTMLSourcePage.class);
	
	public boolean getDirectEmailHTMLSourcePageUrl() {
		logger.info("Get Direct Email HTML Source Page URL");
		return driver.getCurrentUrl().contains("/dialogue/content/directemails/editHtml.html");
	}

}
