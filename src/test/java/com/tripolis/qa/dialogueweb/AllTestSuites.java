package com.tripolis.qa.dialogueweb;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tripolis.qa.dialogueweb.ContactsModule.ContactsAllTests;
import com.tripolis.qa.dialogueweb.ContentModule.ContentAllTests;
import com.tripolis.qa.dialogueweb.Login.DiaLoginStory;
import com.tripolis.qa.dialogueweb.SetupModule.AdminAllTests;
import com.tripolis.qa.dialogueweb.SetupTestData.SetupDataAllTests;
import com.tripolis.qa.dialogueweb.TearDownTestData.CleanUpData;

@RunWith(Suite.class)
@SuiteClasses({	
	DiaLoginStory.class,
	SetupDataAllTests.class,
	AdminAllTests.class,
	ContactsAllTests.class,
	ContentAllTests.class,
	CleanUpData.class
})
public class AllTestSuites {

}
