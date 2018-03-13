package formsAmazon;

import controls.Button;
import driver.BaseDriver;
import org.openqa.selenium.By;

public class ShoppingSummaryForm {

  private Button btn_cart;

  public ShoppingSummaryForm(BaseDriver driver) {
    btn_cart = new Button(driver, By.xpath("//a[@id = 'hlb-view-cart-announce']"));
  }

  public Button getBtn_cart() {
    return btn_cart;
  }
}
