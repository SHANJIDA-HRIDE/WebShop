package PageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import frameworks.BaseForm;
import org.openqa.selenium.By;

public class Dashboard_Page extends BaseForm {

    public Dashboard_Page(){
        super(By.linkText("Register"), "HomePage page is not open");
    }
    private final ILink loginLink = getElementFactory().getLink(By.linkText("Log in"),"LoginLink");
    private final ILink registrationLink = getElementFactory().getLink(By.linkText("Register"),"RegistrationLink");

    public void clickedOnLoginLink(){
        loginLink.clickAndWait();
    }
    public void clickOnRegistrationLink(){
        registrationLink.clickAndWait();
    }

}
