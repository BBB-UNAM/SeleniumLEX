package SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
/*
* Class InitialSetup
*
*  This class contains methods to configure drivers of selected explore to run in Windows 10 and MacOS.
*  This class contains mehods to select a correct selenium driver depends of operating
*  system (MacOS, Windows 10) and used web explorer (chrome, edge, firefox)
*
* @author Alberto Picasso (Software Technical Test Lead)
* @version 1.0
*
*  Explorer keys
*    chrome
*    firefox
*    edge
* */

public class InitialSetup {
    //Class's variables to save tipe of explorer and time to set the implicit wait
    //private WebDriver driver;
    private String explorer;
    private int implicitWatTime;

    //Constructor user as a setter to get explorer and implicitwait
    public InitialSetup(String explorer, int implicitWatTime){
        //this.driver = myDriver;
        this.explorer = explorer;
        this.implicitWatTime = implicitWatTime;
    }

    /*
    * This class configure and return an instance deppending of operating system and used explorer
    * */
    public WebDriver instanceDriver(){

        String os = System.getProperty("os.name");

        if(os.equals("Windows 10")){
            if(this.explorer.equals("chrome")){

                File rootPath = new File("src/Utils/DriversWindows/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", rootPath.getPath());
                return new ChromeDriver();

            }else if(this.explorer.equals("firefox")){

                File rootPath = new File("src/Utils/DriversWindows/geckodriver.exe");
                System.setProperty("webdriver.gecko.driver", rootPath.getPath());
                return new FirefoxDriver();

            }else if(this.explorer.equals("edge")){

                File rootPath = new File("src/Utils/DriversWindows/msedgedriver.exe");
                System.setProperty("webdriver.edge.driver", rootPath.getPath());
                return new EdgeDriver();
            }else{
                return null;
            }
        }

        if(os.equals("Mac OS X")){
            if(this.explorer.equals("chrome")){

                File rootPath = new File("src/Utils/DriversMacOS/chromedriver");
                System.setProperty("webdriver.chrome.driver", rootPath.getPath());
                return new ChromeDriver();

            }else if(this.explorer.equals("firefox")){

                File rootPath = new File("src/Utils/DriversMacOS/geckodriver");
                System.setProperty("webdriver.gecko.driver", rootPath.getPath());
                return new FirefoxDriver();

            }else if(this.explorer.equals("edge")){

                File rootPath = new File("src/Utils/DriversMacOS/msedgedriver");
                System.setProperty("webdriver.edge.driver", rootPath.getPath());
                return new EdgeDriver();
            }else{
                return null;
            }
        }
        return null;
    }
}
