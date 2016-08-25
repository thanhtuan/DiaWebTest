package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaListDirectEmailsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaListDirectEmailsSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaListDirectEmailsPage diaListDirectEmailsPage;
	
	/*
	 * Sub Menu
	 */
	
	@Step
	public void navigateToContentDashBoardPage() {
		diaListDirectEmailsPage.clickOnsubMenuItem1();
	}
	
	@Step
	public void navigateToListNewlettersPage() {
		diaListDirectEmailsPage.clickOnsubMenuItem2();
	}
	
	@Step
	public void navigateToListDirectEmailsPage() {
		diaListDirectEmailsPage.clickOnsubMenuItem3();
	}
	
	@Step
	public void navigateToListSMSPage() {
		diaListDirectEmailsPage.clickOnsubMenuItem4();
	}
	
	@Step
	public void navigateToListArticlesInLibraryPage() {
		diaListDirectEmailsPage.clickOnsubMenuItem5();
	}
	
	/*
	 * End Sub Menu
	 */
	
	@Step
	public void onListDirectEmailsPage() {
		assert(diaListDirectEmailsPage.getListDirectEmailsUrl());
	}
	
	@Step
	public void clickOnNewLink() {
		diaListDirectEmailsPage.clickNewLink();
	}
	
	@Step
	public void verifyheaderNameTextListDirectEmails(String value) {
		assertThat(diaListDirectEmailsPage.getheaderNameText().equalsIgnoreCase("Direct emails for " + value));
	}
	
	@Step
	public void selectDirectEmail(String value) {
		diaListDirectEmailsPage.findDirectEmail(value);
	}

}
