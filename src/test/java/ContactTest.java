import org.junit.*;
import static org.junit.Assert.*;


public class ContactTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

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

  @Test
  public void getID_returnsIDForSpecificContact_true() {
    Contact testContact1 = new Contact("Mary","Smith");
    Contact testContact2 = new Contact("John","Smith");
    Contact testContact3 = new Contact("Bob","Dole");
    assertEquals(2, testContact2.getID());
  }

  @Test
  public void getContactByID_returnsSpecificContact_true() {
    Contact testContact1 = new Contact("Mary","Smith");
    Contact testContact2 = new Contact("John","Smith");
    Contact testContact3 = new Contact("Bob","Dole");
    assertEquals(testContact2, Contact.getContactByID(2));
  }

  @Test
  public void getPhoneByID_returnsSpecificPhoneNumber_true() {
    PhoneNumber myMobilePhone = new PhoneNumber("503-555-1212", "mobile");
    PhoneNumber testWorkPhone = new PhoneNumber("503-555-9999", "business");
    PhoneNumber testHomePhone = new PhoneNumber("503-555-7777", "home");
    Contact myContactInfo = new Contact("Brad","Smith");
    myContactInfo.addPhoneNumber(testHomePhone);
    myContactInfo.addPhoneNumber(testWorkPhone);
    myContactInfo.addPhoneNumber(myMobilePhone);
    assertEquals(testHomePhone, myContactInfo.getPhoneByID(3));
  }

} //end of ContactTest
