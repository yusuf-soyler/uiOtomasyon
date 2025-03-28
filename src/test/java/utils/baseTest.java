package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class baseTest {

    protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void set_up(@Optional("chrome") String browser) {
        System.out.println("🧪 Browser başlatılıyor: " + browser.toUpperCase());

        driver = driverFactory.get_driver(browser);
        driver.manage().window().maximize();

        String base_url = configReader.get("base_url");
        System.out.println("🌐 Test URL'si: " + base_url);
        driver.get(base_url);
    }

    @AfterMethod
    public void tear_down(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            screenshotUtil.take_screenshot(driver, result.getName());
        }

        if (driver != null) {
            driver.quit();
        }
    }
}
