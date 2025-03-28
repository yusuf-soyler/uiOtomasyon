package tests.career;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.career.careerPage;
import pages.navigatorPage;
import utils.baseTest;

public class careerTest extends baseTest {
    navigatorPage navigator_page;
    careerPage career_page;

    @BeforeMethod
    public void setUpPages() {
        navigator_page = new navigatorPage(driver);
        career_page = new careerPage(driver);

    }

    //Test Automation Case 2
    /*
    Select the “Company” menu in the navigation bar, select “Careers” and check Career
    page, its Locations, Teams, and Life at Insider blocks are open or not
     */

    @Test
    public void verify_insider_home_page_is_opened() {

        navigator_page.verify_insider_home_menu_loaded();
        navigator_page.hover_company_menu();
        navigator_page.verify_company_page_menu_loaded();
        navigator_page.click_careers_menu();
        career_page.verify_career_page_loaded(); // Normalde bunun içnide sayfada var mı kontrol ediyorum ama case istendiği için ekstra aşağıda da eklemek istedim.
        career_page.verify_locations_block_visible();
        career_page.verify_teams_block_visible();
        career_page.verify_life_at_insider_block_visible();

    }
}
