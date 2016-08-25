package com.tripolis.qa.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DiaActionbarPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaActionbarPage.class);
	
	@FindBy(xpath=".//*[@id='bb-rgt']/ul[1]/li[1]/a", timeoutInSeconds="5")
	protected WebElementFacade actionBarItem1;
	
	@FindBy(xpath=".//*[@id='bb-rgt']/ul[1]/li[2]/a", timeoutInSeconds="5")
	protected WebElementFacade actionBarItem2;
	
	@FindBy(xpath=".//*[@id='bb-rgt']/ul[1]/li[3]/a", timeoutInSeconds="5")
	protected WebElementFacade actionBarItem3;
	
	@FindBy(xpath=".//*[@id='bb-rgt']/ul[1]/li[4]/a", timeoutInSeconds="5")
	protected WebElementFacade actionBarItem4;
	
	@FindBy(xpath=".//*[@id='bb-rgt']/ul[1]/li[5]/a", timeoutInSeconds="5")
	protected WebElementFacade actionBarItem5;
	
	@FindBy(xpath=".//*[@id='bb-rgt']/ul[1]/li[6]/a", timeoutInSeconds="5")
	protected WebElementFacade actionBarItem6;
	
	@FindBy(xpath=".//*[@id='bb-rgt']/ul[1]/li[7]/a", timeoutInSeconds="5")
	protected WebElementFacade actionBarItem7;
	
	public void clickOnActionBarItem1() {
		logger.info("Please click on Action Bar Item Link");
		actionBarItem1.waitUntilClickable().click();
		logger.info("already click on Action Bar Item Link");
    }
	
	public void clickOnActionBarItem2() {
		logger.info("Please click on Action Bar Item Link");
		actionBarItem2.waitUntilClickable().click();
		logger.info("already click on Action Bar Item Link");
    }
	
	public void clickOnActionBarItem3() {
		logger.info("Please click on Action Bar Item Link");
		actionBarItem3.waitUntilClickable().click();
		logger.info("already click on Action Bar Item Link");
    }
	
	public void clickOnActionBarItem4() {
		logger.info("Please click on Action Bar Item Link");
		actionBarItem4.waitUntilClickable().click();
		logger.info("already click on Action Bar Item Link");
    }
	
	public void clickOnActionBarItem5() {
		logger.info("Please click on Action Bar Item Link");
		actionBarItem5.waitUntilClickable().click();
		logger.info("already click on Action Bar Item Link");
    }
	
	public void clickOnActionBarItem6() {
		logger.info("Please click on Action Bar Item Link");
		actionBarItem6.waitUntilClickable().click();
		logger.info("already click on Action Bar Item Link");
    }
	
	public void clickOnActionBarItem7() {
		logger.info("Please click on Action Bar Item Link");
		actionBarItem7.waitUntilClickable().click();
		logger.info("already click on Action Bar Item Link");
    }

}
