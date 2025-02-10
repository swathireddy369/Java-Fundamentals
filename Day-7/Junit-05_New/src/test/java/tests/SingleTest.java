package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runners.WebDriverTest;
import utils.MarkSessionStatus;

import java.time.Duration;

public class SingleTest {

    @WebDriverTest
    void singleTest(WebDriver driver) {
        MarkSessionStatus sessionStatus = new MarkSessionStatus(driver);

        try {
            driver.get("https://bstackdemo.com/");
            final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.titleIs("StackDemo"));
            String product_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='1']/p"))).getText();
            WebElement cart_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='1']/div[4]")));
            cart_btn.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".float\\-cart__content")));
            final String product_in_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__next']/div/div/div[2]/div[2]/div[2]/div/div[3]/p[1]"))).getText();
            if (product_name.equals(product_in_cart)) {
                sessionStatus.markTestStatus("passed", "Product has been successfully added to the cart!");
            } else {
                sessionStatus.markTestStatus("failed", "There was some issue!");
            }
        } catch (Exception e) {
            sessionStatus.markTestStatus("failed", "There was some issue!");
            System.out.println("Exception: " + e.getMessage());
        }
        driver.quit();
    }
}
