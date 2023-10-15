package tests;
import PageObjects.Dashboard_Page;
import PageObjects.UserDashboardPage;
import PageObjects.BookPage;
import PageObjects.ShoppingCartPage;
import org.testng.annotations.Test;

public class TestOfPurchaseBookForSavedAddressCustomer extends BaseTest {
    @Test
    public void TestOrderBook(){
        UserDashboardPage userDashboardPage = new UserDashboardPage();
        BookPage bookPage = new BookPage();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

        userDashboardPage.ClickBookLink();

        bookPage.ClickOnAddToButton();
        bookPage.ClickOnAddToButtonLink();

        shoppingCartPage.setSelectCountry("Canada");
        shoppingCartPage.setSelectCheckBoxTermsOfService();
        shoppingCartPage.setCheckOut();
        shoppingCartPage.setClickBillingAddNewAddressSave();
        shoppingCartPage.setClickSippingAddressSave();
        shoppingCartPage.setClickSippingMethodSave();
        shoppingCartPage.setClickPaymentMethodSave();
        shoppingCartPage.setClickPaymentInformationSave();
        shoppingCartPage.setClickConfirmOrderSave();
    }
}
