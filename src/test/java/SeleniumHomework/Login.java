package SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login extends MaineDriver{

    @Test
    public void loginTest() {

        WebElement usernameField = driver.findElement(By.cssSelector("[type=text]"));
        WebElement passwordField = driver.findElement(By.cssSelector("[type=password]"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.cssSelector("[type=submit]"));
        loginButton.click();

        WebElement tshirtLink = driver.findElement(By.partialLinkText("T-Shirt"));
        //WebElement tshirtLink = driver.findElement(By.cssSelector("a#item_1_title_link"));
        tshirtLink.click();

        WebElement addToCartButton = driver.findElement(By.cssSelector("[name=add-to-cart-sauce-labs-bolt-t-shirt]"));
        addToCartButton.click();


        WebElement shoppingCartLink= driver.findElement(By.cssSelector(".shopping_cart_link"));
        shoppingCartLink.click();

        WebElement shoppingCartCheckout= driver.findElement(By.cssSelector("#checkout"));
        shoppingCartCheckout.click();


        WebElement firstNameField = driver.findElement(By.cssSelector("#first-name"));
        WebElement lastNameField = driver.findElement(By.cssSelector("#last-name"));
        WebElement postalCode = driver.findElement(By.cssSelector("#postal-code"));

        firstNameField.sendKeys("Kiril");
        lastNameField.sendKeys("Angelov");
        postalCode.sendKeys("9000");

        WebElement buttonContinue = driver.findElement(By.cssSelector("[type=submit]"));
        buttonContinue.click();

        WebElement buttonFinish = driver.findElement(By.cssSelector("#finish"));
        buttonFinish.click();
    }
}
