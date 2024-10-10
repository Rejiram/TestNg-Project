package Pages;

import PageObjects.LoginPageObjects;
import Utilis.ElementFetch;

public class LoginPageEvents {
    ElementFetch ele=new ElementFetch();
    public void checkLoginPage(){


    }
    public void loginByCredentials(){
        ele.getWebElement("NAME", LoginPageObjects.userName).sendKeys("rmis@gmail.com");
        ele.getWebElement("NAME", LoginPageObjects.Password).sendKeys("pass-123");
        ele.getWebElement("XPATH", LoginPageObjects.loginButton).click();

    }
}
