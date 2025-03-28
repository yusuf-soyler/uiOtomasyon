package pages.career;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.basePage;
import utils.generalAssertionHelpers;
import utils.locatorReader;

public class careerPage extends basePage {
    locatorReader career_locator;
    generalAssertionHelpers assertion_helpers;

    public careerPage(WebDriver driver) {/**/
        super(driver);
        this.career_locator = new locatorReader("career/career_page");
        this.assertion_helpers = new generalAssertionHelpers(driver);

    }

    public void verify_career_page_loaded() {
        System.out.println("🔍 [Verify] Career Page elementleri kontrol ediliyor...");
        assertion_helpers.element_visible_control("Language Dropdown", career_locator.get("find_your_dream_job_button"));
        assertion_helpers.element_visible_control("Locations Block", career_locator.get("locations_blocks"));
        assertion_helpers.element_visible_control("Teams Block", career_locator.get("teams_block"));
        assertion_helpers.element_visible_control("Life at Insider Block", career_locator.get("life_at_insider_block"));
        assertion_helpers.element_visible_control("Life at Insider Block", career_locator.get("see_all_teams_button"));
        System.out.println("✅ [Verify] Career Page üzerindeki tüm elementler başarıyla bulundu.");
    }

    public void click_find_your_dream_job_button() {
        By element = career_locator.get("find_your_dream_job_button");
        assertion_helpers.element_visible_control("Find Your Dream Job Button", element);
        click(element);
    }

    public void click_see_all_teams_button() {
        By element = career_locator.get("see_all_teams_button");
        assertion_helpers.element_visible_control("See All Teams Button", element);
        click(element);
    }

    public void click_quality_assurance_button() {
        By element = career_locator.get("quality_assurance_button");
        assertion_helpers.element_visible_control("Quality Assurance", element);
        click(element);
    }

    public void scroll_to_see_all_teams_button() {
        By element = career_locator.get("see_all_teams_button");
        assertion_helpers.element_visible_control("See All Teams Button", element);
        scroll_into_view(element);
    }

    public void scroll_to_see_quality_assurance_button() {
        By element = career_locator.get("quality_assurance_button");
        assertion_helpers.element_visible_control("Quality Assurance", element);
        scroll_into_view(element);
    }

    public void verify_locations_block_visible() {
        assertion_helpers.element_visible_control("Locations Block", career_locator.get("locations_blocks"));
    }

    public void verify_teams_block_visible() {
        assertion_helpers.element_visible_control("Teams Block", career_locator.get("teams_block"));
    }

    public void verify_life_at_insider_block_visible() {
        assertion_helpers.element_visible_control("Life at Insider Block", career_locator.get("life_at_insider_block"));
    }
}
