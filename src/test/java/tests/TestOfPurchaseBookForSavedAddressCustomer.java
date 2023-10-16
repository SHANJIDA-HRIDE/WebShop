package tests;
import PageObjects.*;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.Test;

public class TestOfPurchaseBookForSavedAddressCustomer extends BaseTest {
    @Test
    public void TestOrderBook(){
        ISettingsFile testdata = new JsonSettingsFile("testdata.json");

        UserDashboardPage userDashboardPage = new UserDashboardPage();
        BookPage bookPage = new BookPage();
        WebLogin loginPage = new WebLogin();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        Dashboard_Page dashboardPage = new Dashboard_Page();


        dashboardPage.clickedOnLoginLink();

        loginPage.setUsername(testdata.getValue("/email").toString());
        loginPage.setPassword(testdata.getValue("/password").toString());
        loginPage.clickedOnLogin();
        userDashboardPage.ClickBookLink();

        bookPage.ClickOnAddToButton();
        bookPage.ClickOnAddToButtonLink();

        shoppingCartPage.setSelectCountry(testdata.getValue("/SelectCountry").toString());
        shoppingCartPage.setSelectCheckBoxTermsOfService();
        shoppingCartPage.setCheckOut();
        shoppingCartPage.setClickBillingAddNewAddressSave();
        shoppingCartPage.setClickSippingAddressSave();
        shoppingCartPage.setClickSippingMethodSave();
        shoppingCartPage.setClickPaymentMethodSave();
        shoppingCartPage.setClickPaymentInformationSave();
        shoppingCartPage.setClickConfirmOrderSave();
        shoppingCartPage.setSeeOrderDetails();
        shoppingCartPage.setDownloadOrderPDF();
    }
}
