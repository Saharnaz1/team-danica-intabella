package com.danica_intabella.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

         /*
        Making our 'driver' instance private so that it is not reachable from outside of any class.
        We make it static because we want it to run before anything else,
        also we will use it in static method
         */

    public static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    // Create reusable utility method which will return same driver instance when we call it.

    public static WebDriver getDriver(){

        if (driverPool.get() == null) {  // if driver/browser was never opened

            String browserType = ConfigurationReader.getProperty("browser");

            // Depending on the browserType returned from the configuration.properties our switch statement will determine the "case", an open the matching browser

            switch (browserType) {
                case "chrome":
                    //    WebDriverManager.chromedriver().setup(); We no longer need this with new update
                    driverPool.set( new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    //    WebDriverManager.firefoxdriver().setup();  We no longer need this with new update
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "headless-chrome":
                    ChromeOptions option = new ChromeOptions();
                    option.addArguments("--headless=new");
                    driverPool.set(new ChromeDriver(option));
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
            }
        }

        //   Same driver instance will be returned every time we call Driver.getDriver() method
        return driverPool.get();

    }
    //      Create a new Driver.closeDriver(); it will use.quit() method to quit browsers and then set the driver value back to null
    public static void closeDriver(){
        if (driverPool.get()!=null){
            driverPool.get().quit(); // this line will terminate the currently existing driver completely. It will not exist going forward
            driverPool.remove(); // we assign the value back to "null" so that my "singleton" can create a newer one if needed.
        }
    }






}
