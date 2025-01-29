package org.example;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void test_run(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://votermood.com/");

    }
}
