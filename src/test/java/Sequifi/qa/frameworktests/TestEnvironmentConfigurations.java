package Sequifi.qa.frameworktests;

import Sequifi.qa.configuration.CheckConfigurationSettings;
import Sequifi.qa.configuration.ConfigurationException;
import Sequifi.qa.configuration.EnvironmentConfiguration;
import Sequifi.qa.databaseframework.basetests.DatabaseConfiguration;
import Sequifi.qa.reporting.framework.Logging;

import java.net.URI;
import java.util.Map;


public class TestEnvironmentConfigurations {
    public TestEnvironmentConfigurations() {
        throw new IllegalStateException("utility class");
    }

    public static String getTestURL(String environment) throws ConfigurationException {
        try {
            String environmentURL = CheckConfigurationSettings.getPropertyValue("environmentURL");
            if (environmentURL != null) {
                String logMessage = "Using environmentURL for test url as " + environmentURL;
                Logging.logInfo(logMessage);
                return environmentURL;
            } else {
                EnvironmentConfiguration config = new EnvironmentConfiguration();
                return config.getEnvironment(environment);
            }
        } catch (Exception var3) {
            Logging.logError("Badly Formatted environments.yml file ", var3);
            throw new ConfigurationException("environments.yml file formatting Error: " + var3.getMessage());
        }
//        catch (IOException var4) {
//            Logging.logError("File bad or not found: ", var4);
//            throw new ConfigurationException("File bad or not found: " + var4.getMessage());
//        }
    }

    public static DatabaseConfiguration getTestDBURL(String environment) throws ConfigurationException {
        try {
            EnvironmentConfiguration config = new EnvironmentConfiguration();
            Map<String, String> dbCfg = config.getDatabaseConfigs(environment);
            return buildDatabaseConfiguration((String) dbCfg.get("connection"), (String) dbCfg.get("user"), (String) dbCfg.get("password"));
        } catch (Exception var3) {
            Logging.logError("Test Database ENVIRONMENT NOT FOUND", var3);
            throw new ConfigurationException("Test Database ENVIRONMENT NOT FOUND" + var3.getMessage());
        }
    }

    public static DatabaseConfiguration buildDatabaseConfiguration(String connection, String username, String password) throws ConfigurationException {
        try {
            if (connection != null && !connection.isEmpty()) {
                if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
                    if (connection.startsWith("mongodb")) {
                        URI connectionString = new URI(connection);
                        return new DatabaseConfiguration(username, password, connectionString.getHost(), Integer.toString(connectionString.getPort()));
                    }
                    return new DatabaseConfiguration(connection, username, password);
                }
                if ((username == null || username.isEmpty()) ^ (password == null || password.isEmpty())) {
                    throw new ConfigurationException("must set both username and password");
                }
                return new DatabaseConfiguration(connection);
            }
        } catch (Exception var4) {
            Logging.logWarning(var4.getMessage());
            throw new ConfigurationException("Error occured when trying to build the database configuration: ".concat(var4.getLocalizedMessage()));
        }
        throw new ConfigurationException("Unexpected parameters were passed to the database builder.");
    }
}
