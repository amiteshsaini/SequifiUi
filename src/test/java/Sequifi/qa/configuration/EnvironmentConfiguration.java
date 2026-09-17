package Sequifi.qa.configuration;

import java.util.Map;

public class EnvironmentConfiguration {
    private Map<String, String> environments;
    private Map<String, Map<String, String>> databaseConfigs;


    public Map<String, String> getDatabaseConfigs(String name) throws MTPMissingConfigurationException {
        try {
            return (Map) this.databaseConfigs.get(name);
        } catch (NullPointerException var3) {
            throw new MTPMissingConfigurationException("No database configuration for " + name + " found database configurations. Check your environments.yml");
        }
    }

    public String getEnvironment(String name) throws MTPMissingConfigurationException {
        try {
            return (String) this.environments.get(name);
        } catch (NullPointerException var3) {
            throw new MTPMissingConfigurationException("No environment configuration for " + name + " found environments configurations. Check your environments.yml");
        }
    }
}
