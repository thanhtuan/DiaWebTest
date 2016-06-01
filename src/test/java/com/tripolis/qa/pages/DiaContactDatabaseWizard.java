package com.tripolis.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DiaContactDatabaseWizard extends PageObject {

	public WebDriver driver=null;
	Logger logger = LoggerFactory.getLogger(DiaContactDatabaseWizard.class);
	
	public DiaContactDatabaseWizard(WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=".//*[@id='dialog']", timeoutInSeconds="5")
	private WebElementFacade createDatabaseDialog;
	
	@FindBy(xpath=".//*[@id='cancelButton']", timeoutInSeconds="5")
	private WebElementFacade cancelButton;
	
	@FindBy(xpath=".//*[@id='submitNext']", timeoutInSeconds="5")
	private WebElementFacade nextButton;
	
	@FindBy(xpath=".//*[@id='submitPrevious']", timeoutInSeconds="5")
	private WebElementFacade previousButton;
	
	@FindBy(className="buttongr", timeoutInSeconds="5")
	private WebElementFacade addFieldButton;
	
	@FindBy(id="finish", timeoutInSeconds="5")
	private WebElementFacade finishButton;
	
	@FindBy(id="label", timeoutInSeconds="10")
	private WebElementFacade label;
	
	@FindBy(id="name", timeoutInSeconds="5")
	private WebElementFacade name;
	
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
	
	@FindBy(xpath=".//*[@id='_key']", timeoutInSeconds="5")
	private WebElementFacade key;
	
	@FindBy(xpath="..//*[@id='_required']']", timeoutInSeconds="5")
	private WebElementFacade required;
	
	@FindBy(xpath=".//*[@id='_overview']", timeoutInSeconds="5")
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
	
	public void clickCancelButton() {
		logger.info("Please click on Cancel Button");
		cancelButton.click();
		logger.info("already click on Cancel Button");
	}
	
	public void clickNextButton() {
		logger.info("Please click on Next Button");
		nextButton.click();
		logger.info("already click on Next Button");
	}
	
	public void clickPreviousButton() {
		logger.info("Please click on Previous Button");
		previousButton.click();
		logger.info("already click on Previous Button");
	}
	
	public void clickAddFieldButton() {
		logger.info("Please click on Add Field Button");
		addFieldButton.click();
		logger.info("already click on Add Field Button");
	}
	
	public void clickFinishButton() {
		logger.info("Please click on Finish Button");
		finishButton.click();
		logger.info("already click on Finish Button");
	}
	
	public void enter_Label(String keyword) {
		logger.info("Please input Label");
		label.clear();
		label.type(keyword);
		logger.info("already input Label");
    }
	
	public void enter_Name(String keyword) {
		logger.info("Please input Name");
		name.clear();	
		keyword = keyword.toLowerCase();
		keyword = keyword.replaceAll(" ", "");
		name.type(keyword);
		logger.info("already input Name");
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
		fieldType.selectByVisibleText(keyword);
		//fieldType.selectByValue(keyword);
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
