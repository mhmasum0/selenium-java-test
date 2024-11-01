package com.mahmud;

import com.mahmud.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTC extends BaseTC{

    @Test
    public void testLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickLoginButton();

        Thread.sleep(3000);
    }
}
