package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests {

  private final TestBase testBase = new TestBase();

  @Test
  public void testGroupDeletion() throws Exception {
    testBase.app.deletGroupForm();
  }

  public TestBase getTestBase() {
    return testBase;
  }
}
