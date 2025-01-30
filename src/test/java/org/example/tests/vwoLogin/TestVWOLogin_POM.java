package org.example.tests.vwoLogin;

import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.example.pages.pageObjectModel.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWOLogin_POM {
    @Owner("Ravindra")
    @Description("Verify that invalid Creds gives error message")
    @Test
    public void testLoginNegativeVWO(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        LoginPage_POM loginPagePom = new LoginPage_POM(driver);
        String error_msg = loginPagePom.loginTOVWOLoginInvalidCreds("ravindra.singh@zentek.com","Test@1234");

        assertThat(error_msg).isNotNull().isNotEmpty().isNotBlank();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");

        driver.quit();

    }


}
