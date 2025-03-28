package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.generalAssertionHelpers;
import utils.locatorReader;

public class navigatorPage extends basePage {

    locatorReader navigator_locator;
    generalAssertionHelpers assertion_helpers;

    public navigatorPage(WebDriver driver) {
        super(driver);
        this.navigator_locator = new locatorReader("navigator_page");
        this.assertion_helpers = new generalAssertionHelpers(driver);

    }

    public void verify_insider_home_menu_loaded() {
        System.out.println("🔍 [Verify] Insider Home Page elementleri kontrol ediliyor...");
        assertion_helpers.element_visible_control("Insider Logo", navigator_locator.get("insider_logo"));
        assertion_helpers.element_visible_control("Why Insider Menu", navigator_locator.get("why_insider_menu"));
        assertion_helpers.element_visible_control("Platform Menu", navigator_locator.get("platform_menu"));
        assertion_helpers.element_visible_control("Solutions Menu", navigator_locator.get("solutions_menu"));
        assertion_helpers.element_visible_control("Customers Menu", navigator_locator.get("customers_menu"));
        assertion_helpers.element_visible_control("Resources Menu", navigator_locator.get("resources_menu"));
        assertion_helpers.element_visible_control("Company Menu", navigator_locator.get("company_menu"));
        assertion_helpers.element_visible_control("Explore Insider Menu", navigator_locator.get("explore_insider_menu"));
        System.out.println("✅ [Verify] Insider Home Page üzerindeki tüm elementler başarıyla bulundu.");
    }

    public void verify_company_page_menu_loaded() {
        System.out.println("🔍 [Verify] Insider Home Page içindeki Company Dropdown elementleri kontrol ediliyor...");
        assertion_helpers.element_visible_control("About Us Menu", navigator_locator.get("about_us_menu"));
        assertion_helpers.element_visible_control("Newsroom Menu", navigator_locator.get("newsroom_menu"));
        assertion_helpers.element_visible_control("Partnerships Menu", navigator_locator.get("partnerships_menu"));
        assertion_helpers.element_visible_control("Technology Partners Menu", navigator_locator.get("technology_partners_menu"));
        assertion_helpers.element_visible_control("Solution Partners Menu", navigator_locator.get("solution_partners_menu"));
        assertion_helpers.element_visible_control("Integrations Menu", navigator_locator.get("integrations_menu"));
        assertion_helpers.element_visible_control("Careers Menu", navigator_locator.get("careers_menu"));
        assertion_helpers.element_visible_control("Contact Us Menu", navigator_locator.get("contact_us_menu"));
        System.out.println("✅ [Verify] Insider Home Page içindeki Company Dropdown içindeki tüm elementler başarıyla bulundu.");
    }



    // --- Hover actions ---
    public void hover_why_insider_menu() {
        By element = navigator_locator.get("why_insider_menu");
        assertion_helpers.element_visible_control("Why Insider Menu", element);
        hover_with_by_locator(element, "Why Insider Menu");
    }

    public void hover_platform_menu() {
        By element = navigator_locator.get("platform_menu");
        assertion_helpers.element_visible_control("Platform Menu", element);
        hover_with_by_locator(element, "Platform Menu");
    }

    public void hover_solutions_menu() {
        By element = navigator_locator.get("solutions_menu");
        assertion_helpers.element_visible_control("Solutions Menu", element);
        hover_with_by_locator(element, "Solutions Menu");
    }

    public void hover_customers_menu() {
        By element = navigator_locator.get("customers_menu");
        assertion_helpers.element_visible_control("Customers Menu", element);
        hover_with_by_locator(element, "Customers Menu");
    }

    public void hover_resources_menu() {
        By element = navigator_locator.get("resources_menu");
        assertion_helpers.element_visible_control("Resources Menu", element);
        hover_with_by_locator(element, "Resources Menu");
    }

    public void hover_company_menu() {
        By element = navigator_locator.get("company_menu");
        assertion_helpers.element_visible_control("Company Menu", element);
        hover_with_by_locator(element, "Company Menu");
    }

    public void hover_explore_insider_menu() {
        By element = navigator_locator.get("explore_insider_menu");
        assertion_helpers.element_visible_control("Explore Insider Menu", element);
        hover_with_by_locator(element, "Explore Insider Menu");
    }

    public void hover_language_dropdown() {
        By element = navigator_locator.get("language_dropdown");
        assertion_helpers.element_visible_control("Language Dropdown", element);
        hover_with_by_locator(element, "Language Dropdown");
    }

    public void click_about_us_menu() {
        By element = navigator_locator.get("about_us_menu");
        assertion_helpers.element_visible_control("About Us Menu", element);
        click(element);
    }

    public void click_newsroom_menu() {
        By element = navigator_locator.get("newsroom_menu");
        assertion_helpers.element_visible_control("Newsroom Menu", element);
        click(element);
    }

    public void click_partnerships_menu() {
        By element = navigator_locator.get("partnerships_menu");
        assertion_helpers.element_visible_control("Partnerships Menu", element);
        click(element);
    }

    public void click_technology_partners_menu() {
        By element = navigator_locator.get("technology_partners_menu");
        assertion_helpers.element_visible_control("Technology Partners Menu", element);
        click(element);
    }

    public void click_solution_partners_menu() {
        By element = navigator_locator.get("solution_partners_menu");
        assertion_helpers.element_visible_control("Solution Partners Menu", element);
        click(element);
    }

    public void click_integrations_menu() {
        By element = navigator_locator.get("integrations_menu");
        assertion_helpers.element_visible_control("Integrations Menu", element);
        click(element);
    }

    public void click_careers_menu() {
        By element = navigator_locator.get("careers_menu");
        assertion_helpers.element_visible_control("Careers Menu", element);
        click(element);
    }

    public void click_contact_us_menu() {
        By element = navigator_locator.get("contact_us_menu");
        assertion_helpers.element_visible_control("Contact Us Menu", element);
        click(element);
    }

    public void verify_agent_one_banner_text_is_visible() {
        By element = navigator_locator.get("agent_one_banner_text");
        assertion_helpers.element_visible_control("Agent One Banner Text", element);
    }

    public void click_meet_our_agents_button() {
        By element = navigator_locator.get("meet_our_agents_button");
        assertion_helpers.element_visible_control("Meet Our Agents Button", element);
        click(element);
    }



}
