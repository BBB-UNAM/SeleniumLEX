package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class ActionsExample {
    public static void main(String args[]) throws InterruptedException {

        InitialSetup initial = new InitialSetup("chrome");
        WebDriver driver = initial.instanceDriver();

        initial.setExplicitWait(driver,10);

        driver.get("http://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();

        List<WebElement> leftOptions = driver.findElements(By.xpath("//a[text()='Home' or text()='Flights' or text()='Hotels' or text()='Car Rentals' or text()='Cruises' or text()='Destinations' or text()='Vacations']"));

        //WebElement option = driver.findElement(By.xpath("//a[text()='Home']"));

        Actions builder =  new Actions(driver);

        /*Action mouseOverMenu = builder
                .moveToElement(leftOptions.get(0))
                .build();*/

        for (int i = 0; i < leftOptions.size(); i++){
            Action mouseOverMenu = builder
                    .moveToElement(leftOptions.get(i))
                    .build();
            mouseOverMenu.perform();
            Thread.sleep(100);
        }

        driver.quit();
        driver.close();

    }
}
