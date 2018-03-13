package formsAmazon;

import controls.Link;
import driver.BaseDriver;
import org.openqa.selenium.By;

public class BestSellersForm {

  private Link lnk_digitalCameras;

  public BestSellersForm(BaseDriver driver) {
    lnk_digitalCameras = new Link(driver, By
        .xpath("//div[@id = 'zg_left_col2']//a[text() = 'Digital Cameras']"));
  }

  public Link getLnk_digitalCameras() {
    return lnk_digitalCameras;
  }
}
