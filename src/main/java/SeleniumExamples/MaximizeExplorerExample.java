package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MaximizeExplorerExample {
    public static void main(String args[]) throws InterruptedException {
        InitialSetup initial = new InitialSetup("chrome");
        WebDriver driver = initial.instanceDriver();

        initial.setExplicitWait(driver,10);

        driver.get("http://demo.guru99.com/test/newtours/");

        driver.manage().window().maximize();

        Thread.sleep(100);
        driver.close();
        driver.quit();

    }
}
