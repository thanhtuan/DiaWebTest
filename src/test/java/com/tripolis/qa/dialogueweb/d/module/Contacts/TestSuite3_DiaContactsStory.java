package com.tripolis.qa.dialogueweb.d.module.Contacts;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.dialogueweb.steps.serenity.DiaAdministrationSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDashboardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDatabaseWizardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateContactSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactDatabasesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaViewContactSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="testdata/contacts/createcontacts.csv")
@Concurrent(threads="4x")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite3_DiaContactsStory {
	
	private String BDlabel;
	
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
	
	
	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	public DiaLoginSteps diaLoginSteps;
	
	@Steps
	public DiaHomeSteps diaHomeSteps;
	
	@Steps
	public DiaListContactDatabasesSteps diaListContactDatabasesSteps;
	
	@Steps
	public DiaContactDashboardSteps diaContactDashboardSteps;
	
	@Steps
	public DiaListContactsSteps diaListContactsSteps;
	
	@Steps
	public DiaCreateContactSteps diaCreateContactSteps;
	
	@Steps
	public DiaViewContactSteps diaViewContactSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "test_automated_user@tripolis.com", "test");
		diaLoginSteps.clickonLoginButton();	
		diaLoginSteps.verifyClientName();
		BDlabel = diaListContactDatabasesSteps.getcontactDatabasesLabel();
	}
	
	@Test
	public void scenario2_CreateContacts() {
		diaHomeSteps.navigateToContactPage();
		diaContactDashboardSteps.navigateToListContactsPage();
		diaListContactsSteps.verifyheaderNameTextListContacts(BDlabel);
		diaListContactsSteps.clickOnNewLink();
		diaCreateContactSteps.onCreateContactPage();
		diaCreateContactSteps.setContactEmail(email);
		diaCreateContactSteps.setContactName(name);
		diaCreateContactSteps.setContactMobile(mobile);
		diaCreateContactSteps.clickOnSubmitOkButton();
		diaViewContactSteps.onViewContactPage();
		diaViewContactSteps.verifyheaderNameTextViewContact(email);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
