package PageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.elements.interfaces.IRadioButton;
import aquality.selenium.elements.interfaces.ITextBox;
import frameworks.BaseForm;
import org.openqa.selenium.By;

public class Registration_Page extends BaseForm {
    public Registration_Page(){
        super(By.linkText("Register"), "HomePage page is not open");
    }
    private final IRadioButton genderSelect = getElementFactory().getRadioButton(By.id("gender-male"),"GenderSelect");
    private final ITextBox firstName = getElementFactory().getTextBox(By.id("FirstName"),"FirstName");
    private final ITextBox lastName = getElementFactory().getTextBox(By.id("LastName"),"LastName");
    private final ITextBox email = getElementFactory().getTextBox(By.id("Email"),"Email");
    private final ITextBox password = getElementFactory().getTextBox(By.id("Password"),"Password");
    private final ITextBox confirmPassword = getElementFactory().getTextBox(By.id("ConfirmPassword"),"ConfirmPassword");
    private final IButton registerButton = getElementFactory().getButton(By.id("register-button"),"RegisterButton");
    public void setGender(){
        genderSelect.click();
    }
    public void setFirstName(String value){
        firstName.clearAndType(value);
    }
    public void setLastName(String value){
        lastName.clearAndType(value);
    }
    public void setEmail(String value){
        email.clearAndType(value);
    }
    public void setPassword(String value){
        password.clearAndType(value);
    }
    public void setConfirmPassword(String value){
        confirmPassword.clearAndType(value);
    }
    public void clickOnRegistrationButton(){
        registerButton.clickAndWait();
    }


}
