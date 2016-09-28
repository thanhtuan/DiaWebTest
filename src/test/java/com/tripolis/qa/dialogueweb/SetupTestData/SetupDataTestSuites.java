package com.tripolis.qa.dialogueweb.SetupTestData;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	Setup.class,
	Contacts.class,
	ContactGroup.class,
	Content.class
})
public class SetupDataTestSuites {

}
