package Sequifi.qa.cucumber.state;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class TestState {
    private Map<String, By> page;
    private WebDriver driver;
    private int timeout = 30;
    private Map<String, Object> scenarioContext;

    public TestState() {
        scenarioContext = new HashMap<>();
    }

    public void setContext(String key, Object value) {
        scenarioContext.put(key.toString(), value);
    }

    public Object getContext(String key) {
        return scenarioContext.get(key.toString());
    }

    public Boolean isContains(String key) {
        return scenarioContext.containsKey(key.toString());
    }

    public Map<String, By> getPage() {
        return this.page;
    }

    public void setPage(Map<String, By> page) {
        this.page = page;
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
