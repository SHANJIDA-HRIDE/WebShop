package tests;

import PageObjects. *;
import org.testng.annotations.Test;

public class TestOfHomePage extends BaseTest {
   @Test
   public void TestingLogin(){
        Dashboard_Page loginPageLink = new Dashboard_Page();
       loginPageLink.clickedOnLoginLink();
    }
}
