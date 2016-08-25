package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaPreviewContentDirectEmailPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaPreviewContentDirectEmailSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaPreviewContentDirectEmailPage diaPreviewContentDirectEmailPage;
	
	/*
	 * Sub Menu
	 */
	
	@Step
	public void navigateToContentDashBoardPage() {
		diaPreviewContentDirectEmailPage.clickOnsubMenuItem1();
	}
	
	@Step
	public void navigateToListNewlettersPage() {
		diaPreviewContentDirectEmailPage.clickOnsubMenuItem2();
	}
	
	@Step
	public void navigateToListDirectEmailsPage() {
		diaPreviewContentDirectEmailPage.clickOnsubMenuItem3();
	}
	
	@Step
	public void navigateToListSMSPage() {
		diaPreviewContentDirectEmailPage.clickOnsubMenuItem4();
	}
	
	@Step
	public void navigateToListArticlesInLibraryPage() {
		diaPreviewContentDirectEmailPage.clickOnsubMenuItem5();
	}
	
	/*
	 * End Sub Menu
	 */
	
	/*
	 * Action Bar
	 */
	
	@Step
	public void navigateToDirectEmailPreviewPage() {
		diaPreviewContentDirectEmailPage.clickOnActionBarItem1();
	}
	
	@Step
	public void navigateToDirectEmailHTMLEditorPage() {
		diaPreviewContentDirectEmailPage.clickOnActionBarItem2();
	}
	
	@Step
	public void navigateToDirectEmailHTMLSourcePage() {
		diaPreviewContentDirectEmailPage.clickOnActionBarItem3();
	}
	
	@Step
	public void navigateToDirectEmailTextVersionPage() {
		diaPreviewContentDirectEmailPage.clickOnActionBarItem4();
	}
	
	@Step
	public void navigateToDirectEmailDetailsPage() {
		diaPreviewContentDirectEmailPage.clickOnActionBarItem5();
	}
	
	@Step
	public void navigateToDirectEmailPropertiesPage() {
		diaPreviewContentDirectEmailPage.clickOnActionBarItem6();
	}
	
	@Step
	public void navigateToDirectEmailContentCheckPage() {
		diaPreviewContentDirectEmailPage.clickOnActionBarItem7();
	}
	
	/*
	 * End Action Bar
	 */
	
	/*
	 * Second Action Bar
	 */
	
	@Step
	public void openTestPublishcationWizard() {
		diaPreviewContentDirectEmailPage.clickOnSecondActionBarItem1();
	}
	
	@Step
	public void openPublishcationWizard() {
		diaPreviewContentDirectEmailPage.clickOnSecondActionBarItem2();
	}
	
	@Step
	public void navigateToABTestPage() {
		diaPreviewContentDirectEmailPage.clickOnSecondActionBarItem3();
	}
	
	@Step
	public void actionArchiveDirectEmail() {
		diaPreviewContentDirectEmailPage.clickOnSecondActionBarItem4();
	}
	
	@Step
	public void actionCopyDirectEmail() {
		diaPreviewContentDirectEmailPage.clickOnSecondActionBarItem5();
	}
	
	/*
	 * End Second Action Bar
	 */
	
	@Step
	public void onPreviewContentDirectEmailPage() {
		assert(diaPreviewContentDirectEmailPage.getPreviewDirectEmailUrl());
	}
	
	@Step
	public void verifyheaderNameTextPreviewDirectEmail(String value) {
		assertThat(diaPreviewContentDirectEmailPage.getheaderNameText().equalsIgnoreCase("Direct email " + value));
	}

}
