package tests.career;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.career.careerPage;
import pages.career.careerQualityAssurancePage;
import pages.navigatorPage;
import utils.baseTest;

public class careerQualityAssuranceTest extends baseTest {
    navigatorPage navigator_page;
    careerPage career_page;
    careerQualityAssurancePage quality_assurance_page;

    @BeforeMethod
    public void setUpPages() {
        navigator_page = new navigatorPage(driver);
        career_page = new careerPage(driver);
        quality_assurance_page = new careerQualityAssurancePage(driver);

    }


    @Test
    public void verify_insider_home_page_is_opened() {

        navigator_page.verify_insider_home_menu_loaded();
        navigator_page.hover_company_menu();
        navigator_page.verify_company_page_menu_loaded();
        navigator_page.click_careers_menu();
        career_page.verify_career_page_loaded();
        career_page.scroll_to_see_all_teams_button();
        career_page.click_see_all_teams_button();
        career_page.scroll_to_see_quality_assurance_button();
        career_page.click_quality_assurance_button();
        quality_assurance_page.verify_career_quality_assurance_page_loaded();
        quality_assurance_page.click_see_all_qa_jobs_button();

    }
}
