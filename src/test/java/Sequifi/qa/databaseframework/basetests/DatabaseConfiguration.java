package Sequifi.qa.databaseframework.basetests;

import Sequifi.qa.exceptions.MTPException;
import Sequifi.qa.utilities.Decrypt;

public class DatabaseConfiguration {

    private boolean OSAuth;
    private String url;
    private String username;
    private String password;
    private String hostname;
    private String port;

    public DatabaseConfiguration(String url) {
        this.setOSAuth(true);
        this.url = url + ";integratedSecurity=true;";
    }

    public DatabaseConfiguration(String url, String username, String password) throws MTPException {
        this.setOSAuth(false);
        this.url = url;
        this.username = username;
        this.password = Decrypt.decryptText(password);
    }

    public DatabaseConfiguration(String username, String password, String hostname, String port) throws MTPException {
        this.setOSAuth(false);
        this.username = username;
        this.password = Decrypt.decryptText(password);
        this.hostname = hostname;
        this.port = port;
    }

    public DatabaseConfiguration(String hostname, String port) throws MTPException {
        this.setOSAuth(false);
        this.hostname = hostname;
        this.port = port;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isOSAuth() {
        return this.OSAuth;
    }

    public void setOSAuth(boolean oSAuth) {
        this.OSAuth = oSAuth;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getHostname() {
        return this.hostname;
    }

    public String getPort() {
        return this.port;
    }


}
