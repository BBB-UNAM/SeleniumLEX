package SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class OpenEdgeWindows {
    public static void main(String args[]) throws InterruptedException {
        File rootPath = new File("src/Utils/DriversWindows/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver", rootPath.getPath());
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");

        //Thread.sleep(500);
        driver.close(); //close web browser
        driver.quit(); //Close java Thread
    }
}
