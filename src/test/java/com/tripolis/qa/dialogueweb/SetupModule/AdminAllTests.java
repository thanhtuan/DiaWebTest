package com.tripolis.qa.dialogueweb.SetupModule;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	DiaDirectEmailTypeStory.class,
	DiaSMSMessageTypeStory.class,
	DiaWorkspaceStory.class,
	DiaContactDatabaseStory.class
	})
public class AdminAllTests {

	// the class remains empty,
	// used only as a holder for the above annotations
}
