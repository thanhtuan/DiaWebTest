package com.tripolis.qa.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/administration.html")
public class DiaAdministrationPage extends PageObject {

	public WebDriver driver=null;
	private static final Logger logger = LoggerFactory.getLogger(DiaAdministrationPage.class);

	public DiaAdministrationPage(WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public boolean getAdministrationUrl() {
		logger.info("Get administration URL");
		return driver.getCurrentUrl().contains("/dialogue/administration.html");
		
	}
}
