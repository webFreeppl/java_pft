package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupDeletionTests {
  private WebDriver wd;
//  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
//    baseUrl = "https://www.katalon.com/";
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/edit.php");
    authorizationForm();
  }

  private void authorizationForm() {
    authLogin("admin");
    authPassword("secret");
    authButton();
  }

  private void authButton() {
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  private void authPassword(String password) {
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
  }

  private void authLogin(String login) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(login);
  }

  @Test
  public void testGroupDeletion() throws Exception {
    deletGroupForm();
  }

  private void deletGroupForm() {
    wd.findElement(By.linkText("groups")).click();
    wd.findElement(By.name("selected[]")).click();
    wd.findElement(By.name("delete")).click();
    wd.findElement(By.linkText("group page")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
//    wd.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = wd.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
