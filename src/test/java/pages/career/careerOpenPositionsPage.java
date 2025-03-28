package pages.career;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.basePage;
import utils.generalAssertionHelpers;
import utils.locatorReader;

import java.util.List;

public class careerOpenPositionsPage extends basePage {

    locatorReader career_opp_locator;
    generalAssertionHelpers assertion_helpers;

    public careerOpenPositionsPage(WebDriver driver) {
        super(driver);
        this.career_opp_locator = new locatorReader("career/career_open_positions_page");
        this.assertion_helpers = new generalAssertionHelpers(driver);


    }

    public void verify_career_page_loaded() {
        System.out.println("🔍 [Verify] Career Open Positions Page elementleri kontrol ediliyor...");
        assertion_helpers.element_visible_control("Filter By Department Input", career_opp_locator.get("selected_department"));
        assertion_helpers.element_visible_control("Filter By Location Input", career_opp_locator.get("selected_location_input"));
        System.out.println("✅ [Verify] Career Open Positions Page üzerindeki tüm elementler başarıyla bulundu.");
    }

    public void verify_filter_by_department_value(String expected_value) {
        assertion_helpers.assert_text_contains(career_opp_locator.get("selected_department"), expected_value);
    }

    public void click_filter_by_location_input() {
        By element = career_opp_locator.get("selected_location_input");
        assertion_helpers.element_visible_control("Filter By Location Input", element);
        click(element);
    }

    public void click_location_value(String location_name) {


        By dynamic_location = career_opp_locator.getDynamicLocator("selected_location_value", location_name);
        // Element DOM'da görünür ve text'i yüklenmiş mi, kontrol ediyoruz
        assertion_helpers.wait_for_text_in_element(dynamic_location, location_name);

        click(dynamic_location);
    }

    public void check_job_list_presence() {

        By element = career_opp_locator.get("jobs_list");
        assertion_helpers.verify_element_list_is_loaded(element);

    }

    public void scroll_to_jobs_list() {
        By element = career_opp_locator.get("jobs_list");
        assertion_helpers.element_visible_control("Jobs List", element);
        scroll_into_view(element);
    }

    public void verify_job_department_and_location_for_all_jobs(String expectedDepartment, String expectedLocation) {
        By jobListLocator = career_opp_locator.get("job_list_items");
        By departmentBy = career_opp_locator.get("job_department");
        By locationBy = career_opp_locator.get("job_location");

        assertion_helpers.verify_element_list_is_loaded(jobListLocator);

        int jobCount = driver.findElements(jobListLocator).size();

        for (int i = 0; i < jobCount; i++) {
            // job yeniden locate edilmeli
            List<WebElement> jobList = driver.findElements(jobListLocator);
            WebElement job = jobList.get(i);
            WebElement department = job.findElement(departmentBy);
            WebElement location = job.findElement(locationBy);

            String departmentText = department.getText().trim();
            String locationText = location.getText().trim();

            assertion_helpers.assert_text_equals(departmentBy, expectedDepartment);
            assertion_helpers.assert_text_equals(locationBy, expectedLocation);

            System.out.println("✅ Job item doğrulandı -> Department: " + departmentText + ", Location: " + locationText);
        }

        System.out.println("🎯 Tüm job item'lar doğrulandı.");
    }

    public void hover_first_job() {
        By jobListLocator = career_opp_locator.get("job_list_items");
        By departmentBy = career_opp_locator.get("job_department");

        // İlk job'u locate et
        WebElement job = driver.findElements(jobListLocator).get(0);

        // İlk job içindeki department alanını bul
        WebElement department = job.findElement(departmentBy);

        // Hover işlemi
        hover_with_web_element(department, "First Job Department");

        System.out.println("🎯 İlk job item üzerine hover işlemi tamamlandı.");
    }

    public void click_first_view_role_input_in_first_job() {
        By element = career_opp_locator.get("first_view_role_button");
        assertion_helpers.element_visible_control("First View Role in First Job", element);
        click(element);
    }

    public void verify_job_view_site_opened() {
        assertion_helpers.next_new_tab_url();
        assertion_helpers.verify_url_contains("jobs.lever.co/useinsider/");
    }








}
