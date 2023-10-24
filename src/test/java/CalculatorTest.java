import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    AndroidDriver<AndroidElement> driver = null;
    public void initialize() {
    DesiredCapabilities capabilities = new
            DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2 API 30");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.calculator");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.calculator");
    capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
    try {
        driver = new AndroidDriver<>(new
                URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20,
                TimeUnit.SECONDS);
    } catch (MalformedURLException e) {
        System.out.println(e.getMessage());
    }
    }
    @Test
    public void checkCalculatePlus() {
        initialize();
        driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        assertEquals("14",driver.findElement(By.AndroidUIAutomator("new UiSelector().packageName(\"com.google.android.calculator\").resourceId(\"com.google.android.calculator:id/eq\")")));
    }
    @Test
    public void checkCalculateMinus() {
        initialize();
        driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        assertEquals("2",driver.findElement(By.AndroidUIAutomator("new UiSelector().packageName(\"com.google.android.calculator\").resourceId(\"com.google.android.calculator:id/eq\")")));
    }
    @Test
    public void checkCalculateMultiply() {
        initialize();
        driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        assertEquals("48",driver.findElement(By.AndroidUIAutomator("new UiSelector().packageName(\"com.google.android.calculator\").resourceId(\"com.google.android.calculator:id/eq\")")));
    }
    @Test
    public void checkCalculateDivide() {
        initialize();
        driver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_div")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        assertEquals("1",driver.findElement(By.AndroidUIAutomator("new UiSelector().packageName(\"com.google.android.calculator\").resourceId(\"com.google.android.calculator:id/eq\")")));
    }
}
