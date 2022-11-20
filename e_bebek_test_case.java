package e_bebek_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class e_bebek_test_case {


    public static void main(String[] args)throws Exception{

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Actions action = new Actions(driver);

        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();

        System.out.println("E-Bebek sitesine başarıyla giriş yapıldı.");

        Thread.sleep(2000);

        WebElement mainpage = driver.findElement(By.cssSelector("body > app-root > cx-storefront > header > cx-page-layout.header > div > div.row.header-line-1 > div.col-xl-4.col-lg-3.col-6.header-line-1-account.order-2.order-lg-3.order-md-2.order-sm-2 > cx-page-layout > cx-page-slot.EbebekSiteLoginMenu.has-components > eb-header-login > div > div > div > div > div > cx-page-slot > cx-navigation > cx-navigation-ui > nav"));
        mainpage.click();
        System.out.println("Giriş sayfası başarıyla açıldı.");
        Thread.sleep(2000);
        WebElement loginpage0 = driver.findElement(By.id("txtPhoneNumberMobile"));
        loginpage0.click();
        loginpage0.sendKeys("301362241");
        Thread.sleep(2000);
        WebElement loginpage00 = driver.findElement(By.id("btnSubmitLogin"));
        Thread.sleep(2000);
        loginpage00.click();
        Thread.sleep(2000);
        WebElement loginpage1 = driver.findElement(By.id("txtPassword"));
        loginpage1.click();
        loginpage1.sendKeys("Byege123.");
        Thread.sleep(2000);
        WebElement loginpage11 = driver.findElement(By.id("btnSubmitPassword"));
        loginpage11.click();
        Thread.sleep(2000);
        WebElement specialProducts = driver.findElement(By.id("lnkHeaderInterneteOzelNavNode"));
        specialProducts.click();
        Thread.sleep(2000);

        WebElement bucket = driver.findElement(By.cssSelector("body > app-root > cx-storefront > main > cx-page-layout > cx-page-slot.ProductListSlot.has-components.ng-star-inserted > eb-product-list > div > section > div > div > div > div.cx-product-container.row.ng-star-inserted > eb-product-scroll > div > div > eb-product-list-item:nth-child(2) > div > eb-generic-link > a > div > h2 > b"));
        bucket.click();
        Thread.sleep(2000);
        WebElement addTo = driver.findElement(By.id("addToCartBtn"));
        addTo.click();
        Thread.sleep(2000);
        WebElement showIt = driver.findElement(By.id("btnShowCart"));
        showIt.click();
        Thread.sleep(2000);
        WebElement finishIt = driver.findElement(By.cssSelector("#btnGoToShippingAddress > span"));
        finishIt.click();
        Thread.sleep(2000);
        WebElement click = driver.findElement(By.id("chkSameBillingAddress"));
        click.click();
        Thread.sleep(2000);
        WebElement addNewAdress = driver.findElement(By.id("lnkAddDeliveryAddress"));
        addNewAdress.click();
        WebElement name = driver.findElement(By.id("txtFirstName"));
        name.click();
        name.sendKeys("Ege");
        WebElement surname = driver.findElement(By.id("txtLastName"));
        surname.click();
        surname.sendKeys("Ersoy");
        WebElement phoneNumber = driver.findElement(By.id("txtPhoneNumber"));
        phoneNumber.click();
        phoneNumber.sendKeys("5301362241");
        WebElement adressKnowledge = driver.findElement(By.id("txtAddressTitle"));
        adressKnowledge.click();
        adressKnowledge.sendKeys("Evim");
        WebElement city = driver.findElement(By.cssSelector("body > app-root > ngb-modal-window > div > div > eb-address-form > div > div > div > div > div > form > div.modal-body > div:nth-child(3) > div:nth-child(2) > div.d-flex.justify-content-between.address-selection > div.address-selection__city > div > select"));
        action.moveToElement(city).build().perform();
        city.click();
        WebElement citySelect = driver.findElement(By.cssSelector("body > app-root > ngb-modal-window > div > div > eb-address-form > div > div > div > div > div > form > div.modal-body > div:nth-child(3) > div:nth-child(2) > div.d-flex.justify-content-between.address-selection > div.address-selection__city > div > select > option:nth-child(53)"));
        citySelect.click();
        Thread.sleep(2000);
        WebElement county = driver.findElement(By.cssSelector("body > app-root > ngb-modal-window > div > div > eb-address-form > div > div > div > div > div > form > div.modal-body > div:nth-child(3) > div:nth-child(2) > div.d-flex.justify-content-between.address-selection > div.address-selection__county > div > cx-form-errors > p"));
        county.click();
        WebElement countySelect = driver.findElement(By.cssSelector("body > app-root > ngb-modal-window > div > div > eb-address-form > div > div > div > div > div > form > div.modal-body > div:nth-child(3) > div:nth-child(2) > div.d-flex.justify-content-between.address-selection > div.address-selection__county > div > select > option:nth-child(9)"));
        countySelect.click();
        Thread.sleep(2000);
        WebElement neighbor = driver.findElement(By.cssSelector("body > app-root > ngb-modal-window > div > div > eb-address-form > div > div > div > div > div > form > div.modal-body > div:nth-child(3) > div:nth-child(2) > div.address-selection__neighborhood > div > select"));
        neighbor.click();
        WebElement neighborSelect = driver.findElement(By.cssSelector("body > app-root > ngb-modal-window > div > div > eb-address-form > div > div > div > div > div > form > div.modal-body > div:nth-child(3) > div:nth-child(2) > div.address-selection__neighborhood > div > select > option:nth-child(97)"));
        neighborSelect.click();
        WebElement typeAdress = driver.findElement(By.id("txtAddress"));
        typeAdress.click();
        typeAdress.sendKeys("F-47");
        Thread.sleep(2000);
        WebElement saveAdress = driver.findElement(By.id("btnSubmitAddress"));
        saveAdress.click();
        WebElement completeShopping = driver.findElement(By.id("btnGoToPaymentDetails"));
        completeShopping.click();

    }
}
