package ru.stqa.pft.addressbook;

//import java.util.regex.Pattern; не используеться
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select; не используеться

public class AddNewContact {
  private WebDriver wd;
//  private String baseUrl; не используеться
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
//    baseUrl = "https://www.katalon.com/"; не используеться (каталон)
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/edit.php");
    login("admin", "secret");
  }

  private void login(String logName, String password) {
    authLogin(logName);
    authPasswod(password);
  }

  private void authPasswod(String password) {
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
  }

  private void authLogin(String logName) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(logName);
  }

  @Test
  public void testAddNewContact() throws Exception {

    firsrName();
    middleName();
    lastName();
    nickName();
    company();
    title();
    address();
    telHome();
    telMobile();
    telWork();
    telFax();
    email1();
    email2();
    email3();
    homePage();
    birthday();
    anniversary();
    choiceGroup();
    secAddress();
    secHome();
    secNotes();
    submitHome();
    logOut();
  }

  private void logOut() {
    wd.findElement(By.linkText("Logout")).click();
  }

  private void submitHome() {
    wd.findElement(By.linkText("home")).click();
  }

  private void secNotes() {
    wd.findElement(By.name("notes")).click();
    wd.findElement(By.name("notes")).clear();
    wd.findElement(By.name("notes")).sendKeys("DiscriptionNotes");
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]")).click();
  }

  private void secHome() {
    wd.findElement(By.name("phone2")).click();
    wd.findElement(By.name("phone2")).clear();
    wd.findElement(By.name("phone2")).sendKeys("Hometot-je");
  }

  private void secAddress() {
    wd.findElement(By.name("new_group")).click();
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).clear();
    wd.findElement(By.name("address2")).sendKeys("RF, Moscow, Moscowskaya 13-130 st");
  }

  private void choiceGroup() {
    wd.findElement(By.name("new_group")).click();
    new Select(wd.findElement(By.name("new_group"))).selectByVisibleText("test1");
  }

  private void anniversary() {
    wd.findElement(By.name("aday")).click();
    new Select(wd.findElement(By.name("aday"))).selectByVisibleText("22");
    wd.findElement(By.name("amonth")).click();
    new Select(wd.findElement(By.name("amonth"))).selectByVisibleText("March");
    wd.findElement(By.name("ayear")).click();
    wd.findElement(By.name("ayear")).clear();
    wd.findElement(By.name("ayear")).sendKeys("2019");
  }

  private void birthday() {
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText("16");
    wd.findElement(By.name("bmonth")).click();
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText("June");
    wd.findElement(By.name("bmonth")).click();
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).clear();
    wd.findElement(By.name("byear")).sendKeys("1985");
  }

  private void homePage() {
    wd.findElement(By.name("homepage")).click();
    wd.findElement(By.name("homepage")).clear();
    wd.findElement(By.name("homepage")).sendKeys("CountryPaga");
  }

  private void email3() {
    wd.findElement(By.name("email3")).clear();
    wd.findElement(By.name("email3")).sendKeys("test2@mail.ru");
  }

  private void email2() {
    wd.findElement(By.name("email2")).clear();
    wd.findElement(By.name("email2")).sendKeys("test1@mail.ru");
  }

  private void email1() {
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys("test@mail.ru");
  }

  private void telFax() {
    wd.findElement(By.name("fax")).clear();
    wd.findElement(By.name("fax")).sendKeys("No Fax");
  }

  private void telWork() {
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys("+7(499)***-**-**");
  }

  private void telMobile() {
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys("+7(916)***-**-**");
  }

  private void telHome() {
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys("+7(495)***-**-**");
  }

  private void address() {
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys("RF, Moscow, Moscowskaya st");
  }

  private void title() {
    wd.findElement(By.name("title")).click();
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys("#Testing");
  }

  private void company() {
    wd.findElement(By.name("company")).click();
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys("NoCompany");
  }

  private void nickName() {
    wd.findElement(By.name("nickname")).click();
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys("pplppc");
  }

  private void lastName() {
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys("ZakBlack");
  }

  private void middleName() {
    wd.findElement(By.name("middlename")).click();
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys("Zak");
  }

  private void firsrName() {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys("Andre");
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
