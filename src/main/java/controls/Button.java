package controls;

import driver.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Button extends WebControl {

  public Button(BaseDriver driver, By locator) {
    super(driver, locator);
  }

  public void click() {
    WebElement e = getElement();
    driver.waitElementAndClick(locator, e);
  }
}
