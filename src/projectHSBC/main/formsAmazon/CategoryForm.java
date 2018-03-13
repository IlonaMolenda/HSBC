package formsAmazon;

import controls.Link;
import driver.BaseDriver;
import org.openqa.selenium.By;

public class CategoryForm {

  private Link lnk_bestSellers;

  public CategoryForm(BaseDriver driver) {
    lnk_bestSellers = new Link(driver, By.xpath("//span[text() = 'Best Sellers']"));
  }

  public Link getLnk_bestSellers() {
    return lnk_bestSellers;
  }
}
