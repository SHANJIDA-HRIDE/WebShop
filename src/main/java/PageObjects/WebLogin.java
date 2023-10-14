package PageObjects;

import org.openqa.selenium.By;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import frameworks.BaseForm;

public class WebLogin extends BaseForm {
	
	 public WebLogin(){
	        super(By.xpath("//a[contains(text(),'Forgot password?')]"), "login page is not open");
	    }
	 
	 	private final ITextBox username = getElementFactory().getTextBox(By.id("Email"), "username");
	 	private final ITextBox password = getElementFactory().getTextBox(By.id("Password"), "password");
	    private final IButton login = getElementFactory().getButton(By.xpath("//form[@method='post']/div[5]/input[@value='Log in']"), "Login");

	    public void setUsername(String value){
	        username.clearAndType(value);
	    }

	    public void setPassword(String value){
	        password.clearAndType(value);
	    }

	    public void clickedOnLogin(){
	        login.clickAndWait();
	    }
}
