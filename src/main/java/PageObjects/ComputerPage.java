package PageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import frameworks.BaseForm;
import org.openqa.selenium.By;

public class ComputerPage extends BaseForm {
    public ComputerPage(){
        super(By.linkText("Wishlist"), "User HomePage page is not open");
    }
    private final ILink clickComputerLink = getElementFactory().getLink(By.linkText("Computers"),"ClickComputerLink");
    private final ILink clickDesktopLink = getElementFactory().getLink(By.linkText("Desktops"),"ClickDesktopLink");
    private final ILink clickDesktop_PC_Link = getElementFactory().getLink(By.linkText("Build your own cheap computer"),"ClickDesktop_PC_Link");
    private final IButton clickAddToButton = getElementFactory().getButton(By.id("add-to-cart-button-72"),"ClickAddToButton");


    public void setClickComputerLink(){
        clickComputerLink.click();
    }
    public void setClickDesktopLink(){
        clickDesktopLink.click();
    }
    public void setClickDesktop_PC_Link(){
        clickDesktop_PC_Link.click();
    }
    public void setClickAddToButton(){
        clickAddToButton.click();
    }
}
