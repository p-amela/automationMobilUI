package devices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class AndroidCloud implements IDevices{

    String user="ADD_YOUR_USER";
    String key ="ADD_YOUR_KEY";
    @Override
    public AppiumDriver create() {
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability("appium:deviceName","Copy_of_RealmeV");
        config.setCapability("appium:platformVersion","9.0");
        config.setCapability("appium:app","ADD_YOUR_ID");
        AndroidDriver driver = null;
        try {
            driver = new AndroidDriver(new URL("https://"+user+":"+key+"@hub.browserstack.com/wd/hub"),config);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }
}
