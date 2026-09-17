package Sequifi.qa.frameworktests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.asserts.SoftAssert;

public class TestBase {
    protected SoftAssert sa = new SoftAssert();

    public TestBase() {

    }

    public static void sleep(int seconds) throws InterruptedException {
        try {
            for (int i = 0; i < seconds; ++i) {
                Thread.sleep(1000L);
            }

        } catch (InterruptedException var2) {
            throw var2;
        }
    }

    public void addException(Exception e) {
        this.addException(e);
    }

    @AfterSuite(
            alwaysRun = true
    )
    protected void afterSuite() {
        ITestResult result = Reporter.getCurrentTestResult();
        String suiteName = result.getTestContext().getSuite().getName();
        //String hms = CommonUtils.getTimeInHMS();
    }

    protected void assertAllConditions(String msg, boolean... conditions) {
        boolean condition = true;
        boolean[] var4 = conditions;
        int var5 = conditions.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            boolean condition2 = var4[var6];
            condition &= condition2;
        }

        Assert.assertTrue(condition, msg);
    }

    protected void assertTrue(boolean condition, String msg) {
        Assert.assertTrue(condition, msg);
    }

    protected void checkForVerificationErrors() {
        this.sa.assertAll();
    }

    protected void assertTrue(boolean condition, String message, boolean logResult) {
        try {
            Assert.assertTrue(condition, message);
            if (logResult) {
                this.logStepResult(LogResult.PASS, message);
            } else {
                this.logComment(LogResult.PASS, message);
            }
        } catch (Error var5) {
            if (logResult) {
                this.logStepResult(LogResult.FAIL, var5.getMessage());
            } else {
                this.logComment(LogResult.FAIL, var5.getMessage());
            }
        }

    }

    protected void assertFalse(boolean condition, String message, boolean logResult) {
        try {
            Assert.assertFalse(condition, message);
            if (logResult) {
                this.logStepResult(LogResult.PASS, message);
            } else {
                this.logComment(LogResult.PASS, message);
            }
        } catch (Error var5) {
            if (logResult) {
                this.logStepResult(LogResult.FAIL, var5.getMessage());
            } else {
                this.logComment(LogResult.FAIL, var5.getMessage());
            }
        }

    }

    protected void logStepResult(LogResult result, String message) {
        this.logStepResult(result, message, (Exception) null);
    }

    protected void logStepResult(LogResult result, String message, Exception ex) {
        this.recordStepResults(result, message, (String[]) null, ex);
    }

    protected void logStepResult(LogResult result, String[] ids, String message) {
        this.recordStepResults(result, message, ids, (Exception) null);
    }

    protected void logComment(LogResult result, String message) {
        this.addNote(result, message, (Exception) null);
    }

    protected void addNote(LogResult result, String message, Exception ex) {
        StringBuilder comment = (new StringBuilder()).append(message);
        if (null != ex) {
            comment.append(" :: Exception => ").append(ex.getMessage());
        }

        comment.append(";");
    }

    protected void recordStepResults(LogResult result, String message, String[] ids, Exception ex) {
        try {
            if (FrameworkProperties.IsTakeScreenshots() && result.equals(LogResult.FAIL)) {
                // Screenshot a = new Screenshot();
                // a.takeScreenshotOnFailure();
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }
}
