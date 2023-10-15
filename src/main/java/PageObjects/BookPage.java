package PageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import frameworks.BaseForm;
import org.openqa.selenium.By;

public class BookPage extends BaseForm {
    public BookPage(){
        super(By.linkText("Wishlist"), "User HomePage page is not open");
    }
    private final IButton clickOnAddToButton = getElementFactory().getButton(By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]"),"ClickOnAddToButton");
    private final ILink clickOnAddToButtonLink = getElementFactory().getLink(By.linkText("Shopping cart"),"ClickOnAddToButtonLink");
    public void ClickOnAddToButton(){
        clickOnAddToButton.click();
    }
    public void ClickOnAddToButtonLink(){
        clickOnAddToButtonLink.click();
    }
}
