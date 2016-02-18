import org.junit.*;
import static org.junit.Assert.*;

public class PhoneNumberTest {
  @Test
  public void PhoneNumber_instantiatesCorrectly_true() {
    PhoneNumber testPhone = new PhoneNumber("503-555-1212", "mobile");
    assertEquals(true, testPhone instanceof PhoneNumber);
  }
}
