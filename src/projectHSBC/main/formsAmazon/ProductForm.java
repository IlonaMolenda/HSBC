package formsAmazon;

import controls.Button;
import controls.DropDown;
import controls.Label;
import driver.BaseDriver;
import org.openqa.selenium.By;

public class ProductForm {

  private Label lbl_productName;
  private Label lbl_productPrice;
  private DropDown dd_quantity;
  private Button btn_addToCart;
  private Button btn_noThanks;

  public ProductForm(BaseDriver driver) {
    lbl_productName = new Label(driver, By.id("productTitle"));
    lbl_productPrice = new Label(driver, By.id("priceblock_ourprice"));
    dd_quantity = new DropDown(driver, By.id("quantity"));
    btn_addToCart = new Button(driver, By.id("add-to-cart-button"));
    btn_noThanks = new Button(driver, By.id("siNoCoverage-announce"));
  }

  public Label getLbl_productName() {
    return lbl_productName;
  }

  public Label getLbl_productPrice() {
    return lbl_productPrice;
  }

  public DropDown getDd_quantity() {
    return dd_quantity;
  }

  public Button getBtn_addToCart() {
    return btn_addToCart;
  }

  public Button getBtn_noThanks() {
    return btn_noThanks;
  }
}
