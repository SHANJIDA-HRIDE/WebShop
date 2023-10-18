package tests;
import PageObjects.*;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.Test;

public class TestOfPurchaseComputerDesktop extends BaseTest{
    @Test
    public void TestOrderComputer() throws InterruptedException {
        ISettingsFile testdata = new JsonSettingsFile("testdata.json");

        UserDashboardPage userDashboardPage = new UserDashboardPage();
        ComputerPage computerPage = new ComputerPage();
        WebLogin loginPage = new WebLogin();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        Dashboard_Page dashboardPage = new Dashboard_Page();
        BookPage bookPage = new BookPage();


        dashboardPage.clickedOnLoginLink();

        loginPage.setUsername(testdata.getValue("/email").toString());
        loginPage.setPassword(testdata.getValue("/password").toString());
        loginPage.clickedOnLogin();
        Thread.sleep(2000);

        computerPage.setClickComputerLink();
        computerPage.setClickDesktopLink();
        computerPage.setClickDesktop_PC_Link();
        computerPage.setClickAddToButton();
        bookPage.ClickOnAddToButtonLink();
        Thread.sleep(2000);

        shoppingCartPage.setSelectCountry(testdata.getValue("/SelectCountry").toString());
        shoppingCartPage.setSelectCheckBoxTermsOfService();
        shoppingCartPage.setCheckOut();
        Thread.sleep(2000);
        shoppingCartPage.setClickBillingAddNewAddressSave();
        shoppingCartPage.setClickSippingAddressSave();
        shoppingCartPage.setClickSippingMethodSave();
        shoppingCartPage.setClickPaymentMethodSave();
        shoppingCartPage.setClickPaymentInformationSave();
        shoppingCartPage.setClickConfirmOrderSave();
        shoppingCartPage.setSeeOrderDetails();
        shoppingCartPage.setDownloadOrderPDF();
        Thread.sleep(5000);
    }
}
