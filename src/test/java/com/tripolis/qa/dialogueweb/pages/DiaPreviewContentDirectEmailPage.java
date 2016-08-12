package com.tripolis.qa.dialogueweb.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/directemails/preview.html")
public class DiaPreviewContentDirectEmailPage extends AbstractPage {

	public DiaPreviewContentDirectEmailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private static final Logger logger = LoggerFactory.getLogger(DiaPreviewContentDirectEmailPage.class);
	
	public boolean getPreviewDirectEmailUrl() {
		logger.info("Get Preview Direct Email URL");
		return driver.getCurrentUrl().contains("/dialogue/content/directemails/preview.html");
	}

}
