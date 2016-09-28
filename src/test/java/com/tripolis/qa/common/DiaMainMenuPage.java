package com.tripolis.qa.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DiaMainMenuPage extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(DiaMainMenuPage.class);
	
	@FindBy(xpath=".//*[@id='global-nav']/ul", timeoutInSeconds="5")
	protected WebElementFacade mainMenu;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[1]/a", timeoutInSeconds="5")
	protected WebElementFacade menuHomedashboardpage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[2]/a", timeoutInSeconds="5")
	protected WebElementFacade menuContactboardpagePage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[3]/a", timeoutInSeconds="5")
	protected WebElementFacade menuContentdashboardpage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[4]/a", timeoutInSeconds="5")
	protected WebElementFacade menuCampaignDashboardPage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[5]/a", timeoutInSeconds="5")
	protected WebElementFacade menuPublishingDashboardPage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[6]/a", timeoutInSeconds="5")
	protected WebElementFacade menuReportDashboardPage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[7]/a", timeoutInSeconds="5")
	protected WebElementFacade menuProcesseDashboardPage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[8]/a", timeoutInSeconds="5")
	protected WebElementFacade menuAdministrationPage;
	
	@FindBy(xpath=".//*[@id='login']/ul/li/a", timeoutInSeconds="5")
	protected WebElementFacade logoutLink;
	
	public boolean mainMenuisVisible() {
		return mainMenu.isCurrentlyVisible();

	}
	
	public void click_HomePageLink() {
		logger.info("Please click on Home Page Link");
		menuHomedashboardpage.waitUntilClickable().click();
		logger.info("already click on Home Page Link");
    }
	
	public void click_ContactPageLink() {
		logger.info("Please click on Contact Page Link");
		menuContactboardpagePage.waitUntilClickable().click();
		logger.info("already click on Contact Page Link");
    }
	
	public void click_ContentPageLink() {
		logger.info("Please click on Content Page Link");
		menuContentdashboardpage.waitUntilClickable().click();
		logger.info("already click on Content Page Link");
    }
	
	public void click_CampaignPageLink() {
		logger.info("Please click on Campaign Page Link");
		menuCampaignDashboardPage.waitUntilClickable().click();
		logger.info("already click on Campaign Page Link");
    }
	
	public void click_PublishingPageLink() {
		logger.info("Please click on Publishing Page Link");
		menuPublishingDashboardPage.waitUntilClickable().click();
		logger.info("already click on Publishing Page Link");
    }
	
	public void click_ReportPageLink() {
		logger.info("Please click on Report Page Link");
		menuReportDashboardPage.waitUntilClickable().click();
		logger.info("already click on Report Page Link");
    }
	
	public void click_ProcessePageLink() {
		logger.info("Please click on Processe Page Link");
		menuProcesseDashboardPage.waitUntilClickable().click();
		logger.info("already click on Processe Page Link");
    }
	
	public void click_SetupPageLink() {
		logger.info("Please click on Admin Page Link");
		menuAdministrationPage.waitUntilClickable().click();
		logger.info("already click on Admin Page Link");
    }
	
	public String getLogoutText() {
		return logoutLink.waitUntilPresent().getText();
	}
	
}
