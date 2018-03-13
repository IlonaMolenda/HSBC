package controls;

import driver.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Label extends WebControl {

  public Label(BaseDriver driver, By locator) {
    super(driver, locator);
  }

  public String getLabelText() {
    WebElement e = getElement();
    return driver.getText(locator, e);
  }
}
