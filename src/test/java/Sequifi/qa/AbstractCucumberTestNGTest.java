package Sequifi.qa;

import Sequifi.qa.configuration.CheckConfigurationSettings;
import Sequifi.qa.exceptions.MTPException;
import Sequifi.qa.exceptions.MTPRuntimeException;
import Sequifi.qa.frameworktests.BaseCucumberTest;
import Sequifi.qa.reporting.framework.Logging;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public abstract class AbstractCucumberTestNGTest {
    private static final String HTML_OUT = "extent.reporter.html.out";
    private static Map<String, String> scenarioRunResults;
    private static Map<String, String> scenarioRunResultsJira;
    private TestNGCucumberRunner testNGCucumberRunner;
    private Map<String, String> featureRunResults;
    private Map<String, String> featureJiraResults;
    private RuntimeException dataProviderException;
    public AbstractCucumberTestNGTest() {
    }

    @BeforeSuite(alwaysRun = true)
    public void setupBeforeSuite(ITestContext testListener) {
        String reportName = "Cucumber_Reports/" + testListener.getSuite().getName() + new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss").format(new Date()) + ".html";
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.logger.start", "false");
        System.setProperty(HTML_OUT, reportName);
        testListener.getSuite().getXmlSuite().setDataProviderThreadCount(this.getThreadCount());
    }

    @BeforeClass(alwaysRun = true)
    public void setupBeforeClass(ITestContext testListener) {
        try {
            String currentXmlTestName = testListener.getCurrentXmlTest().getName();
            scenarioRunResults = new ConcurrentHashMap();
            scenarioRunResultsJira = new ConcurrentHashMap();
            this.featureJiraResults = new HashMap();
            this.featureRunResults = new HashMap();
            BaseCucumberTest.setTestListener(testListener);
            String reportName = "Cucumber_Reports/" + currentXmlTestName + (new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss")).format(new Date()) + ".html";
            System.setProperty("extent.reporter.html.out", reportName);
            this.dataProviderException = null;
            this.setTestNGCucumberRunner(new TestNGCucumberRunner(this.getClass()));
        } catch (ClassCastException var7) {
            Logging.logError("Class Cast Exception - " + var7.getMessage());
        } catch (NullPointerException var8) {
            Logging.logError("Null Pointer Exception - " + var8.getMessage());
        } catch (Exception var9) {
            Logging.logError("Before Class Error" + var9);
        }
    }

    @Test(
            description = "Runs Cucumber Scenarios",
            dataProvider = "scenarios"
    )
    public void features(PickleWrapper pickleEvent, FeatureWrapper cucumberFeature, ITestContext testListner) {
        String cucumberFeatureMethod = "Run of Cucumber Feature Method '";
        String undefinedSteps = null;
        String parserException = null;
        String scenarioName = null;
        String browserName = null;
        boolean var17 = false;

        String featureName;
        label98:
        {
            label99:
            {
                label100:
                {
                    label101:
                    {
                        try {
                            var17 = true;
                            scenarioName = pickleEvent.getPickle().toString();
                            browserName = (String) testListner.getCurrentXmlTest().getLocalParameters().get("browserName");
//                            ElkIntegration.initializeScenarioData(scenarioName, cucumberFeature, testListner);
                            this.getTestNGCucumberRunner().runScenario(pickleEvent.getPickle());
//                            this.elk.addTestData("passed");
                            scenarioRunResults.putIfAbsent(this.setFeatureNameWithBrowser(scenarioName, testListner, browserName), "PASSED");
                            scenarioRunResults.putIfAbsent(scenarioName, "PASSED");
                            undefinedSteps = "Feature: " + cucumberFeature.toString() + " Skipped because of incorrect paths to step definition files or Undefined Steps in Scenario: '";
                            var17 = false;
                            break label98;
                        } catch (SkipException var19) {
//                            this.elk.addTestData("skipped");
                            if (var19.getMessage().contains("There are undefined steps")) {
                                Logging.logError(undefinedSteps + pickleEvent.getPickle().toString() + "' Failed", var19);
                                Assert.fail(parserException + pickleEvent.getPickle().toString());
                                var17 = false;
                                break label100;
                            }
                            var17 = false;
                            break label100;
                        } catch (RuntimeException var20) {
                            scenarioRunResults.put(this.setFeatureNameWithBrowser(scenarioName, testListner, browserName), "FAILED");
                            scenarioRunResultsJira.put(scenarioName, "FAILED");
//                            this.elk.addTestData("failed");
                            Logging.logError("Run of Cucumber Feature Method '" + cucumberFeature.toString() + "' FAILED" + var20.getLocalizedMessage());
                            Assert.fail(cucumberFeature.toString() + "' Failed");
                            var17 = false;
                            break label101;
                        } catch (Throwable var21) {
                            scenarioRunResults.put(this.setFeatureNameWithBrowser(scenarioName, testListner, browserName), "FAILED");
                            scenarioRunResultsJira.put(scenarioName, "FAILED");
//                            this.elk.addTestData("failed");
                            Logging.logError("Run of Cucumber Feature Method '" + cucumberFeature.toString() + "' FAILED" + " for THROWABLE " + var21.getLocalizedMessage());
                            Assert.fail(cucumberFeature.toString() + "' Failed");
                            var17 = false;
                        } finally {
                            if (var17) {
                                featureName = cucumberFeature.toString().replace("\"", "");
                                testListner.setAttribute("currentTest", this.setFeatureNameWithBrowser(featureName, testListner, browserName));
                                testListner.setAttribute("currentFeature", featureName);
//                                ElkIntegration.sendData();
                            }
                        }
                        featureName = cucumberFeature.toString().replace("\"", "");
                        testListner.setAttribute("currentTest", this.setFeatureNameWithBrowser(featureName, testListner, browserName));
                        testListner.setAttribute("currentFeature", featureName);
//                        ElkIntegration.sendData();
                        return;
                    }
                    featureName = cucumberFeature.toString().replace("\"", "");
                    testListner.setAttribute("currentTest", this.setFeatureNameWithBrowser(featureName, testListner, browserName));
                    testListner.setAttribute("currentFeature", featureName);
//                    ElkIntegration.sendData();
                    return;
                }
                featureName = cucumberFeature.toString().replace("\"", "");
                testListner.setAttribute("currentTest", this.setFeatureNameWithBrowser(featureName, testListner, browserName));
                testListner.setAttribute("currentFeature", featureName);
//                ElkIntegration.sendData();
                return;
            }
        }
        featureName = cucumberFeature.toString().replace("\"", "");
        testListner.setAttribute("currentTest", this.setFeatureNameWithBrowser(featureName, testListner, browserName));
        testListner.setAttribute("currentFeature", featureName);
//        ElkIntegration.sendData();
    }

    @AfterMethod
    public void afterMethod(ITestResult testResult) {
        String currentTest = (String) testResult.getTestContext().getAttribute("currentTest");
        String currentFeature = (String) testResult.getTestContext().getAttribute("currentFeature");
        try {
            this.featureRunResults.putAll(this.testResultMapping(this.featureRunResults, currentTest, testResult.isSuccess()));
            this.featureJiraResults.putAll(this.testResultMapping(this.featureJiraResults, currentTest, testResult.isSuccess()));
        } catch (Exception var5) {
            Logging.logError("Error During Feature After Method - ", var5);
        }
    }

    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        try {
            Object[][] scenarios = this.getTestNGCucumberRunner().provideScenarios();
            return scenarios;
        } catch
//        (IllegalArgumentException | ParseException | NullPointerException var2)
        (RuntimeException var2) {
            this.dataProviderException = var2;
            return new Object[0][0];
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass(ITestContext testListener) {
        if (this.dataProviderException != null) {
            try {
                throw new MTPRuntimeException(this.dataProviderException.getMessage());
            } catch (MTPRuntimeException var5) {
                Logging.logError(var5.getMessage());
            }
        }
        if (this.getTestNGCucumberRunner() != null) {
            this.getTestNGCucumberRunner().finish();
        }
        this.featureRunResults = null;
        this.featureJiraResults = null;
        scenarioRunResults = null;
        scenarioRunResultsJira = null;
        this.dataProviderException = null;
    }


    public static void generateReport() {
        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber-html-reports/cucumber.json");

        Configuration configuration = new Configuration(reportOutputDirectory, "Sequifi");
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();

    }

    @AfterSuite(alwaysRun = true)
    public void teardownAfterSuite() {
        String REPORT_NOT_CREATED = " NOT CREATED. Please check Cucumber Report Adapter in your Runner File!";
        String reportName = System.getProperty(HTML_OUT);
        String reportSevere = "Report " + reportName + " NOT CREATED. Please check Cucumber Report Adapter in your Runner File!";
        if ((new File(reportName)).isFile()) {
//            JIRAUploads.uploadJiraXrayFeatureStatus(this.testExecution, reportName);
        } else {
            Logging.logWarning(reportSevere);
        }
        generateReport();
    }

    public int getThreadCount() {
        if (this.getParallelRunStatus()) {
            String threadCount = CheckConfigurationSettings.getPropertyValue("threadCount");
            try {
                if (threadCount == null || threadCount.isEmpty()) {
                    return 5;
                }
                if (Integer.parseInt(threadCount) > 0) {
                    return Integer.parseInt(threadCount);
                }
            } catch (NumberFormatException var3) {
                Logging.logError("ThreadCount number is not a valid number. Default threadcount will be set to 10!");
                return 5;
            }
        }
        return 5;
    }

    public boolean getParallelRunStatus() {
        String parallel = CheckConfigurationSettings.getPropertyValue("parallel");
        String parallelWarning = "Parallel Value must be a 'true' or 'false' you paseed in '" + parallel + "'.  Please Update!";
        String BOOLEAN_PARSE_FAILED = "Parallel property parsing to boolean failed";
        if (parallel != null) {
            if (parallel.equalsIgnoreCase("true") || parallel.equalsIgnoreCase("false")) {
                try {
                    return Boolean.parseBoolean(parallel);
                } catch (IllegalArgumentException var5) {
                    Logging.logError("Parallel property parsing to boolean failed", var5);
                }
            }
            Logging.logWarning(parallelWarning);
        }
        return false;
    }

    public TestNGCucumberRunner getTestNGCucumberRunner() {
        return this.testNGCucumberRunner;
    }

    public void setTestNGCucumberRunner(TestNGCucumberRunner testNGCucumberRunner) {
        this.testNGCucumberRunner = testNGCucumberRunner;
    }

    public String setFeatureNameWithBrowser(String featureName, ITestContext testListener, String browser) {
        if (browser != null && browser != "") {
            if (!browser.equalsIgnoreCase("chrome") && !browser.equalsIgnoreCase("chrome_headless")) {
                if (browser.equalsIgnoreCase("internet explorer")) {
                    featureName = featureName + "_IE";
                } else if (browser.equalsIgnoreCase("firefox")) {
                    featureName = featureName + "_Firefox";
                } else {
                    featureName = featureName + "_" + browser;
                }
            } else {
                featureName = featureName + "_chrome";
            }
        } else {
            String platform = (String) testListener.getCurrentXmlTest().getLocalParameters().get("platformName");
//            if(!platform.equalsIgnoreCase("Android") && !platform.equalsIgnoreCase("iOS")){
//                String warning = "NEITHER THE BROWSER NOR A MOBILE DEVICE TYPE HAS BEEN SET";
//                Logging.logInfo(warning);
//            } else {
            featureName = featureName + "_" + platform;
//            }
        }
        return featureName;
    }

    public Map<String, String> testResultMapping(Map<String, String> testRunResults, String currentTest, boolean testResult) throws MTPException {
        try {
            if (currentTest != null) {
                Map<String, String> testResultEntry = new HashMap();
                if (!testResult) {
                    testResultEntry.put(currentTest, "FAILED");
                } else if (testRunResults.containsKey(currentTest)) {
                    if (((String) testRunResults.get(currentTest)).equalsIgnoreCase("FAILED")) {
                        testResultEntry.put(currentTest, "FAILED");
                    } else {
                        testResultEntry.put(currentTest, "PASSED");
                    }
                } else {
                    testResultEntry.put(currentTest, "PASSED");
                }
                return testResultEntry;
            } else {
                return null;
            }
        } catch (NullPointerException var5) {
            throw new MTPException("Error while updating Scenario Results Map: " + var5.getMessage(), var5);
        }
    }
}
