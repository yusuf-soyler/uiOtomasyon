package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class generalAssertionHelpers {

    WebDriver driver;

    public generalAssertionHelpers(WebDriver driver) {
        this.driver = driver;
    }

    public void element_visible_control(String element_name, By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

            System.out.println("✅ " + element_name + " - element görünür hale geldi.");
            Assert.assertTrue(element.isDisplayed(), element_name + " görünür değil!");
        } catch (Exception e) {
            System.err.println("❌ " + element_name + " - element belirtilen sürede görünür olmadı!");
            throw new AssertionError(element_name + " görünmedi!", e);
        }
    }

    public void verify_url_contains(String expected_part) {
        String current_url = driver.getCurrentUrl();
        System.out.println("🔍 URL kontrolü: " + current_url);
        Assert.assertTrue(current_url.contains(expected_part),
                "❌ URL '" + current_url + "' beklenen kısmı içermiyor: " + expected_part);
        System.out.println("✅ URL '" + current_url + "' beklenen kısmı içeriyor.");
    }

    public void assert_value_equals(By locator, String expected_value) {
        WebElement element = driver.findElement(locator);
        String actual_value = element.getAttribute("value");
        Assert.assertEquals(actual_value, expected_value, "Value değeri eşleşmedi!");
        System.out.println("✅ Value eşleşmesi başarılı: " + expected_value);
    }


    public void assert_text_contains(By locator, String expected_text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

        boolean text_present = wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, expected_text));
        Assert.assertTrue(text_present, "❌ Beklenen metin DOM'da görünmedi: " + expected_text);

        WebElement element = driver.findElement(locator);
        String actual_text = element.getText();
        Assert.assertTrue(actual_text.contains(expected_text), "Metin '" + expected_text + "' içermiyor: " + actual_text);
        System.out.println("✅ Text assert başarılı: " + expected_text);
    }

    public void wait_for_text_in_element(By locator, String expected_text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

        boolean isTextVisible = wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, expected_text));


        Assert.assertTrue(isTextVisible, "❌ Element içinde beklenen metin görünmedi: " + expected_text);
        System.out.println("✅ Element içinde metin başarıyla bulundu: " + expected_text);
    }


    public void assert_text_equals(By locator, String expected_text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

        boolean text_present = wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, expected_text));
        Assert.assertTrue(text_present, "❌ Beklenen metin DOM'da görünmedi: " + expected_text);

        WebElement element = driver.findElement(locator);
        String actual_text = element.getText();
        Assert.assertEquals(actual_text, expected_text, "Metin eşleşmedi!");
        System.out.println("✅ Text eşleşmesi başarılı: " + expected_text);
    }


    public void verify_element_list_is_loaded(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            java.util.List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

            Assert.assertFalse(elements.isEmpty(), "❌ İş ilanı listesi boş geldi!");
            System.out.println("✅ İş ilanı listesi başarıyla yüklendi. Toplam ilan sayısı: " + elements.size());
        } catch (Exception e) {
            System.err.println("❌ İş ilanı listesi bulunamadı veya yüklenemedi!");
            throw new AssertionError("Job listesi görünür değil!", e);
        }
    }

    public void next_new_tab_url() {
        // Ana sekmenin handle'ı
        String originalWindow = driver.getWindowHandle();

        // Tüm sekmeleri al
        Set<String> allWindows = driver.getWindowHandles();

        // Yeni sekmeye geç
        for (String window : allWindows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }


}
