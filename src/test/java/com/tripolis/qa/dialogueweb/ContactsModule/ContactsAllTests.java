package com.tripolis.qa.dialogueweb.ContactsModule;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({
	DiaContactsStory.class,
	DiaContactsUnHappyFlowStory.class
	})
public class ContactsAllTests {

	// the class remains empty,
	// used only as a holder for the above annotations
}
