package pagesAmazon;

import driver.BaseDriver;
import formsAmazon.HomePageForm;
import pages.BasePage;

public class HomePage extends BasePage {

  private static String title = "Amazon.com: Online Shopping for "
      + "Electronics, Apparel, Computers, Books, DVDs & more";
  HomePageForm homePageForm;

  public HomePage(BaseDriver driver) {
    super(driver, title);
    homePageForm = new HomePageForm(driver);
  }

  public HomePage moveMouseToDepartments(){
    homePageForm.getLbl_departments().mouseOver();
    return this;
  }

  public HomePage moveMouseToElectronicComputersOffice(){
    homePageForm.getLbl_electronicsComputersOffice().mouseOver();
    return this;
  }

  public CategoryPage goToCameraPhotoVideoCategory(){
    homePageForm.getLnk_cameraPhotoVideo().click();
    return new CategoryPage(new BaseDriver());
  }
}
