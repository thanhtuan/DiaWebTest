package com.tripolis.qa.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DiaLeftSidebarPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaLeftSidebarPage.class);
	
	@FindBy(id="clientname", timeoutInSeconds="5")
	protected WebElementFacade clientName; 
	
	@FindBy(id="leftcontent", timeoutInSeconds="10")
	protected WebElementFacade leftSidebar;
	
	@FindBy(id="contact", timeoutInSeconds="10")
	protected WebElementFacade contactDatabasesDropDown;
	
	@FindBy(id="content", timeoutInSeconds="10")
	protected WebElementFacade contentWorkspaceDropDown;
	
	@FindBy(xpath=".//*[@id='contact']/option[@selected]", timeoutInSeconds="5")
	protected WebElementFacade selectedContactDatabases;
	
	@FindBy(xpath=".//*[@id='content']/option[@selected]", timeoutInSeconds="5")
	protected WebElementFacade selectedContentWorkspace;
	
	@FindBy(id="acmenu", timeoutInSeconds="10")
	protected WebElementFacade leftSidebarItems;
	
	
	@FindBy(xpath=".//*[@id='acmenu']/div[1]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem1;
	
	@FindBy(xpath=".//*[@id='acmenu']/div[2]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem2;
	
	@FindBy(xpath=".//*[@id='acmenu']/div[3]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem3;
	
	@FindBy(xpath=".//*[@id='acmenu']/div[4]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem4;
	
	@FindBy(xpath=".//*[@id='acmenu']/div[5]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem5;
	
	@FindBy(xpath=".//*[@id='acmenu']/div[6]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem6;
	
	@FindBy(xpath=".//*[@id='acmenu']/div[7]/div[1]/a[@class='accordion-link']", timeoutInSeconds="5")
	protected WebElementFacade leftpanelItem7;
	
	
	@FindBy(xpath=".//*[@id='acmenu']/div[1]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus1;
	
	@FindBy(xpath=".//*[@id='acmenu']/div[2]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus2;
	
	@FindBy(xpath=".//*[@id='acmenu']/div[3]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus3;
	
	@FindBy(xpath=".//*[@id='acmenu']/div[4]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus4;
	
	@FindBy(xpath=".//*[@id='acmenu']/div[5]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus5;
	
	@FindBy(xpath=".//*[@id='acmenu']/div[6]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus6;
	
	@FindBy(xpath=".//*[@id='acmenu']/div[7]/div[1]/a[2]/span", timeoutInSeconds="5")
	protected WebElementFacade leftpanelSpanIconPlus7;
	
	public String getClientName() {
		return clientName.waitUntilPresent().getText();
	}
	
	public String contactDatabasesLabel() {
		/*Set<String> listDb = getSelectedOptionLabelsFrom(contactDatabasesDropDown);
		System.out.println(">>>>>> listDb: " + listDb);
		return listDb.iterator().next();*/
		return getSelectedLabelFrom(contactDatabasesDropDown);
	}
	
	public String contentWorkspaceLabel() {
		return getSelectedLabelFrom(contentWorkspaceDropDown);
	}
	
	public String contactDatabasesAttribute() {
		return selectedContactDatabases.waitUntilPresent().getAttribute("value");
	}
	
	public String contentWorkspaceAttribute() {
		return selectedContentWorkspace.waitUntilPresent().getAttribute("value");
	}
	
	public void leftSidebarItemsisVisible() {
		leftSidebarItems.shouldBeCurrentlyVisible();
	}
	
	public void leftSidebarItemsnotVisible() {
		leftSidebarItems.shouldNotBeCurrentlyVisible();
	}

	
	public void clickOnLeftSidebarItem1() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem1.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	public void clickOnLeftSidebarItem2() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem2.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	public void clickOnLeftSidebarItem3() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem3.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	public void clickOnLeftSidebarItem4() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem4.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	public void clickOnLeftSidebarItem5() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem5.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	public void clickOnLeftSidebarItem6() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem6.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	public void clickOnLeftSidebarItem7() {
		logger.info("Please click on left panel Item Link");
		leftpanelItem7.waitUntilClickable().click();
		logger.info("already click on left panel Item Link");
    }
	
	public void clickOnSpanIconPlusOnLeftSidebarItem1() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus1.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	public void clickOnSpanIconPlusOnLeftSidebarItem2() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus2.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	public void clickOnSpanIconPlusOnLeftSidebarItem3() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus3.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	public void clickOnSpanIconPlusOnLeftSidebarItem4() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus4.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	public void clickOnSpanIconPlusOnLeftSidebarItem5() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus5.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	public void clickOnSpanIconPlusOnLeftSidebarItem6() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus6.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }
	
	public void clickOnSpanIconPlusOnLeftSidebarItem7() {
		logger.info("Please click on spanIconPlus Item Link");
		leftpanelSpanIconPlus7.waitUntilClickable().click();
		logger.info("already click on spanIconPlus Item Link");
    }

}
