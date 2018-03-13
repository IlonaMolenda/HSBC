package formsAmazon;

import controls.Label;
import controls.Link;
import driver.BaseDriver;
import org.openqa.selenium.By;

public class HomePageForm {

  private Label lbl_departments;
  private Label lbl_electronicsComputersOffice;
  private Link lnk_cameraPhotoVideo;

  public HomePageForm(BaseDriver driver) {
  lbl_departments = new Label(driver,
      By.xpath("//a[@id = 'nav-link-shopall']/span[@class = 'nav-line-2']"));
  lbl_electronicsComputersOffice = new Label(driver,
      By.xpath("//span[contains(@data-nav-panelkey, 'Electronics')]"));
  lnk_cameraPhotoVideo = new Link(driver, By.xpath("//span[text() = 'Camera, Photo & Video']"));
  }

  public Label getLbl_departments() {
    return lbl_departments;
  }

  public Label getLbl_electronicsComputersOffice() {
    return lbl_electronicsComputersOffice;
  }

  public Link getLnk_cameraPhotoVideo() {
    return lnk_cameraPhotoVideo;
  }
}
