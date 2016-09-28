package com.tripolis.qa.dialogueweb;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tripolis.qa.dialogueweb.ContactsModule.ContactsModuleTestSuites;
import com.tripolis.qa.dialogueweb.ContentModule.ContentModuleTestSuites;
import com.tripolis.qa.dialogueweb.EndToEndFlow.EndToEndFlowTestSuites;
import com.tripolis.qa.dialogueweb.Login.DiaLoginStory;
import com.tripolis.qa.dialogueweb.SetupModule.SetupModuleTestSuites;
import com.tripolis.qa.dialogueweb.SetupTestData.SetupDataTestSuites;
import com.tripolis.qa.dialogueweb.TearDownTestData.CleanUpData;

@RunWith(Suite.class)
@SuiteClasses({	
	SetupDataTestSuites.class,
	EndToEndFlowTestSuites.class,
	ContactsModuleTestSuites.class,
	ContentModuleTestSuites.class,
	SetupModuleTestSuites.class,
	CleanUpData.class,
	DiaLoginStory.class
})
public class AllTestSuites {

}
