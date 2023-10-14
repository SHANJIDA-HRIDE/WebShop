package PageObjects;

import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.IComboBox;
import frameworks.BaseForm;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ISelect;

public class ShoppingCartPage extends BaseForm {
    public ShoppingCartPage(){
        super(By.linkText("Wishlist"), "ShoppingCartPage is not open");
    }
    private final IComboBox selectCountry = getElementFactory().getComboBox(By.id("CountryId"),"SelectCountry");
    private final ICheckBox select
}
