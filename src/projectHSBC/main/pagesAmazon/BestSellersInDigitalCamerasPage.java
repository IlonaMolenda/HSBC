package pagesAmazon;

import driver.BaseDriver;
import formsAmazon.BestSellersInDigitalCamerasForm;
import pages.BasePage;

public class BestSellersInDigitalCamerasPage extends BasePage {

  BestSellersInDigitalCamerasForm bestSellersInDigitalCamerasForm;

  public BestSellersInDigitalCamerasPage(BaseDriver driver) {
    super(driver);
    bestSellersInDigitalCamerasForm = new BestSellersInDigitalCamerasForm(new BaseDriver());
  }

  public ProductPage openProductDetails(){
    bestSellersInDigitalCamerasForm.getLnk_product().click();
    return new ProductPage(new BaseDriver());
  }
}
