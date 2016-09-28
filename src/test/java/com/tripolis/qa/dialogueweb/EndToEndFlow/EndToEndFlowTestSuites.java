package com.tripolis.qa.dialogueweb.EndToEndFlow;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	PublishEmail.class,
	PublishSMSMessage.class
	})
public class EndToEndFlowTestSuites {

}
