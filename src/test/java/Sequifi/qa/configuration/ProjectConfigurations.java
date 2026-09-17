package Sequifi.qa.configuration;

import Sequifi.qa.reporting.framework.Logging;

import java.io.*;
import java.util.Properties;

public class ProjectConfigurations {
    private static final String FILE_NOT_FOUND = "There was a File Not Found Exception";
    private static final String CONFIG_ERROR = "There was a Configuration Error";
    private Properties properties;

    public ProjectConfigurations() {
        File curFile = new File("");
        try {
            FileInputStream configurations = new FileInputStream(curFile.getAbsolutePath() + "/src/main/resources/common/configuration.properties");
            Throwable var3 = null;
            try {
                this.properties = new Properties();
                this.properties.load(configurations);
            } catch (Throwable var14) {
                var3 = var14;
                throw var14;
            } finally {
                if (configurations != null) {
                    if (var3 != null) {
                        try {
                            configurations.close();
                        } catch (Throwable var13) {
                            var3.addSuppressed(var13);
                        }
                    } else {
                        configurations.close();
                    }
                }
            }
        } catch (FileNotFoundException var16) {
            Logging.logError("There was a File Not Found Exception" + var16);
        } catch (IOException var17) {
            Logging.logError("There was a Configuration Error" + var17);
        }
    }

    public ProjectConfigurations(String filePath) {
        File curFile = new File("");
        try {
            FileInputStream configurations = new FileInputStream(curFile.getAbsolutePath() + filePath);
            Throwable var4 = null;
            try {
                this.properties = new Properties();
                this.properties.load(configurations);
            } catch (Throwable var15) {
                var4 = var15;
                throw var15;
            } finally {
                if (configurations != null) {
                    if (var4 != null) {
                        try {
                            configurations.close();
                        } catch (Throwable var13) {
                            var4.addSuppressed(var13);
                        }
                    } else {
                        configurations.close();
                    }
                }
            }
        } catch (FileNotFoundException var16) {
            Logging.logError("There was a File Not Found Exception" + var16);
        } catch (IOException var17) {
            Logging.logError("There was a Configuration Error" + var17);
        }
    }

    public String getData(String elementName) {
        return this.properties.getProperty(elementName);
    }

    public void setPropertyAndValue(String property, String value) {
        try {
            this.properties.setProperty(property, value);
            this.properties.store(new FileOutputStream((new File("")).getAbsolutePath() + "/src/main/resources/common/configuration.properties"), "updates");
        } catch (FileNotFoundException var4) {
            Logging.logError("There was a File Not Found Exception" + var4);
        } catch (IOException var5) {
            Logging.logError("There was a Configuration Error" + var5);
        }
    }

}
