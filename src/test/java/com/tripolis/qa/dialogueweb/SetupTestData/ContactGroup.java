package com.tripolis.qa.dialogueweb.SetupTestData;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.common.DiaActionbarSteps;
import com.tripolis.qa.common.DiaLeftSidebarSteps;
import com.tripolis.qa.common.DiaMainMenuSteps;
import com.tripolis.qa.common.DiaSubMenuSteps;
import com.tripolis.qa.common.Variables;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDashboardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateContactGroupFromFilterSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaViewContactGroupSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContactGroup {
	
	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	DiaMainMenuSteps diaMainMenuSteps;
	
	@Steps
	DiaSubMenuSteps diaSubMenuSteps;
	
	@Steps
	DiaLeftSidebarSteps diaLeftSidebarSteps;
	
	@Steps
	DiaActionbarSteps diaActionbarSteps;
	
	@Steps
	DiaLoginSteps diaLoginSteps;
	
	@Steps
	DiaContactDashboardSteps diaContactDashboardSteps;
	
	@Steps
	DiaListContactsSteps diaListContactsSteps;
	
	@Steps
	DiaCreateContactGroupFromFilterSteps diaCreateContactGroupFromFilterSteps;
	
	@Steps
	DiaViewContactGroupSteps diaViewContactGroupSteps;
	
	Variables var = new Variables();
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.adminUserName, Variables.passWord);
		diaLoginSteps.clickOnLoginButton();	
		diaLeftSidebarSteps.shouldBeAbleToSeeClientDomainName();
	}
	
	@Test
	@Title(value = "Create a 'STATIC' contact group using filtering function on list contacts page")
	@WithTags (
	        {
	        		@WithTag(type="feature", name="Prepare Data"),
	        		@WithTag(type="feature", name="Contact Module"),
	                @WithTag(type="feature", name="Contact Group"),
	                @WithTag(type="story", name="Create a 'STATIC' Contact Group")
	        }
	)
	public void scenario1_CreateContactGroupUsingFilteringOnListContacts() {
		var.BDlabel = diaLeftSidebarSteps.getcontactDatabasesLabel();
		diaMainMenuSteps.navigateToContactPage();
		diaContactDashboardSteps.onContactDashboardPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListContactsSteps.verifyheaderNameTextListContacts(var.BDlabel);
		diaListContactsSteps.typeAndEnterOnFilterEmail("user");
		diaActionbarSteps.navigateToPageThatActionBarItem1PresentFor();
		diaCreateContactGroupFromFilterSteps.onCreateContactGroupFromFilterPage();
		diaCreateContactGroupFromFilterSteps.verifyheaderNameTextCreateContactGroupFromFilterPage();
		diaCreateContactGroupFromFilterSteps.setLabel(Variables.staticGroupLabel);
		diaCreateContactGroupFromFilterSteps.setName(Variables.staticGroupName);
		diaCreateContactGroupFromFilterSteps.selectedGroupType("STATIC");
		diaCreateContactGroupFromFilterSteps.clickOnSaveButton();
		diaViewContactGroupSteps.onViewContactGroupPage();
		diaViewContactGroupSteps.verifyheaderNameTextViewContactGroup(Variables.staticGroupLabel);
	}
	
	@Test
	@Title(value = "Create a 'SUBSCRIPTION' contact group using filtering function on list contacts page")
	@WithTags (
	        {
	        		@WithTag(type="feature", name="Prepare Data"),
	        		@WithTag(type="feature", name="Contact Module"),
	                @WithTag(type="feature", name="Contact Group"),
	                @WithTag(type="story", name="Create a 'SUBSCRIPTION' Contact Group")
	        }
	)
	public void scenario2_CreateContactGroupUsingFilteringOnListContacts() {
		var.BDlabel = diaLeftSidebarSteps.getcontactDatabasesLabel();
		diaMainMenuSteps.navigateToContactPage();
		diaContactDashboardSteps.onContactDashboardPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListContactsSteps.verifyheaderNameTextListContacts(var.BDlabel);
		diaListContactsSteps.typeAndEnterOnFilterEmail("subscriber");
		diaActionbarSteps.navigateToPageThatActionBarItem1PresentFor();
		diaCreateContactGroupFromFilterSteps.onCreateContactGroupFromFilterPage();
		diaCreateContactGroupFromFilterSteps.verifyheaderNameTextCreateContactGroupFromFilterPage();
		diaCreateContactGroupFromFilterSteps.setLabel(Variables.subscriptionGroupLabel);
		diaCreateContactGroupFromFilterSteps.setName(Variables.subscriptionGroupName);
		diaCreateContactGroupFromFilterSteps.selectedGroupType("SUBSCRIPTION");
		diaCreateContactGroupFromFilterSteps.clickOnSaveButton();
		diaViewContactGroupSteps.onViewContactGroupPage();
		diaViewContactGroupSteps.verifyheaderNameTextViewContactGroup(Variables.staticGroupLabel);
	}
	
	@Test
	@Title(value = "Create a 'TEST' contact group using filtering function on list contacts page")
	@WithTags (
	        {
	        		@WithTag(type="feature", name="Prepare Data"),    
	        		@WithTag(type="feature", name="Contact Module"),
	                @WithTag(type="feature", name="Contact Group"),
	                @WithTag(type="story", name="Create a 'TEST' Contact Group")
	        }
	)
	public void scenario3_CreateContactGroupUsingFilteringOnListContacts() {
		var.BDlabel = diaLeftSidebarSteps.getcontactDatabasesLabel();
		diaMainMenuSteps.navigateToContactPage();
		diaContactDashboardSteps.onContactDashboardPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListContactsSteps.verifyheaderNameTextListContacts(var.BDlabel);
		diaListContactsSteps.typeAndEnterOnFilterName("Test User");
		diaActionbarSteps.navigateToPageThatActionBarItem1PresentFor();
		diaCreateContactGroupFromFilterSteps.onCreateContactGroupFromFilterPage();
		diaCreateContactGroupFromFilterSteps.verifyheaderNameTextCreateContactGroupFromFilterPage();
		diaCreateContactGroupFromFilterSteps.setLabel(Variables.testGroupLabel);
		diaCreateContactGroupFromFilterSteps.setName(Variables.testGroupName);
		diaCreateContactGroupFromFilterSteps.selectedGroupType("TEST");
		diaCreateContactGroupFromFilterSteps.clickOnSaveButton();
		diaViewContactGroupSteps.onViewContactGroupPage();
		diaViewContactGroupSteps.verifyheaderNameTextViewContactGroup(Variables.staticGroupLabel);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
