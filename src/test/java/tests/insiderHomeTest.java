package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.insiderHomePage;
import pages.navigatorPage;
import utils.baseTest;

public class insiderHomeTest extends baseTest {

    navigatorPage navigator_page;
    insiderHomePage insider_home_page;

    @BeforeMethod
    public void setUpPages() {
        navigator_page = new navigatorPage(driver);
        insider_home_page = new insiderHomePage(driver);
    }

    //Test Automation Case 1
    /*
    1. Visit https://useinsider.com/ and check Insider home page is opened or not

     */
    @Test
    public void verify_insider_home_page_is_opened() {

        insider_home_page.verify_insider_home_site_opened();

    }



    @Test
    public void insider_navigation_test() {

        navigator_page.verify_insider_home_menu_loaded(); // home sayfasındaki menüleri verify eder.
        navigator_page.hover_company_menu();
        navigator_page.verify_company_page_menu_loaded();
        navigator_page.click_careers_menu();

    }

}
