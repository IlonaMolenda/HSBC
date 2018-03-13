package pages;

import driver.BaseDriver;

public class BasePage {

  public BaseDriver driver;
  public String title;

  public BasePage(BaseDriver driver, String title) {
    this.driver = driver;
    this.title = title;
    driver.waitTitle(this.title);
  }

  public BasePage(BaseDriver driver) {
    this.driver = driver;
  }

  public float priceAsStringToFloat(String string){
    return Float.parseFloat(string.replace("$", "")
        .replace(",",""));
  }
}
