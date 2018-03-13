package pagesAmazon;

import driver.BaseDriver;
import formsAmazon.CategoryForm;
import pages.BasePage;

public class CategoryPage extends BasePage {

  CategoryForm categoryForm;

  public CategoryPage(BaseDriver driver) {
    super(driver);
    categoryForm = new CategoryForm(driver);
  }

  public BestSellersPage goToBestSellers(){
    categoryForm.getLnk_bestSellers().click();
    return new BestSellersPage(new BaseDriver());
  }
}
