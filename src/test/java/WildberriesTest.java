import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WildberriesTest {
    private WebDriver driver;
    private HomePage homePage;
    private CartPage cartPage;

    @BeforeEach
    public void setUp() {
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
    }
    @Test
    public void verifyCartItems() {
        List<String> items = Arrays.asList("ETTA High Tech Наушники беспроводные Air 2 для iPhone и Android", "Yandex Яндекс Станция 2 Антрацит", "Xiaomi Ручка гелевая чёрная в школу Mi Jumbo Gel Ink Pen 10 шт."); // Замените на актуальные названия товаров
        for (String item : items) {
            homePage.searchItem(item);
        }
        List<String> actualCartItems = cartPage.getCartItems();
        Assertions.assertEquals(items, actualCartItems);
        List<String> expectedPrices = Arrays.asList("1 045 ₽", "12 441 ₽", "244 ₽");
        List<String> expectedQuantities = Arrays.asList("1", "1", "1");
        List<String> actualPrices = cartPage.getItemPrices();
        List<String> actualQuantities = cartPage.getItemQuantities();
        Assertions.assertEquals(expectedPrices, actualPrices);
        Assertions.assertEquals(expectedQuantities, actualQuantities);
        String expectedTotalCost = "13 730 ₽";
        String actualTotalCost = cartPage.getTotalCost();
        Assertions.assertEquals(expectedTotalCost, actualTotalCost);
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}