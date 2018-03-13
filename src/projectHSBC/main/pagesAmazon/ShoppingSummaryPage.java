package pagesAmazon;

import driver.BaseDriver;
import formsAmazon.ShoppingSummaryForm;
import pages.BasePage;

public class ShoppingSummaryPage extends BasePage {

  ShoppingSummaryForm shoppingSummaryForm;

  public ShoppingSummaryPage(BaseDriver driver) {
    super(driver);
    shoppingSummaryForm = new ShoppingSummaryForm(driver);
  }

  public ShoppingCartPage checkShoppingCartDetails(){
    shoppingSummaryForm.getBtn_cart().click();
    return new ShoppingCartPage(new BaseDriver());
  }
}
