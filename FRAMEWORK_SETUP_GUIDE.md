# Step-by-Step Guide: Building a Cucumber + TestNG + Selenium Framework

## Prerequisites
- Java JDK 8 or higher
- Maven 3.6+
- IDE (IntelliJ IDEA / Eclipse)
- Chrome browser installed

---

## Step 1: Create Maven Project

### 1.1 Initialize Maven Project
```bash
mvn archetype:generate -DgroupId=com.yourcompany -DartifactId=test-automation-framework -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

### 1.2 Update pom.xml with Dependencies

Create/update `pom.xml` with these dependencies:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    
    <groupId>com.yourcompany</groupId>
    <artifactId>test-automation-framework</artifactId>
    <version>1.0</version>
    
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
        <cucumber.version>5.7.0</cucumber.version>
        <selenium.version>4.11.0</selenium.version>
        <testng.version>7.8.0</testng.version>
    </properties>
    
    <dependencies>
        <!-- Cucumber Dependencies -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>${cucumber.version}</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-testng</artifactId>
            <version>${cucumber.version}</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-picocontainer</artifactId>
            <version>${cucumber.version}</version>
        </dependency>
        
        <!-- Selenium Dependencies -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>${selenium.version}</version>
        </dependency>
        
        <!-- TestNG -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>${testng.version}</version>
        </dependency>
        
        <!-- Logging -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.20.0</version>
        </dependency>
        
        <!-- Reporting -->
        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>5.0.4</version>
        </dependency>
        <dependency>
            <groupId>net.masterthought</groupId>
            <artifactId>cucumber-reporting</artifactId>
            <version>5.7.0</version>
        </dependency>
    </dependencies>
    
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0</version>
                <configuration>
                    <suiteXmlFiles>
                        <suiteXmlFile>testng.xml</suiteXmlFile>
                    </suiteXmlFiles>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

---

## Step 2: Create Project Structure

Create the following directory structure:

```
src/
├── main/
│   └── resources/
│       └── common/
│           ├── configuration.properties
│           └── dev.properties
└── test/
    ├── java/
    │   └── com/
    │       └── yourcompany/
    │           ├── Runner.java
    │           ├── framework/
    │           │   ├── AbstractCucumberTestNGTest.java
    │           │   ├── BaseCucumberTest.java
    │           │   └── TestState.java
    │           ├── configuration/
    │           │   ├── ProjectConfigurations.java
    │           │   └── CheckConfigurationSettings.java
    │           ├── stepdefinitions/
    │           │   └── AbstractStepDefinitions.java
    │           └── pageobjects/
    │               └── LoginPage.java
    └── resources/
        └── features/
            └── Login.feature
```

---

## Step 3: Create Configuration Files

### 3.1 Create `src/main/resources/common/configuration.properties`
```properties
project=Test_Automation_Framework
parallel=true
threadCount=3
environment=dev
```

### 3.2 Create `src/main/resources/common/dev.properties`
```properties
url=https://your-test-url.com
username=testuser
password=testpass
```

---

## Step 4: Create Framework Core Classes

### 4.1 Create TestState.java
**Location:** `src/test/java/com/yourcompany/framework/TestState.java`

```java
package com.yourcompany.framework;

import org.openqa.selenium.WebDriver;
import java.util.HashMap;
import java.util.Map;

public class TestState {
    private WebDriver driver;
    private Map<String, Object> scenarioContext;
    private int timeout = 30;

    public TestState() {
        scenarioContext = new HashMap<>();
    }

    public void setContext(String key, Object value) {
        scenarioContext.put(key, value);
    }

    public Object getContext(String key) {
        return scenarioContext.get(key);
    }

