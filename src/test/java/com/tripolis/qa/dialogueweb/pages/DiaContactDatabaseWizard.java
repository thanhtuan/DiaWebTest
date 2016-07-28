package com.tripolis.qa.dialogueweb.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.Pages;

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
	private WebElementFacade defaultStringValue;
	
	@FindBy(name="_defaultValue", timeoutInSeconds="5")
	private List<WebElementFacade> radioButton;
	
	@FindBy(id="_key", timeoutInSeconds="5")
	private WebElementFacade key;
	
	@FindBy(id="_required", timeoutInSeconds="5")
	private WebElementFacade required;
	
	@FindBy(id="_overview", timeoutInSeconds="5")
	private WebElementFacade inOverView;
	
	@FindBy(name="kindOfField", timeoutInSeconds="5")
	private WebElementFacade kindOfField;
	
	@FindBy(id="picklistItemLabel", timeoutInSeconds="5")
	private WebElementFacade picklistItemLabel;
	
	@FindBy(name="picklistItemValue", timeoutInSeconds="5")
	private WebElementFacade picklistItemValue;
	
	@FindBy(id="next", timeoutInSeconds="5")
	private WebElementFacade addItem;
	
	@FindBy(id="previous", timeoutInSeconds="5")
	private WebElementFacade previous;
	
	@FindBy(name="defaultValue", timeoutInSeconds="5")
	private WebElementFacade defaultValue;
	
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
		fieldDescriptorLabel.waitUntilPresent().type(keyword);
		logger.info("already input Field Descriptor Label");
    }
	
	public void enter_FieldDescriptorName(String keyword) {
		logger.info("Please input Field Descriptor Name");
		fieldDescriptorName.waitUntilPresent().clear();	
		keyword = keyword.toLowerCase();
		keyword = keyword.replaceAll(" ", "");
		fieldDescriptorName.waitUntilPresent().type(keyword);
		logger.info("already input Field Descriptor Name");
    }
	
	public void select_FieldType(String keyword) {
		fieldType.waitUntilPresent().selectByValue(keyword);
	}
	
	public void select_Order(String keyword) {
		order.waitUntilPresent().selectByVisibleText(keyword);
	}
	
	public void enter_MinLength(String keyword) {
		logger.info("Please input Min Length");
		minLength.waitUntilPresent().clear();
		minLength.waitUntilPresent().type(keyword);
		logger.info("already input Min Length");
    }
	
	public void enter_MaxLength(String keyword) {
		logger.info("Please input Max Length");
		maxLength.waitUntilPresent().clear();
		maxLength.waitUntilPresent().type(keyword);
		logger.info("already input Max Length");
    }
	
	public void enter_DefaultStringValue(String keyword) {
		logger.info("Please input Default Value");
		defaultStringValue.waitUntilPresent().clear();
		defaultStringValue.waitUntilPresent().type(keyword);
		logger.info("already input Default Value");
    }
	
	public void checkbox_key(boolean value) {
		setCheckbox(key.waitUntilPresent(), value);
	}
	
	public void checkbox_required(boolean value) {
		setCheckbox(required.waitUntilPresent(), value);
	}
	
	public void checkbox_inOverView(boolean value) {
		setCheckbox(inOverView.waitUntilPresent(), value);
	}
	
	public void select_KindOfField(String keyword) {
		kindOfField.waitUntilPresent().selectByVisibleText(keyword);
	}
	
	public void enter_PicklistItemLabel(String keyword) {
		logger.info("Please input Picklist Item Label");
		picklistItemLabel.waitUntilPresent().clear();
		picklistItemLabel.waitUntilPresent().type(keyword);
		logger.info("already input Picklist Item Label");
    }
	
	public void enter_PicklistItemValue(String keyword) {
		logger.info("Please input Picklist Item Value");
		picklistItemValue.waitUntilPresent().clear();
		picklistItemValue.waitUntilPresent().type(keyword);
		logger.info("already input Picklist Item Value");
    }
	
	public void clickAddItemButton() {
		logger.info("Please click on addItem button");
		addItem.waitUntilClickable().click();
		logger.info("already click on addItem button");
    }
	
	public void clickPreviousButtonOnPicklist() {
		logger.info("Please click on previous button");
		previous.waitUntilClickable().click();
		logger.info("already click on previous button");
    }
	
	public void select_DefaultValue(String keyword) {
		defaultValue.waitUntilPresent().selectByValue(keyword);
	}
	
	public void select_RadioButton(int option) {
		if (option > 0 && option <= radioButton.size()) {
			radioButton.get(option - 1).click();
	    } else {
	        throw new NotFoundException("option " + option + " not found");
	    }
	}
}
