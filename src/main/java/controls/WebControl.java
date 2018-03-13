package controls;

import driver.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;

public class WebControl {

  BaseDriver driver;
  By locator;

  public WebControl(BaseDriver driver, By locator) {
    this.driver = driver;
    this.locator = locator;
  }

  protected WebElement getElement(){
    WebElement e = null;
    driver.wait(this.locator);
    e = this.driver.getElement(this.locator);
    if(e == null){
      throw new NotFoundException("Element no found" + this.locator);
    }
    return e;
  }

  public void mouseOver() {
    WebElement e = getElement();
    driver.mouseOver(e);
  }
}
