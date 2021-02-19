package SeleniumExamples;

import org.openqa.selenium.WebDriver;

public class TestInitialSetup {
    public static void main(String args[]) throws InterruptedException {

        InitialSetup initial = new InitialSetup("firefox",10);
        WebDriver driver = initial.instanceDriver();

        driver.get("https://www.google.com");

        Thread.sleep(500);

        driver.quit();
        driver.close();
    }
}
