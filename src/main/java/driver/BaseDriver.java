package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseDriver {

  private static WebDriver driver;

  public BaseDriver() {
  }

  public String getTitle() {
    return driver.getTitle();
  }

  public WebElement getElement(By locator) {
    return driver.findElement(locator);
  }

  public WebDriver getDriver() {
    return driver;
  }

  public void navigateTo(String url) {
    driver.navigate().to(url);
  }

  public void wait(By locator) {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  }

  public void waitElementAndClick(By locator, WebElement element) {
      WebDriverWait wait = new WebDriverWait(driver, 7);
      wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
      wait.until(ExpectedConditions.elementToBeClickable(element));
      element.click();
  }

  public void waitTitle(String title) {
      WebDriverWait wait = new WebDriverWait(driver, 15);
      wait.until(ExpectedConditions.titleContains(title));
  }

  public String getText(By locator, WebElement element) {
    String text = "";
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
      text = element.getText();
    return text;
  }

  public void mouseOver(WebElement element) {
    Actions actObj = new Actions(getDriver());
    actObj.moveToElement(element).build().perform();
  }

  public void setDriver(WebDriver driver) {
    BaseDriver.driver = driver;
  }
}
