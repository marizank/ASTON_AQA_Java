package by.mts;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
public class Lesson14 {
    public ChromeDriver driver;
    @BeforeEach
    public void setUp() {
        System.setProperty("driver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        System.out.println("test start");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }
    @Test
    public void checkPhoneServices() {
        WebElement phoneNumber2 = driver.findElement(By.id("connection-phone"));
        WebElement sum2 = driver.findElement(By.id("connection-sum"));
        WebElement email2 = driver.findElement(By.id("connection-email"));
        String placeholderPhone2 = phoneNumber2.getAttribute("placeholder");
        String placeholderSum2 = sum2.getAttribute("placeholder");
        String placeholderEmail2 = email2.getAttribute("placeholder");
        assert placeholderPhone2.equals("Номер телефона");
        assert placeholderSum2.equals("Сумма");
        assert placeholderEmail2.equals("E-mail для отправки чека");
    }
    @Test
    public void checkHomeInternet() {
        WebElement phoneNumber1 = driver.findElement(By.id("internet-phone"));
        WebElement sum1 = driver.findElement(By.id("internet-sum"));
        WebElement email1 = driver.findElement(By.id("internet-email"));
        String placeholderPhone1 = phoneNumber1.getAttribute("placeholder");
        String placeholderSum1 = sum1.getAttribute("placeholder");
        String placeholderEmail1 = email1.getAttribute("placeholder");
        assert placeholderPhone1.equals("Номер абонента");
        assert placeholderSum1.equals("Сумма");
        assert placeholderEmail1.equals("E-mail для отправки чека");
    }
    @Test
    public void checkDebt(){
        WebElement accountNumber = driver.findElement(By.id("score-arrears"));
        WebElement sum3 = driver.findElement(By.id("arrears-sum"));
        WebElement email3 = driver.findElement(By.id("arrears-email"));
        String placeholderAccountNumber = accountNumber.getAttribute("placeholder");
        String placeholderSum3 = sum3.getAttribute("placeholder");
        String placeholderEmail3 = email3.getAttribute("placeholder");
        /*if (placeholderAccountNumber.equals("Номер счета на 2073") && placeholderSum3.equals("Сумма") && placeholderEmail3.equals("E-mail для отправки чека")) {
            System.out.println("The placeholder attribute Dept  is set");
        } else {
            System.out.println("The placeholder attribute Dept isn't set");
        }*/
        assert placeholderAccountNumber.equals("Номер счета на 2073");
        assert placeholderSum3.equals("Сумма");
        assert placeholderEmail3.equals("E-mail для отправки чека");
    }
    @Test
    public void checkInstallment(){
        WebElement accountInstalment = driver.findElement(By.id("score-instalment"));
        WebElement sum3 = driver.findElement(By.id("instalment-sum"));
        WebElement email3 = driver.findElement(By.id("instalment-email"));
        String placeholderAccountInstalment = accountInstalment.getAttribute("placeholder");
        String placeholderSum3 = sum3.getAttribute("placeholder");
        String placeholderEmail3 = email3.getAttribute("placeholder");
        assert placeholderAccountInstalment.equals("Номер счета на 44");
        assert placeholderSum3.equals("Сумма");
        assert placeholderEmail3.equals("E-mail для отправки чека");
    }
    @Test
    public void checkCorrectnessAmount() {
        WebElement phoneNumber = driver.findElement(By.id("connection-phone"));
        WebElement sum = driver.findElement(By.id("connection-sum"));
        WebElement email = driver.findElement(By.id("connection-email"));
        WebElement buttonCont = driver.findElement(By.xpath("//button[text()='Продолжить']"));
        Actions builder = new Actions(driver);
        builder
                .moveToElement(phoneNumber)
                .click()
                .sendKeys("297777777")
                .moveToElement(sum)
                .click()
                .sendKeys("12")
                .moveToElement(email)
                .click()
                .sendKeys("qwerty@gmail.com")
                .moveToElement(buttonCont)
                .click()
                .build()
                .perform();
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(frame);
        WebElement paymentAmount = driver.findElement(By.xpath("//p[@class='header__payment-amount']"));
        Assertions.assertEquals(paymentAmount.getText(), "12.00 BYN", "Сумма оплаты некорректна");
        WebElement paymentPhone = driver.findElement(By.xpath("//p[@class='header__payment-info']"));
        Assertions.assertEquals(paymentPhone.getText(), "Оплата: Услуги связи Номер:375297777777", "Номер телефона некорректен");
        WebElement visaIcon = driver.findElement(By.id("yandexpay-button-1"));
        assert visaIcon.isDisplayed();
        WebElement mastercardIcon = driver.findElement(By.xpath("//button[@aria-label='Google Pay']"));
        assert mastercardIcon.isDisplayed();
    }
    @Test
    public void checkCorrectnessInscription() {
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(frame);
        WebElement mastercardIcon = driver.findElement(By.xpath("//button[@aria-label='Google Pay']"));
        assert mastercardIcon.isDisplayed();
        WebElement cardNumber = driver.findElement(By.id("cc-number"));
        String equalCardNumber = cardNumber.getAttribute("label");
        assert equalCardNumber.equals("Номер карты");
        WebElement cardHolderName = driver.findElement(By.id("card-holder-name"));
        String equalCardHolderName = cardHolderName.getAttribute("label");
        assert equalCardHolderName.equals("Имя держателя (как на карте)");
        WebElement cardExpirationDate = driver.findElement(By.id("card-expiration-date"));
        String equalCardExpirationDate = cardExpirationDate.getAttribute("label");
        assert equalCardExpirationDate.equals("Срок действия");
        WebElement cardCvv = driver.findElement(By.id("card-cvv"));
        String equalCardCvv = cardCvv.getAttribute("label");
        assert equalCardCvv.equals("CVC");
    }
    @AfterEach
    public void close() {
        System.out.println("test close");
        driver.quit();
    }
}
