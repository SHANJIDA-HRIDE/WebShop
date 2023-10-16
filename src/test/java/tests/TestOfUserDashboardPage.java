package tests;
import PageObjects. *;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.Test;

public class TestOfUserDashboardPage extends BaseTest {
    @Test
    public void UserDashboardPage(){
        ISettingsFile testdata = new JsonSettingsFile("testdata.json");

        Dashboard_Page loginPageLink = new Dashboard_Page();
        WebLogin loginPage = new WebLogin();
        UserDashboardPage userDashboardPage = new UserDashboardPage();

        loginPageLink.clickedOnLoginLink();
        loginPage.setUsername(testdata.getValue("/email").toString());
        loginPage.setPassword(testdata.getValue("/password").toString());
        loginPage.clickedOnLogin();

        userDashboardPage.setClickLogoutLink();


    }
}
