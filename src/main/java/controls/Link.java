package controls;

import driver.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Link extends WebControl {

  public Link(BaseDriver driver, By locator) {
    super(driver, locator);
  }

  public void click() {
    WebElement e = getElement();
    driver.waitElementAndClick(locator, e);
  }

  public String getLinkText() {
    WebElement e = getElement();
    return e.getText();
  }
}
