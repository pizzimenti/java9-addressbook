import org.junit.*;
import static org.junit.Assert.*;

public class PhoneNumberTest {
  @Test
  public void PhoneNumber_instantiatesCorrectly_true() {
    PhoneNumber testPhone = new PhoneNumber("503-555-1212", "mobile");
    assertEquals(true, testPhone instanceof PhoneNumber);
  }

  @Test
  public void getPhoneNumber_getPhoneNumber_5035551212() {
    PhoneNumber testPhone = new PhoneNumber("503-555-1212", "mobile");
    assertEquals("503-555-1212", testPhone.getPhoneNumber());
  }

  @Test
  public void editPhoneNumber_changesPhoneNumber_5039993434() {
    PhoneNumber testPhone = new PhoneNumber("503-555-1212", "mobile");
    testPhone.editPhoneNumber("503-999-3434");
    assertEquals("503-999-3434", testPhone.getPhoneNumber());
  }
}
