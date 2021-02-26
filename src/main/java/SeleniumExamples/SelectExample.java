package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectExample {
    public static void main (String args[]) throws InterruptedException {
        InitialSetup initial = new InitialSetup("chrome");
        WebDriver driver = initial.instanceDriver();

        initial.setExplicitWait(driver,10);

        String baseUrl = "http://demo.guru99.com/test/newtours/register.php";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        WebElement dropdown = driver.findElement(By.xpath("//*[@name='country']"));

        Select drpCountry = new Select(dropdown);

        drpCountry.selectByVisibleText("ANDORRA");

        List <WebElement> options = drpCountry.getOptions();

        for(int i = 0; i < options.size() ;i++){
            //System.out.println("Opcion #" + i + options.get(i).getText());
            drpCountry.selectByIndex(i);
            Thread.sleep(50);
        }

        Thread.sleep(500);
        driver.close();
        driver.quit();
    }
}
