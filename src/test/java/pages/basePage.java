package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class basePage {

    protected WebDriver driver;

    public basePage(WebDriver driver) {
        this.driver = driver;
        Actions actions = new Actions(driver);
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void hover_with_by_locator(By locator, String name) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).perform();
        System.out.println("➡ Hovered on: " + name);
    }

    protected void hover_with_web_element(WebElement element, String name) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        System.out.println("➡ Hovered on: " + name);
    }

    public void scroll_into_view(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




    protected void fill_text(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    protected void wait_for_seconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String get_element_text(By locator) {
        return driver.findElement(locator).getText();
    }


}
