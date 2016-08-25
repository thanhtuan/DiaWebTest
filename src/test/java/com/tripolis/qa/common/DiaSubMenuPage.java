package com.tripolis.qa.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DiaSubMenuPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaSubMenuPage.class);
	
	@FindBy(id="sub-nav", timeoutInSeconds="5")
	protected WebElementFacade subMenu;
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[1]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem1;
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[2]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem2;
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[3]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem3;
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[4]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem4;
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[5]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem5;
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[6]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem6;
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[7]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem7;
	
	public void subMenuisVisible() {
		subMenu.shouldBeCurrentlyVisible();
	}
	
	public void subMenunotVisible() {
		subMenu.shouldNotBeCurrentlyVisible();
	}
	
	public void clickOnSubMenuItem1() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem1.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	public void clickOnSubMenuItem2() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem2.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	public void clickOnSubMenuItem3() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem3.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	public void clickOnSubMenuItem4() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem4.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	public void clickOnSubMenuItem5() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem5.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	public void clickOnSubMenuItem6() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem6.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	public void clickOnSubMenuItem7() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem7.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }

}
