package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
    private final GroupHelper groupHelper = new GroupHelper();
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public void init() {
      groupHelper.wd = new FirefoxDriver();
      groupHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      groupHelper.wd.get("http://localhost/addressbook/");
      login("admin", "secret");
    }

    private void login(String username, String password) {
      groupHelper.wd.findElement(By.name("user")).clear();
      groupHelper.wd.findElement(By.name("user")).sendKeys(username);
      groupHelper.wd.findElement(By.name("pass")).clear();
      groupHelper.wd.findElement(By.name("pass")).sendKeys(password);
      groupHelper.wd.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    }

    public void gotoGroupPage() {
      groupHelper.wd.findElement(By.linkText("groups")).click();
    }

    public void stop() {
      groupHelper.wd.quit();
      String verificationErrorString = verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
      }
    }

    private boolean isElementPresent(By by) {
      try {
        groupHelper.wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        groupHelper.wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    private String closeAlertAndGetItsText() {
      try {
        Alert alert = groupHelper.wd.switchTo().alert();
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

    public void deletGroupForm() {
      gotoGroupPage();
      groupHelper.selectGroup();
      groupHelper.deleteSelectedGroups();
      groupHelper.returnGroupPage();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
