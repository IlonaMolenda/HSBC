package pagesAmazon;

import driver.BaseDriver;
import formsAmazon.ProductForm;
import pages.BasePage;

public class ProductPage extends BasePage {

  ProductForm productForm;

  public ProductPage(BaseDriver driver) {
    super(driver);
    productForm = new ProductForm(driver);
  }

// ORDER OF PRODUCTS IS CHANGING. IS NOT ALWAYS POSSIBLE TO ADD 8 PIECES OF FIFTH PRODUCT
// (SOMETIMES MAX 3 or 5)
  public void selectNumberOfPieces(int numberOfPieces) {
      int numberOfOptions = productForm.getDd_quantity().numberOfOptions();
      if (numberOfPieces < numberOfOptions)
        productForm.getDd_quantity().selectFromDropdown(numberOfPieces - 1);
      else
        productForm.getDd_quantity().selectFromDropdown(numberOfOptions - 1);
  }

  public int getNumberOfSelectedPieces(){
    String selectedItemText = productForm.getDd_quantity().getSelectedItemText().trim();
    return Integer.parseInt(selectedItemText);
  }

  public String getProductName(){
    return productForm.getLbl_productName().getLabelText();
  }

  public float getProductPrice() {
    String priceAsString = productForm.getLbl_productPrice().getLabelText();
    return priceAsStringToFloat(priceAsString);
  }

  public float multiplyPriceByNumberOfSelectedPieces(float price, int numberOfPieces){
    return price * numberOfPieces;
  }

  public ProductPage addToCart(){
    productForm.getBtn_addToCart().click();
    return this;
  }

  public ShoppingSummaryPage dontAcceptProposedOptions(){
    productForm.getBtn_noThanks().click();
    return new ShoppingSummaryPage(new BaseDriver());
  }
}
