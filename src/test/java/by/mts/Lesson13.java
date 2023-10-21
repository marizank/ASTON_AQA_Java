package by.mts;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Lesson13 {
    public ChromeDriver driver;
    @BeforeEach
    public void setUp() {
        System.setProperty("driver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();
        System.out.println("test start");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void findElement() {
        WebElement element = driver.findElement(By.xpath("//section/div/h2"));
        assertNotNull(element);
    }
    @Test
    public void findLogos() {
        WebElement cardVisa = driver.findElement(By.xpath("//img[@alt='Visa']"));
        WebElement cardVerifiedByVisa = driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));
        WebElement cardMasterCard = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
        WebElement cardMasterCardSecureCode = driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        WebElement cardBelCard = driver.findElement(By.xpath("//img[@alt='Белкарт']"));
        WebElement cardMir = driver.findElement(By.xpath("//img[@alt='МИР']"));
       /* if (cardVisa.isDisplayed() && cardVerifiedByVisa.isDisplayed() && cardMasterCard.isDisplayed() && cardMasterCardSecureCode.isDisplayed()&& cardBelCard.isDisplayed()&& cardMir.isDisplayed()) {
            System.out.println("All logos are present");
        } else {
            System.out.println("All logos aren't present");
        }*/
        assert cardVisa.isDisplayed();
        assert cardVerifiedByVisa.isDisplayed();
        assert cardMasterCard.isDisplayed();
        assert cardMasterCardSecureCode.isDisplayed();
        assert cardBelCard.isDisplayed();
        assert cardMir.isDisplayed();
    }
    @Test
    public void checkLinkMoreDetail() {
        driver.get("https://www.mts.by/");
        WebElement searchLinkDetail= driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        assertNotNull(searchLinkDetail);
    }
    @Test
    public void checkFillingOutFormAndButtonContinue(){
        driver.get("https://www.mts.by/");
        WebElement phoneNumber=driver.findElement(By.id("connection-phone"));
        phoneNumber.sendKeys("297777777");
        WebElement sum=driver.findElement(By.id("connection-sum"));
        sum.click();
        sum.sendKeys("10");
        WebElement email=driver.findElement(By.id("connection-email"));
        email.sendKeys("qwerty@gmail.com");
        WebElement buttonCont=driver.findElement(By.xpath("//button[text()='Продолжить']"));
        buttonCont.click();
        assert phoneNumber.isDisplayed();
        assert sum.isDisplayed();
        assert email.isDisplayed();
        assert buttonCont.isDisplayed();
    }
    @AfterEach
    public void clos(){
        System.out.println("test close");
        driver.quit();
    }
}
