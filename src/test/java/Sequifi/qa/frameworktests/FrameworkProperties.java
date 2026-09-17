package Sequifi.qa.frameworktests;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.TreeMap;

public class FrameworkProperties {
    static String runDate = (new SimpleDateFormat("yyyyMMdd")).format(new Date());
    static Properties props = new Properties();

    static {
        String propPath = System.getProperty("frameworkprop");
        if (propPath != null) {
            initializeProperties(propPath);
        } else {
            initializeProperties("framework.properties");
        }

    }

    public FrameworkProperties() {
    }

    public static boolean initializeProperties(String resource) {
        try {
            System.out.println("Initializing Framework Properties file from: " + resource);
            (new FrameworkProperties()).loadProperties(resource);
            return true;
        } catch (IOException var2) {
            System.out.println("ERROR: Unable to load properties from " + resource);
            return false;
        }
    }

    public static int getImplicitWait() {
        String implicitWait = getProperty("implicitWait");
        return implicitWait == null ? 10 : Integer.parseInt(implicitWait);
    }

    public static String getProperty(String key) {
        return props.getProperty(key);
    }

    public static String getEnvironment() {
        String environment = getProperty("environment");
        return environment;
    }

    public static String getChromeDriverPath() {
        String environment = getProperty("chromeDriverPath");
        return environment;
    }

    public static String getProjectName() {
        String project = getProperty("project");
        return project;
    }

    public static String getResultsPath() {
        String testresult = getProperty("testresult");
        return testresult;
    }

    public static String getScreenshotPath() {
        String screenshotPath = getProperty("screenshotPath");
        return screenshotPath;
    }

    public static boolean IsTakeScreenshots() {
        String takeScreenshots = getProperty("takeScreenshots");
        return Boolean.parseBoolean(takeScreenshots);
    }

    public static boolean getBooleanProperty(String key) {
        return Boolean.valueOf(getProperty(key));
    }

    public static int getIntProperty(String key) {
        return Integer.valueOf(getProperty(key));
    }

    private TreeMap<String, String> getProperties() {
        TreeMap<String, String> map = new TreeMap();
        Iterator var2 = props.stringPropertyNames().iterator();

        while (var2.hasNext()) {
            String key = (String) var2.next();
            map.put(key, getProperty(key));
        }

        return map;
    }

    private void loadProperties(String resource) throws IOException {
        ClassLoader loader = this.getClass().getClassLoader();
        InputStream in = loader.getResourceAsStream(resource);
        if (null == in) {
            in = new FileInputStream(resource);
        }

        (new StringBuilder()).append("Loading properties: ").append(resource.toLowerCase()).toString();
        boolean isFramework = resource.equals("framework");
        TreeMap var5 = this.getProperties();

        try {
            props.load((InputStream) in);
        } catch (Exception var8) {
            String msg = "Unable to load " + resource.toLowerCase() + ".properties; check Properties interface.";
            System.err.println("[ERROR]: " + msg);
            throw new IllegalStateException(msg);
        }

        TreeMap<String, String> after = this.getProperties();
    }
}

