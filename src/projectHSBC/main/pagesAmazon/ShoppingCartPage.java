package pagesAmazon;

import driver.BaseDriver;
import formsAmazon.ShoppingCartForm;
import pages.BasePage;

public class ShoppingCartPage extends BasePage {

  ShoppingCartForm shoppingCartForm;

  public ShoppingCartPage(BaseDriver driver) {
    super(driver);
    shoppingCartForm = new ShoppingCartForm(driver);
  }

  public String getProductNameAddedToCart(){
    return shoppingCartForm.getLnk_productName().getLinkText();
  }

  public float getSubtotalPriceSum(){
    String subtotalAsString = shoppingCartForm.getLbl_subtotalPriceSum().getLabelText();
    return priceAsStringToFloat(subtotalAsString);
  }
}
