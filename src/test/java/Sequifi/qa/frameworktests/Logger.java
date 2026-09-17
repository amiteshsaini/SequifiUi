package Sequifi.qa.frameworktests;


public class Logger extends TestBase {

    public void logStep(LogResult theResult, String logMessage) {
        logStepResult(theResult, logMessage);
        if (theResult == LogResult.FAIL) {
//            Assert.fail(logMessage);
        }
    }
}
