package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitExample {
    public static void main(String args[]) throws InterruptedException {
        InitialSetup initial = new InitialSetup("chrome");
        WebDriver driver = initial.instanceDriver();

        String webPage = "https://www.google.com";
        driver.get(webPage);

        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement button;

        button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@class='lnXdpd']")));

        button.click();

        Thread.sleep(500);

        driver.close();
        driver.quit();

    }
}
