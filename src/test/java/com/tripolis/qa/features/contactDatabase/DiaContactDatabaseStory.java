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
	public DiaContactDatabaseSteps tuan;
	
	@Before
	public void setUp() {
		tuan.loginAndNavigateToAdminPage("haralds company", "tuan.tran@tripolis.com", "Pa$$w0rt");
		tuan.goToHomePage();
	}
	
	@Test
	public void scenario8ClickOnCancelButtonCreateContactDatabase() {
		tuan.goToAdminPage();
		tuan.clickOnNewLink();
		tuan.seeCreateDatabaseDialog();
		tuan.clickOnCancelButton();
	}
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
