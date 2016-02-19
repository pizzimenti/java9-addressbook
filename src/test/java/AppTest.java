import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.fluentlenium.core.filter.FilterConstructor.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver(true);
  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Rule
  public ClearRule clearRule = new ClearRule();


  //Integration testing
  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Address Book");
  }

  @Test
  public void addContactTest() {
    goTo("http://localhost:4567");
    fill("#firstName").with("Addy");
    fill("#lastName").with("Books");
    submit("#addContact");
    assertThat(pageSource()).contains("Addy Books");
  }

  @Test
  public void addMultipleContactTest() {
    goTo("http://localhost:4567");
    fill("#firstName").with("Addy");
    fill("#lastName").with("Books");
    submit("#addContact");
    fill("#firstName").with("Baby");
    fill("#lastName").with("Boy");
    submit("#addContact");
    assertThat(pageSource()).contains("Addy Books");
    assertThat(pageSource()).contains("Baby Boy");
  }
}
