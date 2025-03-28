package tests.career;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.career.careerOpenPositionsPage;
import pages.career.careerPage;
import pages.career.careerQualityAssurancePage;
import pages.navigatorPage;
import utils.baseTest;

public class careerOpenPositionsTest extends baseTest {
    navigatorPage navigator_page;
    careerPage career_page;
    careerQualityAssurancePage career_quality_assurance_page;
    careerOpenPositionsPage career_open_positions_page;

    @BeforeMethod
    public void setUpPages() {
        navigator_page = new navigatorPage(driver);
        career_page = new careerPage(driver);
        career_quality_assurance_page = new careerQualityAssurancePage(driver);
        career_open_positions_page = new careerOpenPositionsPage(driver);
    }

    //Test Automation Case 3
    /*
    Go to https://useinsider.com/careers/quality-assurance/, click “See all QA jobs”, filter
    jobs by Location: “Istanbul, Turkey”, and Department: “Quality Assurance”, check the
    presence of the job list
     */
    @Test
    public void test_automation_case_3() {

        navigator_page.verify_insider_home_menu_loaded();
        navigator_page.hover_company_menu();
        navigator_page.verify_company_page_menu_loaded();
        navigator_page.click_careers_menu();
        career_page.verify_career_page_loaded();
        career_page.scroll_to_see_all_teams_button();
        career_page.click_see_all_teams_button();
        career_page.scroll_to_see_quality_assurance_button();
        career_page.click_quality_assurance_button();
        career_quality_assurance_page.verify_career_quality_assurance_page_loaded();
        career_quality_assurance_page.click_see_all_qa_jobs_button();
        career_open_positions_page.verify_career_page_loaded();
        career_open_positions_page.verify_filter_by_department_value("Quality Assurance"); // Departman Quality Assurance olduğu kontrol ediliyor.
        career_open_positions_page.click_filter_by_location_input();
        career_open_positions_page.click_location_value("Istanbul, Turkiye"); // dinamik olarak filter by location seçme.
        career_open_positions_page.scroll_to_jobs_list();
        career_open_positions_page.check_job_list_presence(); // jobs list doğrulama.


    }

    //Test Automation Case 4
    /*
    Check that all jobs’ Position contains “Quality Assurance”, Department contains
    “Quality Assurance”, and Location contains “Istanbul, Turkey”
     */

    @Test
    public void test_automation_case_4() {

        navigator_page.verify_insider_home_menu_loaded();
        navigator_page.hover_company_menu();
        navigator_page.verify_company_page_menu_loaded();
        navigator_page.click_careers_menu();
        career_page.verify_career_page_loaded();
        career_page.scroll_to_see_all_teams_button();
        career_page.click_see_all_teams_button();
        career_page.scroll_to_see_quality_assurance_button();
        career_page.click_quality_assurance_button();
        career_quality_assurance_page.verify_career_quality_assurance_page_loaded();
        career_quality_assurance_page.click_see_all_qa_jobs_button();
        career_open_positions_page.verify_career_page_loaded();
        career_open_positions_page.verify_filter_by_department_value("Quality Assurance"); // Departman Quality Assurance olduğu kontrol ediliyor.
        career_open_positions_page.click_filter_by_location_input();
        career_open_positions_page.click_location_value("Istanbul, Turkiye"); // dinamik olarak filter by location seçme.
        career_open_positions_page.scroll_to_jobs_list();
        career_open_positions_page.check_job_list_presence(); // jobs list doğrulama.
        career_open_positions_page.verify_job_department_and_location_for_all_jobs("Quality Assurance", "Istanbul, Turkiye");

    }

    //Test Automation Case 5
    /*
    Click the “View Role” button and check that this action redirects us to the Lever
    Application form page
     */

    @Test
    public void test_automation_case_5() {

        navigator_page.verify_insider_home_menu_loaded();
        navigator_page.hover_company_menu();
        navigator_page.verify_company_page_menu_loaded();
        navigator_page.click_careers_menu();
        career_page.verify_career_page_loaded();
        career_page.scroll_to_see_all_teams_button();
        career_page.click_see_all_teams_button();
        career_page.scroll_to_see_quality_assurance_button();
        career_page.click_quality_assurance_button();
        career_quality_assurance_page.verify_career_quality_assurance_page_loaded();
        career_quality_assurance_page.click_see_all_qa_jobs_button();
        career_open_positions_page.verify_career_page_loaded();
        career_open_positions_page.verify_filter_by_department_value("Quality Assurance"); // Departman Quality Assurance olduğu kontrol ediliyor.
        career_open_positions_page.click_filter_by_location_input();
        career_open_positions_page.click_location_value("Istanbul, Turkiye"); // dinamik olarak filter by location seçme.
        career_open_positions_page.scroll_to_jobs_list();
        career_open_positions_page.check_job_list_presence(); // jobs list doğrulama.
        career_open_positions_page.verify_job_department_and_location_for_all_jobs("Quality Assurance", "Istanbul, Turkiye");
        career_open_positions_page.hover_first_job();
        career_open_positions_page.click_first_view_role_input_in_first_job();
        career_open_positions_page.verify_job_view_site_opened();



    }

}
