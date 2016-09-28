package com.tripolis.qa.common;

import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaLeftSidebarSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaLeftSidebarPage diaLeftSidebarPage;
	
	@Step
	public void shouldBeAbleToSeeClientDomainName() {
		assertThat(diaLeftSidebarPage.getClientName().equalsIgnoreCase("Client: Tripolis QA"));
	}
	
	@Step
	public String getcontactDatabasesLabel() {
		return diaLeftSidebarPage.contactDatabasesLabel();
	}
	
	@Step
	public String getcontentWorkspaceLabel() {
		return diaLeftSidebarPage.contentWorkspaceLabel();
	}
	
	/*
	 * Get ID of contact Database
	 */
	@Step
	public String getcontactDatabasesAttribute() {
		return diaLeftSidebarPage.contactDatabasesAttribute();
	}
	
	/*
	 * Get ID of content Workspace
	 */
	@Step
	public String getcontentWorkspaceAttribute() {
		return diaLeftSidebarPage.contentWorkspaceAttribute();
	}
	
	@Step
	public void navigateToPageThatLeftSidebarItem1PresentFor() {
		diaLeftSidebarPage.clickOnLeftSidebarItem1();
	}
	
	@Step
	public void navigateToPageThatLeftSidebarItem2PresentFor() {
		diaLeftSidebarPage.clickOnLeftSidebarItem2();
	}
	
	@Step
	public void navigateToPageThatLeftSidebarItem3PresentFor() {
		diaLeftSidebarPage.clickOnLeftSidebarItem3();
	}
	
	@Step
	public void navigateToPageThatLeftSidebarItem4PresentFor() {
		diaLeftSidebarPage.clickOnLeftSidebarItem4();
	}
	
	@Step
	public void navigateToPageThatLeftSidebarItem5PresentFor() {
		diaLeftSidebarPage.clickOnLeftSidebarItem5();
	}
	
	@Step
	public void navigateToPageThatLeftSidebarItem6PresentFor() {
		diaLeftSidebarPage.clickOnLeftSidebarItem6();
	}
	
	@Step
	public void navigateToPageThatLeftSidebarItem7PresentFor() {
		diaLeftSidebarPage.clickOnLeftSidebarItem7();
	}
	
	@Step
	public void clickSpanIconPlusOnLeftSidebarItem1() {
		diaLeftSidebarPage.clickOnSpanIconPlusOnLeftSidebarItem1();
	}
	
	@Step
	public void clickSpanIconPlusOnLeftSidebarItem2() {
		diaLeftSidebarPage.clickOnSpanIconPlusOnLeftSidebarItem2();
	}
	
	@Step
	public void clickSpanIconPlusOnLeftSidebarItem3() {
		diaLeftSidebarPage.clickOnSpanIconPlusOnLeftSidebarItem3();
	}
	
	@Step
	public void clickSpanIconPlusOnLeftSidebarItem4() {
		diaLeftSidebarPage.clickOnSpanIconPlusOnLeftSidebarItem4();
	}
	
	@Step
	public void clickSpanIconPlusOnLeftSidebarItem5() {
		diaLeftSidebarPage.clickOnSpanIconPlusOnLeftSidebarItem5();
	}
	
	@Step
	public void clickSpanIconPlusOnLeftSidebarItem6() {
		diaLeftSidebarPage.clickOnSpanIconPlusOnLeftSidebarItem6();
	}
	
	@Step
	public void clickSpanIconPlusOnLeftSidebarItem7() {
		diaLeftSidebarPage.clickOnSpanIconPlusOnLeftSidebarItem7();
	}

}
