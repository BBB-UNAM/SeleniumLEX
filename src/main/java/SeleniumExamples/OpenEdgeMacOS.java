package SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class OpenEdgeMacOS {
    public static void main(String args[]) throws InterruptedException {
        File rootPath = new File("src/Utils/DriversMacOS/msedgedriver");
        System.setProperty("webdriver.edge.driver", rootPath.getPath());
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");

        //Thread.sleep(500);
        driver.close(); //close web browser
        driver.quit(); //Close java Thread
    }
}
