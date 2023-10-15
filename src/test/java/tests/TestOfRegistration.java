package tests;

import PageObjects.WebLogin;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.Test;
import PageObjects.Registration_Page;
import PageObjects.Dashboard_Page;

public class TestOfRegistration extends BaseTest{
    @Test
    public void TestingRegistration() throws InterruptedException {

        ISettingsFile testdata = new JsonSettingsFile("testdata.json");
        Dashboard_Page dashboardPage = new Dashboard_Page();
        Registration_Page registrationPage = new Registration_Page();
        dashboardPage.clickOnRegistrationLink();
        registrationPage.setGender();
        registrationPage.setFirstName("Shanjida");
        registrationPage.setLastName("Hride");
        registrationPage.setEmail("hride1997@gmail.com");
        registrationPage.setPassword("12345678");
        registrationPage.setConfirmPassword("12345678");
        registrationPage.clickOnRegistrationButton();
        Thread.sleep(5000);
    }
}
