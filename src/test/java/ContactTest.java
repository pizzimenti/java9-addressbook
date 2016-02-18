import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  // @Rule
  // public ClearRule clearRule = new ClearRule();

  @Test
  public void Contact_instantiatesCorrectly_true() {
    Contact testContact = new Contact("Mary","Smith");
    assertEquals(true, testContact instanceof Contact);
  }

  @Test
  public void Contact_returnsContactName_MarySmith() {
    Contact testContact = new Contact("Mary","Smith");
    assertEquals("Mary Smith", testContact.fullName());
  }

  @Test
  public void getBirthMonth_addToContactObject_february() {
    Contact testContact = new Contact("Mary","Smith");
    testContact.setBirthMonth("February");
    assertEquals("February", testContact.getBirthMonth());
  }

  @Test
  public void all_returnsArrayListofAllContacts_true() {
    Contact testContact1 = new Contact("Mary","Smith");
    Contact testContact2 = new Contact("John","Smith");
    assertTrue(Contact.all().contains(testContact1));
    assertTrue(Contact.all().contains(testContact2));
  }

} //end of ContactTest
