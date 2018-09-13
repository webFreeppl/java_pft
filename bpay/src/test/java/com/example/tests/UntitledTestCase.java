package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://ms.bpay.cz/live/login");
    driver.findElement(By.name("UserName")).click();
    driver.findElement(By.name("Password")).clear();
    driver.findElement(By.name("Password")).sendKeys("0ff!cer0Ne%");
    driver.findElement(By.name("UserName")).clear();
    driver.findElement(By.name("UserName")).sendKeys("useroff");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::button[1]")).click();
    driver.findElement(By.linkText("SEND REMITTANCE")).click();
    driver.findElement(By.id("RemitterSurname")).click();
    driver.findElement(By.id("RemitterSurname")).clear();
    driver.findElement(By.id("RemitterSurname")).sendKeys("NIK");
    driver.findElement(By.id("RemitterName")).click();
    driver.findElement(By.id("RemitterName")).clear();
    driver.findElement(By.id("RemitterName")).sendKeys("LIZA");
    driver.findElement(By.id("RemitterMiddlename")).click();
    driver.findElement(By.id("RemitterMiddlename")).clear();
    driver.findElement(By.id("RemitterMiddlename")).sendKeys("NIKOLAEVNA");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sex'])[1]/following::span[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='FEMALE'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Is pep'])[1]/following::span[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remitter-Politically Exposed Person?'])[2]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Source of in come'])[1]/following::span[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SAVINGS'])[1]/following::li[1]")).click();
    driver.findElement(By.id("RemitterPhone")).click();
    driver.findElement(By.id("RemitterPhone")).clear();
    driver.findElement(By.id("RemitterPhone")).sendKeys("+7 (499) 999-66-99");
    driver.findElement(By.id("RemitterEmail")).click();
    driver.findElement(By.id("RemitterEmail")).clear();
    driver.findElement(By.id("RemitterEmail")).sendKeys("a.zulya@gmail.com");
    driver.findElement(By.id("RemitterAddress")).click();
    driver.findElement(By.id("RemitterAddress")).clear();
    driver.findElement(By.id("RemitterAddress")).sendKeys("MOSCOW, KURSKAYA 13-10 ST");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ID Type'])[1]/following::span[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select...'])[16]/following::li[1]")).click();
    driver.findElement(By.id("RemitterIDNumber")).click();
    driver.findElement(By.id("RemitterIDNumber")).clear();
    driver.findElement(By.id("RemitterIDNumber")).sendKeys("AAAA 555666");
    driver.findElement(By.id("RemitterIDIssuedBy")).click();
    driver.findElement(By.id("RemitterIDIssuedBy")).clear();
    driver.findElement(By.id("RemitterIDIssuedBy")).sendKeys("OVD KURSKAYA");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ID Issued Country'])[1]/following::span[4]")).click();
    driver.findElement(By.id("1a5ec539-e116-4ebd-886c-b87a28264b1b")).click();
    driver.findElement(By.id("RemitterIDIssuedDate")).click();
    driver.findElement(By.id("RemitterIDExpirydate")).click();
    driver.findElement(By.id("RemitterDateOfBirth")).click();
    driver.findElement(By.id("RemitterPlaceOfBirth")).click();
    driver.findElement(By.id("RemitterPlaceOfBirth")).clear();
    driver.findElement(By.id("RemitterPlaceOfBirth")).sendKeys("MOSCOW");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Citizenship'])[1]/following::span[4]")).click();
    driver.findElement(By.id("b31f29fa-8087-4d5a-92df-524f05a15768")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Russian Federation'])[2]/following::div[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Directions'])[1]/following::span[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ukraine (Tyme)'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No data found.'])[2]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No data found.'])[2]/following::input[1]")).sendKeys("uk");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='City'])[1]/following::span[4]")).click();
    driver.findElement(By.id("5e54dd5f-e751-4fc8-8ba6-4518c55298a2")).click();
    driver.findElement(By.id("sourceamount")).click();
    driver.findElement(By.id("sourceamount")).clear();
    driver.findElement(By.id("sourceamount")).sendKeys("10");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Source amount'])[1]/following::span[5]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select...'])[9]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Total amount'])[1]/following::div[3]")).click();
    driver.findElement(By.id("BeneficiarySurname")).click();
    driver.findElement(By.id("BeneficiarySurname")).clear();
    driver.findElement(By.id("BeneficiarySurname")).sendKeys("ANJE");
    driver.findElement(By.id("BeneficiaryName")).click();
    driver.findElement(By.id("BeneficiaryName")).clear();
    driver.findElement(By.id("BeneficiaryName")).sendKeys("ANJELA");
    driver.findElement(By.id("BeneficiaryMiddlename")).click();
    driver.findElement(By.id("BeneficiaryMiddlename")).clear();
    driver.findElement(By.id("BeneficiaryMiddlename")).sendKeys("ALBERTOVICH");
    driver.findElement(By.id("BeneficiaryPhone")).click();
    driver.findElement(By.id("BeneficiaryPhone")).clear();
    driver.findElement(By.id("BeneficiaryPhone")).sendKeys("+7 (495) 123-55-66");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sex'])[2]/following::span[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select...'])[15]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transfer Purpose'])[1]/following::span[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='EDUCATION SUPPORT'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='and Sender ID details. Please attach these documents to remittance.'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Completed'])[1]/following::button[1]")).click();
    driver.findElement(By.id("edit")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Completed'])[1]/following::button[1]")).click();
    driver.findElement(By.id("printorder1")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='OK'])[1]/following::span[1]")).click();
    driver.findElement(By.id("confirm")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Completed'])[2]/following::button[1]")).click();
    driver.findElement(By.id("pay")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Completed'])[3]/following::button[1]")).click();
    driver.findElement(By.linkText("REMITTANCES")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
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