    public Boolean contains(String key) {
        return scenarioContext.containsKey(key);
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
```

### 4.2 Create BaseCucumberTest.java
**Location:** `src/test/java/com/yourcompany/framework/BaseCucumberTest.java`

```java
package com.yourcompany.framework;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;

import java.util.concurrent.TimeUnit;

public class BaseCucumberTest {
    public static final ProjectConfigurations configurations = new ProjectConfigurations();
    private static ITestContext testListener;
    private WebDriver driver;

    public static void setTestListener(ITestContext testListener) {
        BaseCucumberTest.testListener = testListener;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setUpBeforeScenario(Scenario scenario) {
        // Set Chrome driver path (or use WebDriverManager)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void tearDownAfterScenario(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            getScreenshot(scenario);
        }
        closeDriver();
    }

    private void closeDriver() {
        try {
            Thread.sleep(2000);
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {
            System.out.println("Error during driver close: " + e.getMessage());
        }
    }

    private void getScreenshot(Scenario scenario) {
        try {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        } catch (Exception e) {
            System.out.println("Driver not available for screenshot: " + e.getMessage());
        }
    }
}
```

### 4.3 Create ProjectConfigurations.java
**Location:** `src/test/java/com/yourcompany/configuration/ProjectConfigurations.java`

```java
package com.yourcompany.configuration;

import java.io.*;
import java.util.Properties;

public class ProjectConfigurations {
    private Properties properties;

    public ProjectConfigurations() {
        loadProperties("/src/main/resources/common/configuration.properties");
    }

    public ProjectConfigurations(String filePath) {
        loadProperties(filePath);
    }

    private void loadProperties(String filePath) {
        File curFile = new File("");
        try (FileInputStream configurations = new FileInputStream(
                curFile.getAbsolutePath() + filePath)) {
            this.properties = new Properties();
            this.properties.load(configurations);
        } catch (IOException e) {
            System.err.println("Error loading properties: " + e.getMessage());
        }
    }

    public String getData(String elementName) {
        return this.properties.getProperty(elementName);
    }
}
```

### 4.4 Create CheckConfigurationSettings.java
**Location:** `src/test/java/com/yourcompany/configuration/CheckConfigurationSettings.java`

```java
package com.yourcompany.configuration;

public class CheckConfigurationSettings {
    
    private CheckConfigurationSettings() {
        throw new IllegalStateException("Utility class");
    }

    public static String getPropertyValue(String property) {
        try {
            String value = ProjectConfigurations.getProjectConfigurations().getData(property);
            if (value != null && !value.isEmpty()) {
                return value;
            }
        } catch (Exception e) {
            System.out.println("Property '" + property + "' not found");
        }
        return null;
    }

    public static String getEnvironmentPropertyValue(String property) {
        String environment = System.getProperty("environment", 
            CheckConfigurationSettings.getPropertyValue("environment"));
        String filepath = "/src/main/resources/common/" + environment + ".properties";
        try {
            String value = new ProjectConfigurations(filepath).getData(property);
            if (value != null && !value.isEmpty()) {
                return value;
            }
        } catch (Exception e) {
            System.out.println("Environment property '" + property + "' not found");
        }
        return null;
    }
}
```

### 4.5 Create AbstractStepDefinitions.java
**Location:** `src/test/java/com/yourcompany/stepdefinitions/AbstractStepDefinitions.java`

```java
package com.yourcompany.stepdefinitions;

import com.yourcompany.framework.BaseCucumberTest;
import com.yourcompany.framework.TestState;

public abstract class AbstractStepDefinitions extends BaseCucumberTest {
    protected TestState state;

    public AbstractStepDefinitions(TestState state) {
        this.state = state;
    }
}
```

### 4.6 Create AbstractCucumberTestNGTest.java
**Location:** `src/test/java/com/yourcompany/framework/AbstractCucumberTestNGTest.java`

```java
package com.yourcompany.framework;

import com.yourcompany.configuration.CheckConfigurationSettings;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.ITestContext;
import org.testng.annotations.*;

public abstract class AbstractCucumberTestNGTest {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setupBeforeClass(ITestContext testListener) {
        BaseCucumberTest.setTestListener(testListener);
        this.testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void features(PickleWrapper pickleEvent, FeatureWrapper cucumberFeature) {
        this.testNGCucumberRunner.runScenario(pickleEvent.getPickle());
    }

    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return this.testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (this.testNGCucumberRunner != null) {
            this.testNGCucumberRunner.finish();
        }
    }
}
```

---

## Step 5: Create TestNG Configuration

### 5.1 Create `testng.xml` (in project root)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Test Suite" parallel="methods" thread-count="3">
    <test name="Cucumber Tests">
        <classes>
            <class name="com.yourcompany.Runner"/>
        </classes>
    </test>
</suite>
```

---

## Step 6: Create Runner Class

### 6.1 Create Runner.java
**Location:** `src/test/java/com/yourcompany/Runner.java`

```java
package com.yourcompany;

import com.yourcompany.framework.AbstractCucumberTestNGTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Smoke",
        features = "src/test/resources/features",
        glue = {"com.yourcompany.stepdefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-html-reports",
                "json:target/cucumber-html-reports/cucumber.json"
        },
        monochrome = true
)
public class Runner extends AbstractCucumberTestNGTest {
}
```

---

## Step 7: Create Page Objects

### 7.1 Create LoginPage.java
**Location:** `src/test/java/com/yourcompany/pageobjects/LoginPage.java`

```java
package com.yourcompany.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Locators
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By errorMessage = By.className("error");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
```

---

## Step 8: Create Step Definitions

### 8.1 Create LoginStepDefinitions.java
**Location:** `src/test/java/com/yourcompany/stepdefinitions/LoginStepDefinitions.java`

```java
package com.yourcompany.stepdefinitions;

import com.yourcompany.configuration.CheckConfigurationSettings;
import com.yourcompany.framework.TestState;
import com.yourcompany.pageobjects.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends AbstractStepDefinitions {
    
    private LoginPage loginPage;

    public LoginStepDefinitions(TestState state) {
        super(state);
    }

    @Before
    public void setUp(Scenario scenario) {
        setUpBeforeScenario(scenario);
        state.setDriver(getDriver());
        loginPage = new LoginPage(state.getDriver());
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        String url = CheckConfigurationSettings.getEnvironmentPropertyValue("url");
        state.getDriver().get(url);
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        // Add validation logic
        System.out.println("Login successful");
    }

    @io.cucumber.java.After
    public void tearDown(Scenario scenario) throws Exception {
        tearDownAfterScenario(scenario);
    }
}
```

---

## Step 9: Create Feature File

### 9.1 Create Login.feature
**Location:** `src/test/resources/features/Login.feature`

```gherkin
@Smoke
Feature: User Login

  Scenario: Successful login
    Given user is on login page
    When user enters username "testuser" and password "testpass"
    And user clicks login button
    Then user should be logged in successfully

  Scenario: Failed login with invalid credentials
    Given user is on login page
    When user enters username "invalid" and password "wrong"
    And user clicks login button
    Then user should see error message
```

---

## Step 10: Run Your Tests

### 10.1 Via Maven
```bash
mvn clean test
```

### 10.2 Via TestNG
- Right-click on `testng.xml` → Run
- Or run `Runner.java` directly

### 10.3 With specific tags
Update Runner.java:
```java
@CucumberOptions(
        tags = "@Smoke or @Regression",  // Run multiple tags
        // ... rest of config
)
```

---

## Step 11: Add WebDriverManager (Optional but Recommended)

Add to `pom.xml`:
```xml
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.6.2</version>
</dependency>
```

Update `BaseCucumberTest.java`:
```java
import io.github.bonigarcia.wdm.WebDriverManager;

public void setUpBeforeScenario(Scenario scenario) {
    WebDriverManager.chromedriver().setup();  // Auto-downloads driver
    ChromeOptions options = new ChromeOptions();
    driver = new ChromeDriver(options);
    // ... rest of code
}
```

---

## Step 12: Best Practices to Follow

1. **Page Object Model**: Keep all locators in Page Object classes
2. **Reusable Methods**: Create common utility methods in a separate class
3. **Configuration Management**: Use properties files for environment-specific data
4. **Logging**: Add proper logging throughout the framework
5. **Wait Strategies**: Use explicit waits instead of Thread.sleep()
6. **Screenshot on Failure**: Already implemented in BaseCucumberTest
7. **Parallel Execution**: Configure in testng.xml and Runner.java
8. **Reporting**: Use ExtentReports or Cucumber HTML reports

---

## Next Steps

1. Add more page objects for other pages
2. Create utility classes for common operations
3. Add database connectivity if needed
4. Integrate with CI/CD (Jenkins, GitLab CI, etc.)
5. Add API testing capabilities
6. Implement data-driven testing with Excel/CSV
7. Add retry mechanism for flaky tests

---

## Common Issues & Solutions

### Issue: ChromeDriver not found
**Solution**: Use WebDriverManager or download ChromeDriver manually

### Issue: Tests not running in parallel
**Solution**: Check `parallel="true"` in testng.xml and `@DataProvider(parallel = true)`

### Issue: Step definitions not found
**Solution**: Verify `glue` path in `@CucumberOptions` matches your package structure

### Issue: Properties file not loading
**Solution**: Check file path is correct and file exists in `src/main/resources`

---

## Summary

You've now created a complete test automation framework with:
- ✅ Maven project structure
- ✅ Cucumber BDD framework
- ✅ TestNG integration
- ✅ Selenium WebDriver
- ✅ Page Object Model
- ✅ Configuration management
- ✅ Reporting capabilities
- ✅ Parallel execution support

Happy Testing! 🚀

