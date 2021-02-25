package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementExample {
    public static void main (String args[]){

        InitialSetup initial = new InitialSetup("chrome");
        WebDriver driver = initial.instanceDriver();
        initial.setExplicitWait(driver,10);

        driver.get("https://www.google.com");

        WebElement myElement = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

        myElement.sendKeys("Holamundo");

        driver.quit();
        driver.close();
        }
    }
}
