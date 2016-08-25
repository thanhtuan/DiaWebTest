package com.tripolis.qa.dialogueweb.pages;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/admin/content/listWorkspaces.html")
public class DiaListWorkspacesPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaListWorkspacesPage.class);
	
	@FindBy(id="checkAll", timeoutInSeconds="5")
	private WebElementFacade selectedAllWorkspaces;
	
	@FindBy(xpath=".//*[@class='tbody']/tr", timeoutInSeconds="5")
	private List<WebElementFacade> listWorkspaces;
	
	@FindBy(id="modalText", timeoutInSeconds="5")
	private WebElementFacade confirmedMessage;
	
	public boolean getListWorkspacesUrl() {
		logger.info("Get List Workspaces URL");
		return getDriver().getCurrentUrl().contains("/dialogue/admin/content/listWorkspaces.html");		
	}
	
	public String getconfirmedMessage() {
		return confirmedMessage.waitUntilPresent().getText();
	}
	
	public void allWorkspaces(boolean value) {
		setCheckbox(selectedAllWorkspaces.waitUntilPresent(), value);
	}
	
	public void findWorkspace(String value) {
		value = value.trim();
		int itemCount = listWorkspaces.size();
		for(int i=0; i < itemCount; i++) {
			String wslabel = listWorkspaces.get(i).findBy(".//td[2]/div").waitUntilPresent().getText();
			if(value.equals(wslabel)) {
				WebElementFacade selected = listWorkspaces.get(i).findBy(".//td[1]/input[2]");
				setCheckbox(selected, true);
			}
		}
	}
	
	public String getSuccessfulMessage() {
		return getTextMessageByAttribute("taglineSucces");
	}
	
}
