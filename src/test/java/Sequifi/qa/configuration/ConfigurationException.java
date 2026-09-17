package Sequifi.qa.configuration;

import Sequifi.qa.exceptions.MTPException;

public class ConfigurationException extends MTPException {
    private static final long serialVersionUID = 112013916210757400L;

    public ConfigurationException() {
    }

    public ConfigurationException(String message) {
        super(message);
    }
}
