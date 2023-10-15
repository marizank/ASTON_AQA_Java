package by.mts;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class Lesson13 {
    public ChromeDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("test start");
    }
    @Test
    public void findElement() {
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebElement input = driver.findElement(By.xpath("//section/div/h2"));
        if (input.isDisplayed()) {
            System.out.println("Title in section are present");
        } else {
            System.out.println("Title in section aren't present");
        }
    }
    @Test
    public void findLogos() {
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement cardVisa=driver.findElement(By.xpath("//img[@alt='Visa']"));
        WebElement cardVerifiedByVisa=driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));
        WebElement cardMasterCard=driver.findElement(By.xpath("//img[@alt='MasterCard']"));
        WebElement cardMasterCardSecureCode=driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        WebElement cardBelCard=driver.findElement(By.xpath("//img[@alt='Белкарт']"));
        WebElement cardMir=driver.findElement(By.xpath("//img[@alt='МИР']"));
        if (cardVisa.isDisplayed() && cardVerifiedByVisa.isDisplayed() && cardMasterCard.isDisplayed() && cardMasterCardSecureCode.isDisplayed()&& cardBelCard.isDisplayed()&& cardMir.isDisplayed()) {
            System.out.println("All logos are present");
        } else {
            System.out.println("All logos aren't present");
        }
    }
    @Test
    public void checkLinkMoreDetail() {
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebElement searchLinkDetail= driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        //searchLinkDetail.equals(searchLinkDetail);
        searchLinkDetail.click();
        String expectedUrl = "https://www.mts.by/help/replenishment/online-replenishment/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }
    @Test
    public void checkFillingOutFormAndButtonContinue(){
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement phoneNumber=driver.findElement(By.id("connection-phone"));
        phoneNumber.sendKeys("297777777");
        WebElement sum=driver.findElement(By.id("connection-sum"));
        sum.click();
        sum.sendKeys("10");
        WebElement email=driver.findElement(By.id("connection-email"));
        email.sendKeys("qwerty@gmail.com");
        WebElement buttonCont=driver.findElement(By.xpath("//button[text()='Продолжить']"));
        buttonCont.click();
    }
    @After
    public void close(){
        System.out.println("test close");
        driver.quit();
    }
}
