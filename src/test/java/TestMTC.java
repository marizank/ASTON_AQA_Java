import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMTC{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "G:\\MTC_Lesson_13\\MTC\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement input=driver.findElement(By.xpath("//div[@class='pay__wrapper']"));
        input.click();
    }


    //Проверить название указанного блока;

}
