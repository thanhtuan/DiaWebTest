package com.tripolis.qa.dialogueweb.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DiaContactDatabaseWizard extends AbstractPage {
	
	public DiaContactDatabaseWizard(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	Logger logger = LoggerFactory.getLogger(DiaContactDatabaseWizard.class);
	
	@FindBy(id="dialog", timeoutInSeconds="5")
	private WebElementFacade createDatabaseDialog;
	
	@FindBy(xpath=".//*[@id='wizardForm']/div[1]/div[1]", timeoutInSeconds="5")
	private WebElementFacade createDatabaseDialogheaderNameText;
	
	@FindBy(xpath=".//*[@id='wizardForm']/div[2]/div[1]/span", timeoutInSeconds="5")
	private WebElementFacade confirmedDatabaseLabel;
	
	@FindBy(name="type", timeoutInSeconds="5")
	private WebElementFacade fieldType;
	
	@FindBy(name="fieldDescriptorLabel", timeoutInSeconds="5")
	private WebElementFacade fieldDescriptorLabel;
	
	@FindBy(name="fieldDescriptorName", timeoutInSeconds="5")
	private WebElementFacade fieldDescriptorName;
	
	@FindBy(name="layoutOrder", timeoutInSeconds="5")
	private WebElementFacade order;
	
	@FindBy(id="minLength", timeoutInSeconds="5")
	private WebElementFacade minLength;
	
	@FindBy(id="maxLength", timeoutInSeconds="5")
	private WebElementFacade maxLength;
	
	@FindBy(id="_defaultStringValue", timeoutInSeconds="5")
	private WebElementFacade defaultValue;
	
	@FindBy(id="_key", timeoutInSeconds="5")
	private WebElementFacade key;
	
	@FindBy(id="_required_required", timeoutInSeconds="5")
	private WebElementFacade required;
	
	@FindBy(id="_overview", timeoutInSeconds="5")
	private WebElementFacade inOverView;
	
	@FindBy(name="kindOfField", timeoutInSeconds="5")
	private WebElementFacade kindOfField;
	
	public boolean isShowCreateDatabaseDialog() {
		try {
			createDatabaseDialog.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public String getCreateDatabaseDialogheaderNameText() {
		return createDatabaseDialogheaderNameText.waitUntilPresent().getText();
	}
	
	public String getConfirmedDatabaseLabelText() {
		return confirmedDatabaseLabel.waitUntilPresent().getText();
	}
	
	public void enter_FieldDescriptorLabel(String keyword) {
		logger.info("Please input Field Descriptor Label");
		fieldDescriptorLabel.type(keyword);
		logger.info("already input Field Descriptor Label");
    }
	
	public void enter_FieldDescriptorName(String keyword) {
		logger.info("Please input Field Descriptor Name");
		fieldDescriptorName.clear();	
		keyword = keyword.toLowerCase();
		keyword = keyword.replaceAll(" ", "");
		fieldDescriptorName.type(keyword);
		logger.info("already input Field Descriptor Name");
    }
	
	public void enter_MinLength(String keyword) {
		logger.info("Please input Min Length");
		minLength.type(keyword);
		logger.info("already input Min Length");
    }
	
	public void enter_MaxLength(String keyword) {
		logger.info("Please input Max Length");
		maxLength.type(keyword);
		logger.info("already input Max Length");
    }
	
	public void enter_DefaultValue(String keyword) {
		logger.info("Please input Default Value");
		defaultValue.type(keyword);
		logger.info("already input Default Value");
    }
	
	public void select_FieldType(String keyword) {
		fieldType.selectByValue(keyword);
	}
	
	public void select_Order(String keyword) {
		order.selectByVisibleText(keyword);
	}
	
	public void select_KindOfField(String keyword) {
		kindOfField.selectByVisibleText(keyword);
	}
	
	public void checkbox_key() {
		key.click();
	}
	
	public void checkbox_required() {
		required.click();
	}
	
	public void checkbox_inOverView() {
		inOverView.click();
	}
	
}
