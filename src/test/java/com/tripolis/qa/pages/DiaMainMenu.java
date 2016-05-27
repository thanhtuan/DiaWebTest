package com.tripolis.qa.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DiaMainMenu extends PageObject {

	public WebDriver driver=null;
	Logger logger = LoggerFactory.getLogger(DiaMainMenu.class);
	
	public DiaMainMenu(WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[1]/a", timeoutInSeconds="5")
	private WebElementFacade menuHomedashboardpage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[2]/a", timeoutInSeconds="5")
	private WebElementFacade menuContactboardpagePage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[3]/a", timeoutInSeconds="5")
	private WebElementFacade menuContentdashboardpage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[4]/a", timeoutInSeconds="5")
	private WebElementFacade menuCampaignDashboardPage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[5]/a", timeoutInSeconds="5")
	private WebElementFacade menuPublishingDashboardPage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[6]/a", timeoutInSeconds="5")
	private WebElementFacade menuReportDashboardPage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[7]/a", timeoutInSeconds="5")
	private WebElementFacade menuProcesseDashboardPage;
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[8]/a", timeoutInSeconds="5")
	private WebElementFacade menuAdministrationPage;
	
	public void click_HomePageLink() {
		logger.info("Please click on Home Page Link");
		menuHomedashboardpage.click();
		logger.info("already click on Home Page Link");
    }
	
	public void click_ContactPageLink() {
		logger.info("Please click on Contact Page Link");
		menuContactboardpagePage.click();
		logger.info("already click on Contact Page Link");
    }
	
	public void click_ContentPageLink() {
		logger.info("Please click on Content Page Link");
		menuContentdashboardpage.click();
		logger.info("already click on Content Page Link");
    }
	
	public void click_CampaignPageLink() {
		logger.info("Please click on Campaign Page Link");
		menuCampaignDashboardPage.click();
		logger.info("already click on Campaign Page Link");
    }
	
	public void click_PublishingPageLink() {
		logger.info("Please click on Publishing Page Link");
		menuPublishingDashboardPage.click();
		logger.info("already click on Publishing Page Link");
    }
	
	public void click_ReportPageLink() {
		logger.info("Please click on Report Page Link");
		menuReportDashboardPage.click();
		logger.info("already click on Report Page Link");
    }
	
	public void click_ProcessePageLink() {
		logger.info("Please click on Processe Page Link");
		menuProcesseDashboardPage.click();
		logger.info("already click on Processe Page Link");
    }
	
	public void click_SetupPageLink() {
		logger.info("Please click on Admin Page Link");
		menuAdministrationPage.click();
		logger.info("already click on Admin Page Link");
    }
}
