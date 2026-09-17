package Sequifi.qa.reporting.logging;

import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import StepDefinitions.ProjectStepDefinitions;
import org.testng.Assert;

public class CustomLogging extends AbstractStepDefinitions {

    public CustomLogging(TestState state) {
        super(state);
    }

    public void customAssertTrue(boolean condition, String message) {
        if (condition) {
            state.setContext("messageLog", appendMessageToLog(message));
//            ProjectStepDefinitions.scenario.write(Thread.currentThread().getName() + ":" + state.getContext("messageLog").toString());
        } else {
            state.setContext("messageLog", appendMessageToLog("Assertion Failure: " + message));
//            ProjectStepDefinitions.scenario.write(Thread.currentThread().getName() + ":" + state.getContext("messageLog").toString());
            Assert.assertTrue(condition, message);
        }
    }

    public void customAssertFalse(boolean condition, String message) {
        if (condition) {
            state.setContext("messageLog", appendMessageToLog("Assertion Failure: " + message));
//            ProjectStepDefinitions.scenario.write(state.getContext("messageLog").toString());
            Assert.assertTrue(condition, message);
        } else {
            state.setContext("messageLog", appendMessageToLog(message));
//            ProjectStepDefinitions.scenario.write(state.getContext("messageLog").toString());
        }
    }

    public void customAssertEquals(Object actual, Object expected, String message) {
        if (actual.equals(expected)) {
            state.setContext("messageLog", appendMessageToLog(message));
//            ProjectStepDefinitions.scenario.write(state.getContext("messageLog").toString());
        } else {
            state.setContext("messageLog", appendMessageToLog("Assertion Failure: " + message));
//            ProjectStepDefinitions.scenario.write(state.getContext("messageLog").toString());
            Assert.assertEquals(actual, expected, message);
        }
    }

    public void customAssertNotEquals(Object actual, Object expected, String message) {
        if (actual.equals(expected)) {
            state.setContext("messageLog", appendMessageToLog("Assertion Failure: " + message));
//            ProjectStepDefinitions.scenario.write(state.getContext("messageLog").toString());
            Assert.assertNotEquals(actual, expected, message);
        } else {
            state.setContext("messageLog", appendMessageToLog(message));
//            ProjectStepDefinitions.scenario.write(state.getContext("messageLog").toString());
        }
    }

    public String appendMessageToLog(String newMessage) {
        String originalMessageLog = "";
        if (state.isContains("messageLog")) {
            originalMessageLog = state.getContext("messageLog").toString();
        }
        return originalMessageLog + "\n" + newMessage;
    }

    public void appendMsgToContext(String newMessage) {
        String originalMessageLog = "";
        if (state.isContains("messageLog")) {
            originalMessageLog = state.getContext("messageLog").toString();
        }
        state.setContext("messageLog", originalMessageLog + "\n" + newMessage);
    }

    public void appendMsgToContextInBold(String newMessage) {
        String originalMessageLog = "";
        if (state.isContains("messageLog")) {
            originalMessageLog = state.getContext("messageLog").toString();
        }
        state.setContext("messageLog", originalMessageLog + "\n" + "<b>" + newMessage + "</b>");
    }

}
