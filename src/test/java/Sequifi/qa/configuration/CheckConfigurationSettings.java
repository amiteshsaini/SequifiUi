package Sequifi.qa.configuration;

import Sequifi.qa.reporting.framework.Logging;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class CheckConfigurationSettings {
    private static final String SYSTEM_PROPERTY = "System property '";
    private static final String CONFIGURATION_PROPERTY = "Configuration property '";
    private static final String MISSING_IN_GRADLE_TEST_TASK = "' is missing in your Gradle Test Task.";
    private static final String MISSING_IN_CONFIG_PROPERTY = "' is missing in your configuration.properties file.";

    private CheckConfigurationSettings() {
        throw new IllegalStateException("CheckConfigurationSettings class");
    }

    public static String getPropertyValue(String property) {
        try {
            String configPropertyValue = getProjectConfigurations().getData(property);
            if (!configPropertyValue.isEmpty()) {
                return configPropertyValue;
            }
        } catch (NullPointerException var2) {
            Logging.logWarning("Configuration property '" + property + "' is missing in your configuration.properties file." + var2.getLocalizedMessage());
        }
        return null;
    }

    public static String getEmailTo() {
        String emailTo = "";
        emailTo = System.getProperty("emailTo", "defaultEmailTo");
        if (emailTo.equals("defaultEmailTo")) {
            emailTo = "NoEmailTo";
        }
        return emailTo;
    }

    public static String getEnvironmentPropertyValue(String property) {
        String environment = "";
        environment = System.getProperty("environment", "defaultEnvironment");
        if (environment.equals("defaultEnvironment")) {
            environment = CheckConfigurationSettings.getPropertyValue("environment");
        }
        String filepath = "/src/main/resources/common/" + environment + ".properties";
        try {
            String configPropertyValue = getProjectConfigurations(filepath).getData(property);
            if (!configPropertyValue.isEmpty()) {
                return configPropertyValue;
            }
        } catch (NullPointerException var2) {
            Logging.logWarning("Configuration property '" + property + "' is missing in your configuration.properties file." + var2.getLocalizedMessage());
        }
        return null;
    }

    public static ProjectConfigurations getProjectConfigurations() {
        return new ProjectConfigurations();
    }

    public static ProjectConfigurations getProjectConfigurations(String filepath) {
        return new ProjectConfigurations(filepath);
    }

}
