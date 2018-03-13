package formsAmazon;

import controls.Label;
import controls.Link;
import driver.BaseDriver;
import org.openqa.selenium.By;

public class ShoppingCartForm {

  private Link lnk_productName;
  private Label lbl_subtotalPriceSum;

  public ShoppingCartForm(BaseDriver driver) {
    lnk_productName = new Link(driver,
        By.xpath("//span[@class = 'a-size-medium sc-product-title a-text-bold']"));
    lbl_subtotalPriceSum = new Label(driver, By.id("sc-subtotal-amount-activecart"));
  }

  public Link getLnk_productName() {
    return lnk_productName;
  }

  public Label getLbl_subtotalPriceSum() {
    return lbl_subtotalPriceSum;
  }
}
