import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  // @Rule
  // public ClearRule clearRule = new ClearRule();

  @Test
  public void Contact_instatiatesCorrectly() {
    Contact testContact = new Contact("Mary","Smith");
    assertEquals(true, testContact instanceof Contact);
  }


} //end of ContactTest
