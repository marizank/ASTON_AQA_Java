import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {
    @FindBy(xpath = "//input[@id='searchInput']")
    private WebElement searchInput;
    @FindBy(xpath = "//button[@id='searchButton']")
    private WebElement searchButton;
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        System.setProperty("driver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://www.wildberries.ru/");
        System.out.println("test start");
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void searchItem(String itemName) {
        searchInput.clear();
        searchInput.sendKeys(itemName);
        searchButton.click();
    }
}
