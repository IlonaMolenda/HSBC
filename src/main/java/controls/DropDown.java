package controls;

import driver.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends WebControl {

  public DropDown(BaseDriver driver, By locator) {
    super(driver, locator);
  }

  public void selectFromDropdown(int index) {
    WebElement e = getElement();
    new Select(e).selectByIndex(index);
  }

  public int numberOfOptions(){
    WebElement e = getElement();
    return new Select(e).getOptions().size();
  }

  public String getSelectedItemText() {
    WebElement e = getElement();
    Select select = new Select(e);
    WebElement option = select.getFirstSelectedOption();
    return option.getText();
  }
}
