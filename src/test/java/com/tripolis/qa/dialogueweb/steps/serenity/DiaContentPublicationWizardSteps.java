package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaContentPublicationWizard;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContentPublicationWizardSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaContentPublicationWizard diaContentPublicationWizard;

	@Step
	public void shouldOpenThePublicationWizard() {
		diaContentPublicationWizard.isShowDialog();		
	}

	@Step
	public void shouldSeeTheEmailPublicationWizardHeaderName() {
		assertThat(diaContentPublicationWizard.getHeaderNameText().equalsIgnoreCase("Publish email"));
		
	}
	
	@Step
	public void shouldSeeTheSMSPublicationWizardHeaderName() {
		assertThat(diaContentPublicationWizard.getHeaderNameText().equalsIgnoreCase("Publish SMS"));
		
	}
	
	@Step
	public void shouldBeAbleToSelectTheNewsletterType(String keyword) {
		diaContentPublicationWizard.selectNewsletterType(keyword);
		
	}
	
	@Step
	public void shouldBeAbleToSelectTheSMSMessageType(String keyword) {
		diaContentPublicationWizard.selectSMSMessageType(keyword);
		
	}
	
	@Step
	public void shouldSeeTheCorrectNoneMailingSelectorLabel() {
		assertThat(diaContentPublicationWizard.getNoneMailingSelectorLabel().equalsIgnoreCase("Select an email type"));
		
	}
	
	@Step
	public void shouldSeeTheCorrectNoneSMSSelectorLabel() {
		assertThat(diaContentPublicationWizard.getNoneMailingSelectorLabel().equalsIgnoreCase("Select a SMS type"));
		
	}
	
	@Step
	public void shouldBeAbleToSelectTheEditionMailing(String keyword) {
		diaContentPublicationWizard.selectEditionMailing(keyword);
		
	}
	
	@Step
	public void shouldBeAbleToSelectTheEditionSMSMessage(String keyword) {
		diaContentPublicationWizard.selectEditionMailing(keyword);
		
	}
	
	@Step
	public void shouldSeeTheCorrectNewletterTypeLabel(String keyword) {
		assertThat(diaContentPublicationWizard.getNewsletterTypeLabel().equalsIgnoreCase(keyword));
		
	}

	@Step
	public void shouldSeeTheCorrectNewletterEditionLabel(String keyword) {
		assertThat(diaContentPublicationWizard.getNewsletterLabel().equalsIgnoreCase(keyword));
		
	}

	@Step
	public void shouldSeeTheCorrectDirectEmailTypeLabel(String keyword) {
		assertThat(diaContentPublicationWizard.getDirectEmailTypeLabel().equalsIgnoreCase(keyword));
		
	}

	@Step
	public void shouldSeeTheCorrectDirectEmailEditionLabel(String keyword) {
		assertThat(diaContentPublicationWizard.getDirectEmailLabel().equalsIgnoreCase(keyword));
		
	}
	
	@Step
	public void shouldSeeTheCorrectSMSMessageTypeLabel(String keyword) {
		assertThat(diaContentPublicationWizard.getSMSMessageTypeLabel().equalsIgnoreCase(keyword));
		
	}

	@Step
	public void shouldSeeTheCorrectSMSMessageEditionLabel(String keyword) {
		assertThat(diaContentPublicationWizard.getDirectEmailLabel().equalsIgnoreCase(keyword));
		
	}
	
	@Step
	public void shouldSeeTheCorrectNoneGroupSelectorLabel() {
		assertThat(diaContentPublicationWizard.getNoneGroupSelectorLabel().equalsIgnoreCase("Select an edition"));
		
	}

	@Step
	public void shouldBeAbleToSelectTheGroup(String keyword) {
		diaContentPublicationWizard.selectGroup(keyword);
		
	}

	/*
	 * Options:
	 * 			sendNow
	 * 			schedule
	 */
	@Step
	public void shouldBeAbleToSelectSendOption(String value) {
		diaContentPublicationWizard.chooseSendOption(value);
		
	}

	@Step
	public void shouldBeAbleToCheckContentPersonalization(boolean b) {
		diaContentPublicationWizard.checkBox_ContentPersonalization(b);
		
	}

	@Step
	public void shouldBeAbleToCheckAllURLs(boolean b) {
		diaContentPublicationWizard.checkBox_AllURLs(b);
		
	}

	/*
	 * The Values can be use:
	 * 			0
	 * 			250000
	 * 			100000
	 * 			50000
	 * 			25000
	 * 			10000
	 */
	@Step
	public void shouldBeAbleToSelectMailsPerHour(String value) {
		diaContentPublicationWizard.select_MailsPerHour(value);
		
	}

	@Step
	public void shouldBeAbleToCheckmailReportEnabled(boolean b) {
		diaContentPublicationWizard.checkBox_MailReportEnabled(b);
		
	}
	
	@Step
	public void clickOnNextButton() {
		diaContentPublicationWizard.clickNextButton();
	}
	
	public void shouldBeAbleToConfirmMailing(boolean b) {
		diaContentPublicationWizard.checkBox_ConfirmMailing(b);
		
	}
	
	@Step
	public void clickOnSendNowButton() {
		diaContentPublicationWizard.clickNextButton();
	}
	
	@Step
	public void verifyheaderNameTextFinishedPublishEmail() {
		assertThat(diaContentPublicationWizard.getFormWizardHeaderNameText().equalsIgnoreCase("Publish email is finished"));
	}
	
	@Step
	public void verifyheaderNameTextFinishedPublishSMS() {
		assertThat(diaContentPublicationWizard.getFormWizardHeaderNameText().equalsIgnoreCase("Publish SMS is complete"));
	}
	
	@Step
	public void clickOnFinishButton() {
		diaContentPublicationWizard.clickFinishButton();;
	}
	
}
