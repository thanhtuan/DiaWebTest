package com.tripolis.qa.features.contactDatabase;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.steps.serenity.DiaContactDatabaseSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaContactDatabaseStory {

	@Managed(uniqueSession = true)
    public WebDriver driver = null;

	@Steps
	public DiaContactDatabaseSteps EndUser;
	
	@Before
	public void setUp() throws InterruptedException {
		EndUser.loginToDia("haralds company", "tuan.tran@tripolis.com", "Pa$$w0rt");
	}
	
	@Test
	public void scenario8ClickOnCancelButtonCreateContactDatabase() {
		EndUser.navigateToAdministrationPage();
		EndUser.onAdministrationPage();
		EndUser.navigateToListContactDatabasesPage();
		EndUser.onListContactDatabasesPage();
		EndUser.clickOnNewLink();
		EndUser.seeCreateDatabaseDialog();
		EndUser.clickOnCancelButton();
	}
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
