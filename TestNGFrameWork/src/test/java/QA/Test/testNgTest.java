package QA.Test;

import Base.BaseTest;
import Pages.HomePageEvents;
import Pages.LoginPageEvents;
import Utilis.ElementFetch;
import org.testng.annotations.Test;

public class testNgTest extends BaseTest {
    ElementFetch ele=new ElementFetch();
    HomePageEvents homeeve=new HomePageEvents();
    LoginPageEvents logeve=new LoginPageEvents();
    @Test
    public void sampleMethodForLogin(){
        homeeve.clickSignInButton();
        logeve.checkLoginPage();
        logeve.loginByCredentials();
    }
}
