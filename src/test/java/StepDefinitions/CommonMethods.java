package StepDefinitions;

import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonMethods extends AbstractStepDefinitions {
    Duration timeoutInSeconds = Duration.ofSeconds(10);
    Duration implicitTimeoutInSeconds = Duration.ofSeconds(5);

    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);


    public CommonMethods(TestState state) {
        super(state);
    }

    public static String getTimeElapsed(long milliseconds) {
        String format = String.format("%%0%dd", 2);
        long elapsedTime = milliseconds / 1000;
        String seconds = String.format(format, elapsedTime % 60);
        String minutes = String.format(format, (elapsedTime % 3600) / 60);
        String hours = String.format(format, elapsedTime / 3600);
        String time = hours + ":" + minutes + ":" + seconds;
        return time;
    }

    public static String todayDateTime(String pattern) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public void implicitlyWait() {
        this.state.getDriver().manage().timeouts().implicitlyWait(implicitTimeoutInSeconds);
    }

    public boolean waitUntilElementIsVisible(By payrollReport) {
        WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(payrollReport));
        if (state.getDriver().findElement(payrollReport).isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean absoluteClick(By by) throws InterruptedException {
        Thread.sleep(2000);
        Actions action = new Actions(this.state.getDriver());
        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            } catch (Exception e0) {

            }
            WebElement element = this.state.getDriver().findElement(by);
            try {
//                ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
                action.moveToElement(this.state.getDriver().findElement(by)).moveToElement(element).perform();
            } catch (Exception e0) {

            }
            Thread.sleep(1000);
            action.moveToElement(this.state.getDriver().findElement(by)).click().perform();
            return true;
        } catch (Exception e1) {
            try {
                JavascriptExecutor executor = (JavascriptExecutor) this.state.getDriver();
                executor.executeScript("arguments[0].click();", this.state.getDriver().findElement(by));
                return true;
            } catch (Exception e2) {
                try {
                    this.state.getDriver().findElement(by).click();
                    return true;
                } catch (Exception e3) {
                    return false;
                }
            }
        }
    }

    public boolean absoluteSelectFromDropdown(By by, String dropDownValue) throws InterruptedException {
        Thread.sleep(2000);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            WebElement element = this.state.getDriver().findElement(by);
            ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
            Thread.sleep(1000);
            Select drpDown = new Select(this.state.getDriver().findElement(by));
            drpDown.selectByVisibleText(dropDownValue);
            return true;
        } catch (Exception e1) {
            return false;
        }
    }

    public boolean absoluteSelectDateFromCalendar(By by, String dateValue) throws InterruptedException {
        Thread.sleep(2000);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            WebElement element = this.state.getDriver().findElement(by);
            JavascriptExecutor executor = (JavascriptExecutor) this.state.getDriver();
            executor.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
            int count1 = 0;
            while (!getAttributeValue(by).equals(dateValue) && count1 < 15) {
                Thread.sleep(3000);
                this.state.getDriver().findElement(by).clear();
                Thread.sleep(3000);
                this.state.getDriver().findElement(by).sendKeys(dateValue);
                Thread.sleep(3000);
                count1++;
            }
            return true;
        } catch (Exception e1) {
            return false;
        }
    }


    public boolean absoluteSendKeys(By by, String inputString) throws InterruptedException {
        Thread.sleep(2000);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            WebElement element = this.state.getDriver().findElement(by);
            ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
            Thread.sleep(1000);
            int count1 = 0;
            while (!getAttributeValue(by).equals(inputString) && count1 < 5) {
                Thread.sleep(1000);
                this.state.getDriver().findElement(by).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

//                int len = getAttributeValue(by).length();
//                for(int i=0;i<len;i++){
//                    this.state.getDriver().findElement(by).sendKeys(Keys.BACK_SPACE);
//                }
//                this.state.getDriver().findElement(by).clear();
                this.state.getDriver().findElement(by).sendKeys(inputString);
                count1++;
            }
            return true;
        } catch (Exception e1) {
            int count2 = 0;
            try {
                while (!getAttributeValue(by).equals(inputString) && count2 < 5) {
                    this.state.getDriver().findElement(by).clear();
                    JavascriptExecutor executor = (JavascriptExecutor) this.state.getDriver();
                    executor.executeScript("arguments[0].setAttribute('value', '" + inputString + "')", by);
                    count2++;
                }
                return true;
            } catch (Exception e2) {
                int count3 = 0;
                try {
                    while (!getAttributeValue(by).equals(inputString) && count3 < 5) {
                        this.state.getDriver().findElement(by).clear();
                        char[] inputStringCharArray = inputString.toCharArray();
                        for (int i = 0; i < inputStringCharArray.length; i++) {
                            this.state.getDriver().findElement(by).sendKeys(String.valueOf(inputStringCharArray[i]));
                        }
                        count3++;
                    }
                    return true;
                } catch (Exception e3) {
                    return false;
                }
            }
        }
    }


    public String getAttributeValue(By by) {
        String attributeValue = "";
        try {
            attributeValue = this.state.getDriver().findElement(by).getAttribute("value").toString();
        } catch (Exception e) {
            attributeValue = "";
        }
        return attributeValue;
    }


    public boolean isElementPresent(By locatorKey) {
        try {
            this.state.getDriver().findElement(locatorKey);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
