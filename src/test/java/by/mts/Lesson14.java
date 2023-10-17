package by.mts;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Lesson14 {
    public ChromeDriver driver;
    @Before
    public void setUp() {
        System.setProperty("driver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        System.out.println("test start");
    }
    @Test
    public void checkPhoneServices() {
        driver.get("https://www.mts.by/");
        WebElement phoneNumber2 = driver.findElement(By.id("connection-phone"));
        WebElement sum2 = driver.findElement(By.id("connection-sum"));
        WebElement email2 = driver.findElement(By.id("connection-email"));
        String placeholderPhone2 = phoneNumber2.getAttribute("placeholder");
        String placeholderSum2 = sum2.getAttribute("placeholder");
        String placeholderEmail2 = email2.getAttribute("placeholder");
        if (placeholderPhone2.equals("Номер телефона") && placeholderSum2.equals("Сумма") && placeholderEmail2.equals("E-mail для отправки чека")) {
            System.out.println("The placeholder attribute PhoneServices  is set");
        } else {
            System.out.println("The placeholder attribute PhoneServices  isn't set");
        }
    }
    @Test
    public void checkHomeInternet() {
        driver.get("https://www.mts.by/");
        WebElement phoneNumber1 = driver.findElement(By.id("internet-phone"));
        WebElement sum1 = driver.findElement(By.id("internet-sum"));
        WebElement email1 = driver.findElement(By.id("internet-email"));
        String placeholderPhone1 = phoneNumber1.getAttribute("placeholder");
        String placeholderSum1 = sum1.getAttribute("placeholder");
        String placeholderEmail1 = email1.getAttribute("placeholder");
        if (placeholderPhone1.equals("Номер абонента") && placeholderSum1.equals("Сумма") && placeholderEmail1.equals("E-mail для отправки чека")) {
            System.out.println("The placeholder attribute HomeInternet  is set");
        } else {
            System.out.println("The placeholder attribute HomeInternet  isn't set");
        }
    }
    @Test
    public void checkDebt(){
        driver.get("https://www.mts.by/");
        WebElement accountNumber = driver.findElement(By.id("score-arrears"));
        WebElement sum3 = driver.findElement(By.id("arrears-sum"));
        WebElement email3 = driver.findElement(By.id("arrears-email"));
        String placeholderAccountNumber = accountNumber.getAttribute("placeholder");
        String placeholderSum3 = sum3.getAttribute("placeholder");
        String placeholderEmail3 = email3.getAttribute("placeholder");
        if (placeholderAccountNumber.equals("Номер счета на 2073") && placeholderSum3.equals("Сумма") && placeholderEmail3.equals("E-mail для отправки чека")) {
            System.out.println("The placeholder attribute Dept  is set");
        } else {
            System.out.println("The placeholder attribute Dept isn't set");
        }
    }
    @Test
    public void checkInstallment(){
        driver.get("https://www.mts.by/");
        WebElement accountInstalment = driver.findElement(By.id("score-instalment"));
        WebElement sum3 = driver.findElement(By.id("instalment-sum"));
        WebElement email3 = driver.findElement(By.id("instalment-email"));
        String placeholderAccountInstalment = accountInstalment.getAttribute("placeholder");
        String placeholderSum3 = sum3.getAttribute("placeholder");
        String placeholderEmail3 = email3.getAttribute("placeholder");
        if (placeholderAccountInstalment.equals("Номер счета на 44") && placeholderSum3.equals("Сумма") && placeholderEmail3.equals("E-mail для отправки чека")) {
            System.out.println("The placeholder attribute Dept  is set");
        } else {
            System.out.println("The placeholder attribute Dept isn't set");
        }
    }
    @Test
    public void checkCorrectnessAmount() {
        driver.get("https://www.mts.by/");
        WebElement number=driver.findElement(By.xpath("//button[@class=\"select__header\"]"));
        WebElement phoneNumber = driver.findElement(By.id("connection-phone"));
        WebElement sum = driver.findElement(By.id("connection-sum"));
        WebElement email = driver.findElement(By.id("connection-email"));
        WebElement buttonCont = driver.findElement(By.xpath("//button[text()='Продолжить']"));
        Actions builder = new Actions(driver);
        builder
                .moveToElement(number)
                .click()
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
        if (paymentAmount.getText().equals("12.00 BYN")) {
            System.out.println("Сумма оплаты корректна");
        } else {
            System.out.println("Сумма оплаты некорректна");
        }
        WebElement paymentPhone = driver.findElement(By.xpath("//p[@class='header__payment-info']"));
        if (paymentPhone.getText().equals("Оплата: Услуги связи Номер:375297777777")) {
            System.out.println("Номер телефона корректен");
        } else {
            System.out.println("Номер телефона некорректен");
        }
    }
    @Test
    public void checkCorrectnessInscription() {
        driver.get("https://www.mts.by/");

        WebElement cardNumber = driver.findElement(By.id("cc-number"));
        if (cardNumber.getAttribute("placeholder").equals("Номер карты")) {
            System.out.println("Надпись 'Номер карты' найдена в поле ввода номера карты");
        } else {
            System.out.println("Надпись 'Номер карты' не найдена в поле ввода номера карты");
        }
        WebElement cardHolderName = driver.findElement(By.id("card-holder-name"));
        if (cardHolderName.getAttribute("placeholder").equals("Имя и фамилия держателя")) {
            System.out.println("Надпись 'Имя и фамилия держателя' найдена в поле ввода имени и фамилии держателя карты");
        } else {
            System.out.println("Надпись 'Имя и фамилия держателя' не найдена в поле ввода имени и фамилии держателя карты");
        }
        WebElement cardExpirationDate = driver.findElement(By.id("card-expiration-date"));
        if (cardExpirationDate.getAttribute("placeholder").equals("MM / YY")) {
            System.out.println("Надпись 'MM/YY' найдена в поле ввода срока действия карты");
        } else {
            System.out.println("Надпись 'MM/YY' не найдена в поле ввода срока действия карты");
        }
        WebElement cardCvv = driver.findElement(By.id("card-cvv"));
        if (cardCvv.getAttribute("placeholder").equals("CVV2/CVC2")) {
            System.out.println("Надпись 'CVV2/CVC2' найдена в поле ввода CVV2/CVC2");
        } else {
            System.out.println("Надпись 'CVV2/CVC2' не найдена в поле ввода CVV2/CVC2");
        }
    }
    @Test
    public void checkIconsOfPaymentSystem() {
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement fr = driver.findElement(By.name("jsassets-a1"));
        driver.switchTo().frame(fr);

        WebElement visaIcon = driver.findElement(By.id("yandexpay-button-1"));
        if (visaIcon.isDisplayed()) {
            System.out.println("Yandexpay отображается");
        } else {
            System.out.println("Yandexpay не отображается");
        }
        WebElement mastercardIcon = driver.findElement(By.xpath("//button[@aria-label='Google Pay']"));
        if (mastercardIcon.isDisplayed()) {
            System.out.println("Google Pay отображается");
        } else {
            System.out.println("Google Pay не отображается");
        }
    }
    @After
    public void close() {
        System.out.println("test close");
        driver.quit();
    }
}
