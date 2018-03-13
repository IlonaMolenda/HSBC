package testSuit;

import driver.BaseDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pagesAmazon.HomePage;

public class BaseTest {

  private BaseDriver driver;
  private static String chrome = "webdriver.chrome.driver";

  @BeforeSuite
  void beforeSuit(){
    initSystem();
  }


  public void initSystem(){
    System.setProperty(chrome, "./chromedriver.exe");
  }

  @BeforeTest
  public BaseDriver initDriver(){
    driver = new BaseDriver();
    driver.setDriver(new ChromeDriver());
    return driver;
  }

  @AfterTest
  public void afterTestCase(){
    driver.getDriver().quit();
  }

  protected HomePage navigateToHomePage() {
    driver.navigateTo("https://www.amazon.com/");
    driver.getDriver().manage().window().maximize();
    return new HomePage(driver);
  }
}
