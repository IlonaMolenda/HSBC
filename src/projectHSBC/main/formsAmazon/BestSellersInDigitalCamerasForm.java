package formsAmazon;

import controls.Link;
import driver.BaseDriver;
import org.openqa.selenium.By;

public class BestSellersInDigitalCamerasForm {

  private Link lnk_product;

  public BestSellersInDigitalCamerasForm(BaseDriver driver) {
    lnk_product = new Link(driver, By.xpath("//div[@id = 'zg_centerListWrapper']/div[6]"));
  }

  public Link getLnk_product() {
    return lnk_product;
  }
}
