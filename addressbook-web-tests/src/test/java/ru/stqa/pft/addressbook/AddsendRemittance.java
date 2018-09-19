package ru.stqa.pft.addressbook;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class AddsendRemittance {
  private WebDriver wd;
//  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
//    baseUrl = "https://www.katalon.com/";
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAddsendRemittance() throws Exception {
    wd.get("http://ms.bpremit.com/login");
    wd.findElement(By.name("UserName")).click();
    wd.findElement(By.name("UserName")).clear();
    wd.findElement(By.name("UserName")).sendKeys("bpr.universal");
    wd.findElement(By.name("Password")).clear();
    wd.findElement(By.name("Password")).sendKeys("%Qazqwe153%@");
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::button[1]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Replenishment'])[1]/following::div[4]")).click();
    wd.findElement(By.id("RemitterSurname")).click();
    wd.findElement(By.id("RemitterSurname")).clear();
    wd.findElement(By.id("RemitterSurname")).sendKeys("VENIK");
    wd.findElement(By.id("RemitterName")).click();
    wd.findElement(By.id("RemitterName")).clear();
    wd.findElement(By.id("RemitterName")).sendKeys("ALISSA");
    wd.findElement(By.id("RemitterMiddlename")).click();
    wd.findElement(By.id("RemitterMiddlename")).clear();
    wd.findElement(By.id("RemitterMiddlename")).sendKeys("VALEREVNA");
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sex'])[1]/following::span[4]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='FEMALE'])[1]/following::li[1]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Is pep'])[1]/following::span[4]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remitter-Politically Exposed Person?'])[2]/following::li[1]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Source of in come'])[1]/following::span[4]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SAVINGS'])[1]/following::li[1]")).click();
    wd.findElement(By.id("RemitterPhone")).click();
    wd.findElement(By.id("RemitterPhone")).clear();
    wd.findElement(By.id("RemitterPhone")).sendKeys("+7 (999) 656-65-65");
    wd.findElement(By.id("RemitterEmail")).click();
    wd.findElement(By.id("RemitterEmail")).clear();
    wd.findElement(By.id("RemitterEmail")).sendKeys("a.venik@mail.ru");
    wd.findElement(By.id("RemitterAddress")).click();
    wd.findElement(By.id("RemitterAddress")).clear();
    wd.findElement(By.id("RemitterAddress")).sendKeys("RF, MOSCOW, LYUBLINSKAYA 70-56 ST.");
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ID Type'])[1]/following::span[4]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select...'])[18]/following::li[1]")).click();
    wd.findElement(By.id("RemitterIDNumber")).click();
    wd.findElement(By.id("RemitterIDNumber")).clear();
    wd.findElement(By.id("RemitterIDNumber")).sendKeys("AAAA 654654");
    wd.findElement(By.id("RemitterIDIssuedBy")).click();
    wd.findElement(By.id("RemitterIDIssuedBy")).clear();
    wd.findElement(By.id("RemitterIDIssuedBy")).sendKeys("OVD MOSCOW");
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ID Issued Country'])[1]/following::span[4]")).click();
//    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ID Issued Country'])[1]/following::span[4]")).click();
//    wd.findElement(By.id("5e8768a3-9c0d-48fa-9646-d0fe54b2cca8")).click();
    wd.findElement(By.id("RemitterIDIssuedDate")).click();
    wd.findElement(By.id("RemitterIDExpirydate")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of Birth'])[1]/following::span[1]")).click();
    wd.findElement(By.id("RemitterDateOfBirth")).click();
    wd.findElement(By.id("RemitterPlaceOfBirth")).click();
    wd.findElement(By.id("RemitterPlaceOfBirth")).clear();
    wd.findElement(By.id("RemitterPlaceOfBirth")).sendKeys("MOSCOW");
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Citizenship'])[1]/following::span[4]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Citizenship'])[1]/following::span[4]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Directions'])[1]/following::span[4]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Russian Federation (CONTACT)'])[1]/following::li[1]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='City'])[1]/following::span[4]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select...'])[7]/following::li[1]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Total amount'])[1]/following::div[3]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Source amount'])[1]/following::span[5]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='GBP'])[2]/following::li[1]")).click();
    wd.findElement(By.id("sourceamount")).click();
    wd.findElement(By.id("sourceamount")).click();
    wd.findElement(By.id("sourceamount")).clear();
    wd.findElement(By.id("sourceamount")).sendKeys("10");
    wd.findElement(By.id("BeneficiarySurname")).click();
    wd.findElement(By.id("BeneficiarySurname")).clear();
    wd.findElement(By.id("BeneficiarySurname")).sendKeys("BOLIK");
    wd.findElement(By.id("BeneficiaryName")).click();
    wd.findElement(By.id("BeneficiaryName")).clear();
    wd.findElement(By.id("BeneficiaryName")).sendKeys("NATALIYA");
    wd.findElement(By.id("BeneficiaryPhone")).click();
    wd.findElement(By.id("BeneficiaryPhone")).clear();
    wd.findElement(By.id("BeneficiaryPhone")).sendKeys("+7 (969) 989-98-98");
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sex'])[2]/following::span[4]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='FEMALE'])[2]/following::li[1]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transfer Purpose'])[1]/following::span[4]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='EDUCATION SUPPORT'])[1]/following::li[1]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='and Sender ID details. Please attach these documents to remittance.'])[1]/following::button[1]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Completed'])[1]/following::button[1]")).click();
    wd.findElement(By.id("printorder1")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No data found.'])[10]/following::span[1]")).click();
    wd.findElement(By.id("confirm")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Completed'])[1]/following::button[1]")).click();
    wd.findElement(By.id("pay")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Completed'])[2]/following::button[1]")).click();
    wd.findElement(By.id("createRemittanceId")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
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
