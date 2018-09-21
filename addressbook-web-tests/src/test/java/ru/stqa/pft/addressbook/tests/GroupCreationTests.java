package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupCreationTests {

  private final TestBase testBase = new TestBase();

  @Test
  public void testGroupCreation() throws Exception {

    testBase.app.gotoGroupPage();
    testBase.app.getGroupHelper().initGroupCreation();
    testBase.app.getGroupHelper().fillGroupForm(new GroupDate("test1", "test2", "test3"));
    testBase.app.getGroupHelper().submitGroupCreation();
    testBase.app.getGroupHelper().returnGroupPage();
  }

  public TestBase getTestBase() {
    return testBase;
  }
}
