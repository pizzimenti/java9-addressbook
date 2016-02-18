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
  public void all_returnsArrayListofAllContacts_true() {
    Contact testContact1 = new Contact("Mary","Smith");
    Contact testContact2 = new Contact("John","Smith");
    assertTrue(Contact.all().contains(testContact1));
    assertTrue(Contact.all().contains(testContact2));
  }

  @Test
  public void getBirthMonth_addToContactObject_february() {
    Contact testContact = new Contact("Mary","Smith");
    testContact.setBirthMonth("February");
    assertEquals("February", testContact.getBirthMonth());
  }

  @Test
  public void getContext_addToContactObject_family() {
    Contact testContact = new Contact("Mary","Smith");
    testContact.setContext("family");
    assertEquals("family", testContact.getContext());
  }

  @Test
  public void addPhoneNumber_addPhoneNumberToContact_returnsArrayListwithNumber() {
    Contact testContact = new Contact("Mary","Smith");
    PhoneNumber testPhone = new PhoneNumber("503-555-1212", "mobile");
    testContact.addPhoneNumber(testPhone);
    assertTrue(testContact.getPhoneNumbers().contains(testPhone));
  }

} //end of ContactTest
