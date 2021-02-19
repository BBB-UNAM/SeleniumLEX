package SeleniumExamples;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ImplictWaitExample {
    public static void main(String args[]){
        InitialSetup initial = new InitialSetup("chrome");
        WebDriver driver = initial.instanceDriver();

        driver.get("https://www.google.com");

        //ExplicitWait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com");

        driver.close();
        driver.quit();
    }
}
