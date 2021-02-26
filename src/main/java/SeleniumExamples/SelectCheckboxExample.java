package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectCheckboxExample {
    public static void main(String args[]) throws InterruptedException {
        InitialSetup initial = new InitialSetup("chrome");
        WebDriver driver = initial.instanceDriver();

        initial.setExplicitWait(driver,10);

        driver.get("http://demo.guru99.com/test/radio.html");

        List <WebElement> radios = driver.findElements(By.xpath("//*[@type='radio']"));
        List <WebElement> checkBoxes = driver.findElements(By.xpath("//*[@type='checkbox']"));

        radios.get(0).click();
        Thread.sleep(100);
        radios.get(1).click();
        Thread.sleep(100);
        radios.get(2).click();
        Thread.sleep(100);

        System.out.println("El tamaño de la lista es de: " + radios.size());

        checkBoxes.get(0).click();
        Thread.sleep(100);
        checkBoxes.get(1).click();
        Thread.sleep(100);
        checkBoxes.get(2).click();
        Thread.sleep(100);


        driver.quit();
        driver.close();

    }
}
