import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class CartPage {
    private WebDriver driver;
    @FindBy(xpath = "//div[@class='name']")
    private List<WebElement> cartItems;
    @FindBy(xpath = "//span[@class='price']")
    private List<WebElement> itemPrices;
    @FindBy(xpath = "//span[@class='count']")
    private List<WebElement> itemQuantities;
    @FindBy(xpath = "//span[@class='final-cost']")
    private WebElement totalCost;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public List<String> getCartItems() {
        return cartItems.stream().map(WebElement::getText).collect(Collectors.toList());
    }
    public List<String> getItemPrices() {
        return itemPrices.stream().map(WebElement::getText).collect(Collectors.toList());
    }
    public List<String> getItemQuantities() {
        return itemQuantities.stream().map(WebElement::getText).collect(Collectors.toList());
    }
    public String getTotalCost() {
        return totalCost.getText();
    }
}


