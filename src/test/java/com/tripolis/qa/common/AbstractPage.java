package com.tripolis.qa.common;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AbstractPage extends PageObject {
	
	public WebDriver driver=null;
	private static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public AbstractPage(WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Handle MainMenu
	 */
	
	@FindBy(xpath=".//*[@id='global-nav']/ul", timeoutInSeconds="5")
	protected WebElementFacade mainMenu;
	
	public boolean mainMenuisVisible() {
		return mainMenu.isCurrentlyVisible();

	}
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[1]/a", timeoutInSeconds="5")
	protected WebElementFacade menuHomedashboardpage;
	
	public void click_HomePageLink() {
		logger.info("Please click on Home Page Link");
		menuHomedashboardpage.waitUntilClickable().click();
		logger.info("already click on Home Page Link");
    }
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[2]/a", timeoutInSeconds="5")
	protected WebElementFacade menuContactboardpagePage;
	
	public void click_ContactPageLink() {
		logger.info("Please click on Contact Page Link");
		menuContactboardpagePage.waitUntilClickable().click();
		logger.info("already click on Contact Page Link");
    }
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[3]/a", timeoutInSeconds="5")
	protected WebElementFacade menuContentdashboardpage;
	
	public void click_ContentPageLink() {
		logger.info("Please click on Content Page Link");
		menuContentdashboardpage.waitUntilClickable().click();
		logger.info("already click on Content Page Link");
    }
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[4]/a", timeoutInSeconds="5")
	protected WebElementFacade menuCampaignDashboardPage;
	
	public void click_CampaignPageLink() {
		logger.info("Please click on Campaign Page Link");
		menuCampaignDashboardPage.waitUntilClickable().click();
		logger.info("already click on Campaign Page Link");
    }
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[5]/a", timeoutInSeconds="5")
	protected WebElementFacade menuPublishingDashboardPage;
	
	public void click_PublishingPageLink() {
		logger.info("Please click on Publishing Page Link");
		menuPublishingDashboardPage.waitUntilClickable().click();
		logger.info("already click on Publishing Page Link");
    }
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[6]/a", timeoutInSeconds="5")
	protected WebElementFacade menuReportDashboardPage;
	
	public void click_ReportPageLink() {
		logger.info("Please click on Report Page Link");
		menuReportDashboardPage.waitUntilClickable().click();
		logger.info("already click on Report Page Link");
    }
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[7]/a", timeoutInSeconds="5")
	protected WebElementFacade menuProcesseDashboardPage;
	
	public void click_ProcessePageLink() {
		logger.info("Please click on Processe Page Link");
		menuProcesseDashboardPage.waitUntilClickable().click();
		logger.info("already click on Processe Page Link");
    }
	
	@FindBy(xpath=".//*[@id='global-nav']/ul/li[8]/a", timeoutInSeconds="5")
	protected WebElementFacade menuAdministrationPage;
	
	public void click_SetupPageLink() {
		logger.info("Please click on Admin Page Link");
		menuAdministrationPage.waitUntilClickable().click();
		logger.info("already click on Admin Page Link");
    }
	
	/*
	 * ******End handle MainMenu******
	 */
	
	/*
	 * Handle SubMenu
	 */
	
	@FindBy(id="sub-nav", timeoutInSeconds="5")
	protected WebElementFacade subMenu;
	
	public void subMenuisVisible() {
		subMenu.shouldBeCurrentlyVisible();
	}
	
	public void subMenunotVisible() {
		subMenu.shouldNotBeCurrentlyVisible();
	}
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[1]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem1;
	
	public void clickOnsubMenuItem1() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem1.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[2]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem2;
	
	public void clickOnsubMenuItem2() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem2.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[3]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem3;
	
	public void clickOnsubMenuItem3() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem3.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[4]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem4;
	
	public void clickOnsubMenuItem4() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem4.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[5]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem5;
	
	public void clickOnsubMenuItem5() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem5.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[6]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem6;
	
	public void clickOnsubMenuItem6() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem6.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[7]/a", timeoutInSeconds="5")
	protected WebElementFacade subMenuItem7;
	
	public void clickOnsubMenuItem7() {
		logger.info("Please click on subMenu Item Link");
		subMenuItem7.waitUntilClickable().click();
		logger.info("already click on subMenu Item Link");
    }
	
	/*
	 * ******End handle SubMenu******
	 */
	
	/*
	 * Handle The Left Panel
	 */
	
	@FindBy(id="acmenu", timeoutInSeconds="10")
	protected WebElementFacade menuLeftPanel;
	
	public void menuLeftPanelisVisible() {
		menuLeftPanel.shouldBeCurrentlyVisible();
	}
	
	public void menuLeftPanelnotVisible() {
		menuLeftPanel.shouldNotBeCurrentlyVisible();
	}

	
	@FindBy(xpath=".//*[@id='acmenu']/div[1]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem1;
	
	public void clickOnleftpanelItem1() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem1.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[2]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem2;
	
	public void clickOnleftpanelItem2() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem2.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[3]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem3;
	
	public void clickOnleftpanelItem3() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem3.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[4]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem4;
	
	public void clickOnleftpanelItem4() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem4.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[5]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem5;
	
	public void clickOnleftpanelItem5() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem5.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[6]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem6;
	
	public void clickOnleftpanelItem6() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem6.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[7]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem7;
	
	public void clickOnleftpanelItem7() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem7.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[1]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus1;
	
	public void clickOnspanIconPlus1() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus1.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[2]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus2;
	
	public void clickOnspanIconPlus2() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus2.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[3]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus3;
	
	public void clickOnspanIconPlus3() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus3.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[4]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus4;
	
	public void clickOnspanIconPlus4() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus4.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[5]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus5;
	
	public void clickOnspanIconPlus5() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus5.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[6]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus6;
	
	public void clickOnspanIconPlus6() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus6.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	@FindBy(xpath=".//*[@id='acmenu']/div[7]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus7;
	
	public void clickOnspanIconPlus7() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus7.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	/*
	 * End handle The Left Panel
	 */
	
	/*
	 * Handle The Objects on the left area
	 */
	
	
	@FindBy(id="clientname", timeoutInSeconds="5")
	protected WebElementFacade clientName; 
	
	public String getClientName() {
		return clientName.waitUntilPresent().getText();
	}
	
	@FindBy(xpath=".//*[@id='contact']/option[@selected]", timeoutInSeconds="5")
	protected WebElementFacade contactDatabasesDropDown;
	
	public String contactDatabasesAttribute() {
		return contactDatabasesDropDown.waitUntilPresent().getAttribute("value");
	}
	
	@FindBy(xpath=".//*[@id='content']/option[@selected]", timeoutInSeconds="5")
	protected WebElementFacade contentWorkspaceDropDown;
	
	public String contentWorkspaceAttribute() {
		return contentWorkspaceDropDown.waitUntilPresent().getAttribute("value");
	}
	
	/*
	 * End handle the objects on the left area
	 */
	
	
	/*
	 * Handle The Objects on the main area
	 */
	
	@FindBy(id="editable", timeoutInSeconds="5")
	protected WebElementFacade newLink; 
	
	public void clickNewLink() {
		logger.info("Please click on New Link");
		newLink.waitUntilClickable().click();	
		logger.info("already click on New Link");
    }
	
	@FindBy(xpath=".//*[@id='main']/div/div[1]", timeoutInSeconds="5")
	protected WebElementFacade headerNameText; 
	
	public String getheaderNameText() {
		return headerNameText.waitUntilPresent().getText();
	}
	
	@FindBy(id="edit", timeoutInSeconds="5")
	protected WebElementFacade editButton;
	
	public void clickEditButton() {
		logger.info("Please click on Edit Button");
		editButton.waitUntilClickable().click();
		logger.info("already click on Edit Button");
	}
	
	@FindBy(id="delete", timeoutInSeconds="5")
	protected WebElementFacade deleteButton;
	
	public void clickDeleteButton() {
		logger.info("Please click on Delete Button");
		deleteButton.waitUntilClickable().click();
		logger.info("already click on Delete Button");
	}
	
	/*
	 * End handle The Objects on the main area
	 */
	
	/*
	 * Handle The Objects on Form
	 */
	
	@FindBy(id="label", timeoutInSeconds="5")
	protected WebElementFacade label;
	
	public void enter_Label(String keyword) {
		logger.info("Please input Label");
		label.waitUntilPresent().clear();
		label.waitUntilPresent().type(keyword);
		logger.info("already input Label");
    }
	
	@FindBy(id="name", timeoutInSeconds="5")
	protected WebElementFacade name;
	
	public void enter_Name(String keyword) {
		logger.info("Please input Name");
		name.waitUntilPresent().clear();	
		keyword = keyword.toLowerCase();
		keyword = keyword.replaceAll(" ", "");
		name.waitUntilPresent().type(keyword);
		logger.info("already input Name");
    }
	
	@FindBy(id="fromAddress", timeoutInSeconds="5")
	protected WebElementFacade fromAddress;
	
	public void enter_FromAddress(String keyword) {
		logger.info("Please input From Address");
		fromAddress.waitUntilPresent().clear();	
		fromAddress.waitUntilPresent().type(keyword);
		logger.info("already input From Address");
    }
	
	@FindBy(id="fromName", timeoutInSeconds="5")
	protected WebElementFacade fromName;
	
	public void enter_FromName(String keyword) {
		logger.info("Please input From Name");
		fromName.waitUntilPresent().clear();	
		fromName.waitUntilPresent().type(keyword);
		logger.info("already input From Name");
    }
	
	@FindBy(id="replyToAddress", timeoutInSeconds="5")
	protected WebElementFacade replyToAddress;
	
	public void enter_ReplyToAddress(String keyword) {
		logger.info("Please input ReplyToAddress");
		replyToAddress.waitUntilPresent().clear();	
		replyToAddress.waitUntilPresent().type(keyword);
		logger.info("already input ReplyToAddress");
    }
	
	@FindBy(name="confirmed", timeoutInSeconds="5")
	protected WebElementFacade confirmedButton;
	
	public void clickconfirmedButton() {
		logger.info("Please click on confirmed Button");
		confirmedButton.waitUntilClickable().click();
		logger.info("already click on confirmed Button");
	}
	
	@FindBy(id="deleteBtn", timeoutInSeconds="5")
	protected WebElementFacade deleteBtn;
	
	public void clickDeleteBtn() {
		logger.info("Please click on DeleteBtn");
		deleteBtn.waitUntilClickable().click();
		logger.info("already click on DeleteBtn");
	}
	
	@FindBy(id="submitOk", timeoutInSeconds="5")
	protected WebElementFacade saveButton;
	
	public void clickSaveButton() {
		logger.info("Please click on save Button");
		saveButton.waitUntilClickable().click();
		logger.info("already click on save Button");
	}
	
	/*
	 * End handle The Objects on Form
	 */

}
