package SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.sql.Driver;

public class OpenCromeMacOS {
    public static void main(String args[]) throws InterruptedException {

        File rootPath = new File("src/Utils/DriversMacOS/chromedriver");
        System.setProperty("webdriver.chrome.driver", rootPath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.get("Https://www.google.com");

        Thread.sleep(500);
        driver.close(); //close web browser
        driver.quit(); //Close java Thread
    }
}
