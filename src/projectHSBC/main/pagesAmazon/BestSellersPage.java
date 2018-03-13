package pagesAmazon;

import driver.BaseDriver;
import formsAmazon.BestSellersForm;
import pages.BasePage;

public class BestSellersPage extends BasePage {

  BestSellersForm bestSellersForm;

  public BestSellersPage(BaseDriver driver) {
    super(driver);
    bestSellersForm = new BestSellersForm(driver);
  }

  public BestSellersInDigitalCamerasPage goToDigitalCameras(){
    bestSellersForm.getLnk_digitalCameras().click();
    return new BestSellersInDigitalCamerasPage(new BaseDriver());
  }
}
