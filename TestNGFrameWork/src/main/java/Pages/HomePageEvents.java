package Pages;

import PageObjects.HomePageObjects;
import Utilis.ElementFetch;

public class HomePageEvents {
    ElementFetch ele=new ElementFetch();
    public void clickSignInButton(){
        ele.getWebElement("XPATH", HomePageObjects.signInButton).click();
    }
}
