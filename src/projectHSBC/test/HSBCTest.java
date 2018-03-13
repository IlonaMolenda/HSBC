import driver.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesAmazon.CategoryPage;
import pagesAmazon.ProductPage;
import pagesAmazon.ShoppingSummaryPage;
import pagesAmazon.ShoppingCartPage;
import testSuit.BaseTest;

public class HSBCTest extends BaseTest {

  CategoryPage categoryPage;
  ProductPage productPage;
  int numberOfPieces = 8;
  ShoppingSummaryPage shoppingSummaryPage;
  ShoppingCartPage shoppingCartPage;


@Test
  public void hsbcTest() {
  navigateToHomePage().moveMouseToDepartments().moveMouseToElectronicComputersOffice()
      .goToCameraPhotoVideoCategory();
  categoryPage = new CategoryPage(new BaseDriver());
  categoryPage.goToBestSellers().goToDigitalCameras().openProductDetails();
  productPage = new ProductPage(new BaseDriver());
  String productName = productPage.getProductName();
  float productPrice = productPage.getProductPrice();
  productPage.selectNumberOfPieces(numberOfPieces);
  int numberOfSelectedPieces = productPage.getNumberOfSelectedPieces();
  productPage.addToCart().dontAcceptProposedOptions();
  float totalPriceOfSelectedPieces = productPage
      .multiplyPriceByNumberOfSelectedPieces(productPrice, numberOfSelectedPieces);
  shoppingSummaryPage = new ShoppingSummaryPage(new BaseDriver());
  shoppingSummaryPage.checkShoppingCartDetails();
  shoppingCartPage = new ShoppingCartPage(new BaseDriver());
  String productNameInShoppingCart = shoppingCartPage.getProductNameAddedToCart();
  float subtotalPriceInShoppingCart = shoppingCartPage.getSubtotalPriceSum();

  Assert.assertTrue(productNameInShoppingCart.contains(productName));
  Assert.assertEquals(totalPriceOfSelectedPieces, subtotalPriceInShoppingCart);
  }
}
