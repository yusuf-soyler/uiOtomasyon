package pages.career;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.basePage;
import utils.generalAssertionHelpers;
import utils.locatorReader;

public class careerQualityAssurancePage extends basePage {

    locatorReader career_qa_locator;
    generalAssertionHelpers assertion_helpers;

    public careerQualityAssurancePage(WebDriver driver) {
        super(driver);
        this.career_qa_locator = new locatorReader("career/career_quality_assurance_page");
        this.assertion_helpers = new generalAssertionHelpers(driver);


    }

    public void verify_career_quality_assurance_page_loaded() {
        System.out.println("🔍 [Verify] Career Page elementleri kontrol ediliyor...");
        assertion_helpers.element_visible_control("Language Dropdown", career_qa_locator.get("see_all_qa_button"));
        System.out.println("✅ [Verify] Career Page üzerindeki tüm elementler başarıyla bulundu.");
    }

    public void click_see_all_qa_jobs_button() {
        By element = career_qa_locator.get("see_all_qa_button");
        assertion_helpers.element_visible_control("See All QA Jobs", element);
        click(element);
    }



}
