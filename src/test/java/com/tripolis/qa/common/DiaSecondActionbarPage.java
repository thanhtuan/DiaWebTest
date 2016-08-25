package com.tripolis.qa.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DiaSecondActionbarPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaSecondActionbarPage.class);
	
	@FindBy(xpath=".//*[@id='main-hd']/ul/li[1]/a", timeoutInSeconds="5")
	protected WebElementFacade secondActionBarItem1;
	
	@FindBy(xpath=".//*[@id='main-hd']/ul/li[2]/a", timeoutInSeconds="5")
	protected WebElementFacade secondActionBarItem2;
	
	@FindBy(xpath=".//*[@id='main-hd']/ul/li[3]/a", timeoutInSeconds="5")
	protected WebElementFacade secondActionBarItem3;
	
	@FindBy(xpath=".//*[@id='main-hd']/ul/li[4]/a", timeoutInSeconds="5")
	protected WebElementFacade secondActionBarItem4;
	
	@FindBy(xpath=".//*[@id='main-hd']/ul/li[5]/a", timeoutInSeconds="5")
	protected WebElementFacade secondActionBarItem5;
	
	@FindBy(xpath=".//*[@id='main-hd']/ul/li[6]/a", timeoutInSeconds="5")
	protected WebElementFacade secondActionBarItem6;
	
	@FindBy(xpath=".//*[@id='main-hd']/ul/li[7]/a", timeoutInSeconds="5")
	protected WebElementFacade secondActionBarItem7;
	
	public void clickOnSecondActionBarItem1() {
		logger.info("Please click on Second Action Bar Item Link");
		secondActionBarItem1.waitUntilClickable().click();
		logger.info("already click on Second Action Bar Item Link");
    }
	
	
	
	public void clickOnSecondActionBarItem2() {
		logger.info("Please click on Second Action Bar Item Link");
		secondActionBarItem2.waitUntilClickable().click();
		logger.info("already click on Second Action Bar Item Link");
    }
	
	
	
	public void clickOnSecondActionBarItem3() {
		logger.info("Please click on Second Action Bar Item Link");
		secondActionBarItem3.waitUntilClickable().click();
		logger.info("already click on Second Action Bar Item Link");
    }
	
	
	
	public void clickOnSecondActionBarItem4() {
		logger.info("Please click on Second Action Bar Item Link");
		secondActionBarItem4.waitUntilClickable().click();
		logger.info("already click on Second Action Bar Item Link");
    }
	
	
	
	public void clickOnSecondActionBarItem5() {
		logger.info("Please click on Second Action Bar Item Link");
		secondActionBarItem5.waitUntilClickable().click();
		logger.info("already click on Second Action Bar Item Link");
    }

}
