package SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class OpenFirefoxWindows {
    public static void main(String args[]) throws InterruptedException {
        File rootPath = new File("src/Utils/DriversWindows/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", rootPath.getPath());
        WebDriver driver = new FirefoxDriver();

        driver.get("Https://www.google.com");

        Thread.sleep(500);
        driver.close(); //close web browser
        driver.quit(); //Close java Thread
    }
}
