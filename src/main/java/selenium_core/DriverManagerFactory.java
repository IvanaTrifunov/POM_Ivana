package selenium_core;

public class DriverManagerFactory {
    public DriverManagerFactory(){

    }
    public static DriverManager getDriverManager (DriverType type){
        Object driverManager;
        switch (type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            case SAFARI:
                driverManager = new SafariDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
        }
        return (DriverManager)driverManager;
    }
}
