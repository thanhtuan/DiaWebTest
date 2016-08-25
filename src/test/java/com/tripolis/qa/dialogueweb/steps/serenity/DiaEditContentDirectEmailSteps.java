package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaEditContentDirectEmailPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaEditContentDirectEmailSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaEditContentDirectEmailPage diaEditContentDirectEmailPage;
	
	/*
	 * Sub Menu
	 */
	
	@Step
	public void navigateToContentDashBoardPage() {
		diaEditContentDirectEmailPage.clickOnsubMenuItem1();
	}
	
	@Step
	public void navigateToListNewlettersPage() {
		diaEditContentDirectEmailPage.clickOnsubMenuItem2();
	}
	
	@Step
	public void navigateToListDirectEmailsPage() {
		diaEditContentDirectEmailPage.clickOnsubMenuItem3();
	}
	
	@Step
	public void navigateToListSMSPage() {
		diaEditContentDirectEmailPage.clickOnsubMenuItem4();
	}
	
	@Step
	public void navigateToListArticlesInLibraryPage() {
		diaEditContentDirectEmailPage.clickOnsubMenuItem5();
	}
	
	/*
	 * End Sub Menu
	 */
	
	/*
	 * Action Bar
	 */
	
	@Step
	public void navigateToDirectEmailPreviewPage() {
		diaEditContentDirectEmailPage.clickOnActionBarItem1();
	}
	
	@Step
	public void navigateToDirectEmailHTMLEditorPage() {
		diaEditContentDirectEmailPage.clickOnActionBarItem2();
	}
	
	@Step
	public void navigateToDirectEmailHTMLSourcePage() {
		diaEditContentDirectEmailPage.clickOnActionBarItem3();
	}
	
	@Step
	public void navigateToDirectEmailTextVersionPage() {
		diaEditContentDirectEmailPage.clickOnActionBarItem4();
	}
	
	@Step
	public void navigateToDirectEmailDetailsPage() {
		diaEditContentDirectEmailPage.clickOnActionBarItem5();
	}
	
	@Step
	public void navigateToDirectEmailPropertiesPage() {
		diaEditContentDirectEmailPage.clickOnActionBarItem6();
	}
	
	@Step
	public void navigateToDirectEmailContentCheckPage() {
		diaEditContentDirectEmailPage.clickOnActionBarItem7();
	}
	
	/*
	 * End Action Bar
	 */
	
	@Step
	public void onEditContentDirectEmailPage() {
		assert(diaEditContentDirectEmailPage.getEditDirectEmailUrl());
	}
	
	@Step
	public void verifyheaderNameTextEditDirectEmail(String value) {
		assertThat(diaEditContentDirectEmailPage.getheaderNameText().equalsIgnoreCase("Direct email " + value));
	}
	
	@Step
	public void setDirectEmailBody(String keyword) {
		diaEditContentDirectEmailPage.enter_DirectEmailBody(keyword);
	}
	
	@Step
	public void clickOnSaveLink() {
		diaEditContentDirectEmailPage.clickSaveLink();
	}
	
	@Step
	public void clickOnSaveButton() {
		diaEditContentDirectEmailPage.clickSaveButton();
	}

}
