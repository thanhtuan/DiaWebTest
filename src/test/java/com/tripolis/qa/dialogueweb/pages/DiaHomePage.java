package com.tripolis.qa.dialogueweb.pages;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/home.html")
public class DiaHomePage extends AbstractPage {
	
	public DiaHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	Logger logger = LoggerFactory.getLogger(DiaHomePage.class);
	
	public boolean getHomeurl() {
		logger.info("Get Home URL");
		return driver.getCurrentUrl().contains("/dialogue/home.html");	
	}

	@Override
	public String getClientName() {
		// TODO Auto-generated method stub
		return super.getClientName();
	}
}
