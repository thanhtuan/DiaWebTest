package com.tripolis.qa.common;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AbstractPage extends PageObject {
	
	private static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);
	
	
	/*
	 * Handle The Objects on the main area
	 */
	
	@FindBy(xpath=".//*[@id='main']/div[1]/div[1]", timeoutInSeconds="5")
	protected WebElementFacade headerNameText; 
	
	public String getHeaderNameText() {
		return headerNameText.waitUntilPresent().getText();
	}
	
	@FindBy(id="archive", timeoutInSeconds="5")
	protected WebElementFacade archiveButton;
	
	public void clickArchiveButton() {
		logger.info("Please click on Archive Button");
		archiveButton.waitUntilClickable().click();
		logger.info("already click on Archive Button");
	}
	
	@FindBy(id="view", timeoutInSeconds="5")
	protected WebElementFacade viewButton;
	
	public void clickViewButton() {
		logger.info("Please click on View Button");
		viewButton.waitUntilClickable().click();
		logger.info("already click on View Button");
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
	
	@FindBy(className="pagenating", timeoutInSeconds="5")
	protected WebElementFacade pagingDropDown;
	
	public void select_pagingNumber(String keyword) {
		pagingDropDown.selectByValue(keyword);
	}
	
	@FindBy(xpath=".//*[@id='table']/thead/tr[1]/td[2]/div", timeoutInSeconds="5")
	protected WebElementFacade filtercolumn1;
	
	public void typeAndEnterFilterFilterColumn1(String keyword) {
		logger.info("Please type and enter Filter Column1");
		filtercolumn1.waitUntilClickable().click();
		WebElementFacade dynFilterInput1 = filtercolumn1.find(By.id("dynFilterInput"));
		dynFilterInput1.waitUntilPresent().typeAndEnter(keyword);
		logger.info("already type and enter Filter Column1");
	}
	
	@FindBy(xpath=".//*[@id='table']/thead/tr[1]/td[3]/div", timeoutInSeconds="5")
	protected WebElementFacade filtercolumn2;
	
	public void typeAndEnterFilterFilterColumn2(String keyword) {
		logger.info("Please type and enter Filter Column2");
		filtercolumn2.waitUntilClickable().click();
		WebElementFacade dynFilterInput2 = filtercolumn2.find(By.id("dynFilterInput"));
		dynFilterInput2.waitUntilPresent().typeAndEnter(keyword);
		logger.info("already type and enter Filter Column2");
	}
	
	@FindBy(xpath=".//*[@id='table']/thead/tr[1]/td[4]/div", timeoutInSeconds="5")
	protected WebElementFacade filtercolumn3;
	
	public void typeAndEnterFilterFilterColumn3(String keyword) {
		logger.info("Please type and enter Filter Column3");
		filtercolumn3.waitUntilClickable().click();
		WebElementFacade dynFilterInput3 = filtercolumn3.find(By.id("dynFilterInput"));
		dynFilterInput3.waitUntilPresent().typeAndEnter(keyword);
		logger.info("already type and enter Filter Column3");
	}
	
	@FindBy(className="ui-dialogue-frame", timeoutInSeconds="5")
	protected WebElementFacade confirmedPopup;
	
	public boolean isshowconfirmedPopup() {
		try {
			confirmedPopup.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@FindBy(xpath=".//*[@id='dialog']", timeoutInSeconds="5")
	protected WebElementFacade confirmedMessage;
	
	public String getconfirmedMessage() {
		return confirmedMessage.waitUntilPresent().getText();
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
	
	/*
	 * End handle The Objects on the main area
	 */
	
	/*
	 * Handle The Objects on Wizard
	 */
	
	@FindBy(id="cancelButton", timeoutInSeconds="5")
	protected WebElementFacade cancelButton;
	
	public void clickCancelButton() {
		logger.info("Please click on Cancel Button");
		cancelButton.waitUntilClickable().click();
		logger.info("already click on Cancel Button");
	}
	
	@FindBy(id="submitNext", timeoutInSeconds="5")
	protected WebElementFacade nextButton;
	
	public void clickNextButton() {
		logger.info("Please click on Next Button");
		nextButton.waitUntilClickable().click();
		logger.info("already click on Next Button");
	}
	
	@FindBy(id="submitPrevious", timeoutInSeconds="5")
	protected WebElementFacade previousButton;
	
	public void clickPreviousButton() {
		logger.info("Please click on Previous Button");
		previousButton.waitUntilClickable().click();
		logger.info("already click on Previous Button");
	}
	
	@FindBy(className="buttongr", timeoutInSeconds="5")
	protected WebElementFacade addFieldButton;
	
	public void clickAddFieldButton() {
		logger.info("Please click on Add Field Button");
		addFieldButton.waitUntilClickable().click();
		logger.info("already click on Add Field Button");
	}
	
	@FindBy(id="finish", timeoutInSeconds="5")
	protected WebElementFacade finishButton;
	
	public void clickFinishButton() {
		logger.info("Please click on Finish Button");
		finishButton.waitUntilClickable().click();
		logger.info("already click on Finish Button");
	}
	
	/*
	 * Handle The Objects on Wizard
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
	
	@FindBy(id="submitCancel", timeoutInSeconds="5")
	protected WebElementFacade submitCancelButton;
	
	public void clickSubmitCancelButton() {
		logger.info("Please click on Submit Cancel Button");
		submitCancelButton.waitUntilClickable().click();
		logger.info("already click on Submit Cancel Button");
	}
	
	@FindBy(id="submitOk", timeoutInSeconds="5")
	protected WebElementFacade submitSaveButton;
	
	public void clickSaveButton() {
		logger.info("Please click on save Button");
		submitSaveButton.waitUntilClickable().click();
		logger.info("already click on save Button");
	}
	
	/**
	 * Gets text of none display element.
	 * 
	 * @param elementId
	 * @return text
	 */
	protected String getTextMessageByAttribute(String elementId) {
		return getDriver().findElement(By.id(elementId)).getAttribute("innerHTML");
	}
	
	/*
	 * End handle The Objects on Form
	 */

}
