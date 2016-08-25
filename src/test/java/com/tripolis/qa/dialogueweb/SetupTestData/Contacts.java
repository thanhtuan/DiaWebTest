package com.tripolis.qa.dialogueweb.SetupTestData;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.common.DiaLeftSidebarSteps;
import com.tripolis.qa.common.DiaMainMenuSteps;
import com.tripolis.qa.common.DiaSubMenuSteps;
import com.tripolis.qa.common.Variables;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDashboardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateContactSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactDatabasesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaViewContactSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="testdata/contacts/createcontacts.csv")
@Concurrent(threads="4x")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Contacts {

	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	DiaMainMenuSteps diaMainMenuSteps;
	
	@Steps
	DiaSubMenuSteps diaSubMenuSteps;
	
	@Steps
	DiaLeftSidebarSteps diaLeftSidebarSteps;
	
	@Steps
	DiaLoginSteps diaLoginSteps;
	
	@Steps
	DiaHomeSteps diaHomeSteps;
	
	@Steps
	DiaListContactDatabasesSteps diaListContactDatabasesSteps;
	
	@Steps
	DiaContactDashboardSteps diaContactDashboardSteps;
	
	@Steps
	DiaListContactsSteps diaListContactsSteps;
	
	@Steps
	DiaCreateContactSteps diaCreateContactSteps;
	
	@Steps
	DiaViewContactSteps diaViewContactSteps;
	
	private String email;
    private String name;
    private String mobile;
	
	public void setEmail(String email) {
        this.email = email;
    }
	
	public void setName(String name) {
        this.name = name;
    }
	
	public void setMobile(String mobile) {
        this.mobile = mobile;
    }
	
	@Qualifier
    public String qualifier() {
        return email;
    }
	
	Variables var = new Variables();
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "test_automated_user@tripolis.com", "test");
		diaLoginSteps.clickonLoginButton();	
		diaLeftSidebarSteps.verifyClientName();
	}
	
	@Test
	@WithTags (
	        {
	                @WithTag(type="feature", name="Contacts"),
	                @WithTag(type="feature", name="Prepare Data")
	        }
	)
	public void scenario1_CreateContacts() {
		var.BDlabel = diaListContactDatabasesSteps.getcontactDatabasesLabel();
		diaMainMenuSteps.navigateToContactPage();
		diaContactDashboardSteps.onContactDashboardPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListContactsSteps.verifyheaderNameTextListContacts(var.BDlabel);
		diaListContactsSteps.clickOnNewLink();
		diaCreateContactSteps.onCreateContactPage();
		diaCreateContactSteps.setContactEmail(email);
		diaCreateContactSteps.setContactName(name);
		diaCreateContactSteps.setContactMobile(mobile);
		diaCreateContactSteps.clickOnSaveButton();
		diaViewContactSteps.verify_CreateContactSuccessfulMessage();
		diaViewContactSteps.onViewContactPage();
		diaViewContactSteps.verifyheaderNameTextViewContact(email);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
