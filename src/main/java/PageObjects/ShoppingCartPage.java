package PageObjects;

import aquality.selenium.elements.interfaces.*;
import frameworks.BaseForm;
import org.openqa.selenium.By;
public class ShoppingCartPage extends BaseForm {

    public ShoppingCartPage(){
        super(By.linkText("Wishlist"), "ShoppingCartPage is not open");
    }
    private final IComboBox selectCountry = getElementFactory().getComboBox(By.id("CountryId"),"SelectCountry");
    private final ICheckBox selectCheckBoxTermsOfService = getElementFactory().getCheckBox(By.id("termsofservice"),"SelectCheckBoxTermsOfService");
    private final IButton checkOut = getElementFactory().getButton(By.id("checkout"),"CheckOut");
    private final IComboBox selectCountryBillingAddress = getElementFactory().getComboBox(By.id("BillingNewAddress_CountryId"),"selectCountryBillingAddress");
    private final ITextBox billingNewAddressCity = getElementFactory().getTextBox(By.id("BillingNewAddress_City"),"billingNewAddressCity");
    private final ITextBox billingNewAddress1 = getElementFactory().getTextBox(By.id("BillingNewAddress_Address1"),"BillingNewAddress1");
    private final ITextBox billingNewAddressZipPostalCode = getElementFactory().getTextBox(By.id("BillingNewAddress_ZipPostalCode"),"BillingNewAddressZipPostalCode");
    private final ITextBox billingNewAddressPhoneNumber = getElementFactory().getTextBox(By.id("BillingNewAddress_PhoneNumber"),"BillingNewAddressPhoneNumber");
    private final IButton clickBillingAddNewAddressSave = getElementFactory().getButton(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]"),"ClickBillingAddNewAddressSave");
    private final IButton clickSippingAddressSave = getElementFactory().getButton(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[2]/div[2]/div[1]/input[1]"),"ClickSippingAddressSave");
    private final IButton clickSippingMethodSave = getElementFactory().getButton(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/input[1]"),"ClickSippingMethodSave");
    private final IButton clickPaymentMethodSave = getElementFactory().getButton(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/input[1]"),"ClickPaymentMethodSave");
    private final IButton clickPaymentInformationSave = getElementFactory().getButton(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/input[1]"),"ClickPaymentInformationSave");
    private final IButton clickConfirmOrderSave = getElementFactory().getButton(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[2]/input[1]"),"ClickConfirmOrderSave");
    private final ILink seeOrderDetails = getElementFactory().getLink(By.linkText("Click here for order details."),"SeeOrderDetails");
    private final ILink downloadOrderPDF = getElementFactory().getLink(By.linkText("PDF Invoice"),"DownloadOrderPDF");
    public void setSelectCountry(String value){
        selectCountry.selectByContainingText(value);
    }
   public void setSelectCheckBoxTermsOfService(){
        selectCheckBoxTermsOfService.click();
   }
   public void setCheckOut(){
        checkOut.click();
   }
    public void setSelectCountryBillingAddress(String value){
        selectCountryBillingAddress.selectByContainingText(value);
    }
    public void setBillingNewAddressCity(String value){
        billingNewAddressCity.type(value);
    }
    public void setBillingNewAddress1(String value){
        billingNewAddress1.type(value);
    }
    public void setBillingNewAddressZipPostalCode(String value){
        billingNewAddressZipPostalCode.type(value);
    }
    public void setBillingNewAddressPhoneNumber(String value){
        billingNewAddressPhoneNumber.type(value);
    }
    public void setClickBillingAddNewAddressSave(){
        clickBillingAddNewAddressSave.click();
    }
    public void setClickSippingAddressSave(){
        clickSippingAddressSave.click();
    }
    public void setClickSippingMethodSave(){
        clickSippingMethodSave.click();
    }
    public void setClickPaymentMethodSave(){
        clickPaymentMethodSave.click();
    }
    public void setClickPaymentInformationSave(){
        clickPaymentInformationSave.click();
    }
    public void setClickConfirmOrderSave(){
        clickConfirmOrderSave.click();
    }
    public void setSeeOrderDetails(){
        seeOrderDetails.click();
    }
    public void setDownloadOrderPDF(){
        downloadOrderPDF.click();
    }

}
