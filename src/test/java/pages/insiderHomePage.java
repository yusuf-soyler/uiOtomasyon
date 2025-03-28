package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.generalAssertionHelpers;
import utils.locatorReader;

public class insiderHomePage extends basePage {
    locatorReader insider_home_locator;
    generalAssertionHelpers assertion_helpers;

    public insiderHomePage(WebDriver driver) {
        super(driver);
        this.insider_home_locator = new locatorReader("insider_home");
        this.assertion_helpers = new generalAssertionHelpers(driver);

    }

    public void verify_insider_home_loaded() {
        System.out.println("🔍 [Verify] Insider Home Page elementleri kontrol ediliyor...");
        assertion_helpers.element_visible_control("Language Dropdown", insider_home_locator.get("language_dropdown"));
        assertion_helpers.element_visible_control("Login Button", insider_home_locator.get("login_button"));
        assertion_helpers.element_visible_control("Get a Demo Button", insider_home_locator.get("get_demo_button"));
        System.out.println("✅ [Verify] Insider Home Page üzerindeki tüm elementler başarıyla bulundu.");
    }

    public void verify_insider_home_site_opened() {
        assertion_helpers.verify_url_contains("useinsider.com");
    }



    // --- Click actions ---
    public void click_insider_logo() {
        By element = insider_home_locator.get("insider_logo");
        assertion_helpers.element_visible_control("Insider Logo", element);
        click(element);
    }

    public void click_login_button() {
        By element = insider_home_locator.get("login_button");
        assertion_helpers.element_visible_control("Login Button", element);
        click(element);
    }

    public void click_get_demo_button() {
        By element = insider_home_locator.get("get_demo_button");
        assertion_helpers.element_visible_control("Get a Demo Button", element);
        click(element);
    }

}
