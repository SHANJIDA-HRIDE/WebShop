package tests;
import PageObjects.Dashboard_Page;
import PageObjects.WebLogin;
import PageObjects.UserDashboardPage;
import PageObjects.BookPage;
import PageObjects.ShoppingCartPage;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.Test;

public class TestOfShippingProductBook extends BaseTest {
    @Test
    public void TestShippingBook(){
        ISettingsFile testdata = new JsonSettingsFile("testdata.json");
        Dashboard_Page dashboardPage = new Dashboard_Page();
        WebLogin loginPage = new WebLogin();
        UserDashboardPage userDashboardPage = new UserDashboardPage();
        BookPage bookPage = new BookPage();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

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
        shoppingCartPage.setSelectCountryBillingAddress(testdata.getValue("/SelectCountry").toString());
        shoppingCartPage.setBillingNewAddressCity(testdata.getValue("/NewAddressCity").toString());
        shoppingCartPage.setBillingNewAddress1(testdata.getValue("/NewAddress1").toString());
        shoppingCartPage.setBillingNewAddressZipPostalCode(testdata.getValue("/NewAddressZipPostalCode").toString());
        shoppingCartPage.setBillingNewAddressPhoneNumber(testdata.getValue("/NewAddressPhoneNumber").toString());
        shoppingCartPage.setClickBillingAddNewAddressSave();
        shoppingCartPage.setClickSippingAddressSave();
        shoppingCartPage.setClickSippingMethodSave();
        shoppingCartPage.setClickPaymentMethodSave();
        shoppingCartPage.setClickPaymentInformationSave();
        shoppingCartPage.setClickConfirmOrderSave();
    }
}
