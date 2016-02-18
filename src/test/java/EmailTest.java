import org.junit.*;
import static org.junit.Assert.*;

public class EmailTest {
  @Test
  public void Email_instantiatesCorrectly_true() {
    Email testAddress = new Email("me@gmail.com", "personal");
    assertEquals(true, testAddress instanceof Email);
  }

  @Test
  public void getEmail_getEmail_5035551212() {
    Email testAddress = new Email("me@gmail.com", "personal");
    assertEquals("me@gmail.com", testAddress.getEmail());
  }

  @Test
  public void editEmail_changesEmail_5039993434() {
    Email testAddress = new Email("me@gmail.com", "personal");
    testAddress.editEmail("mememe@gmail.com");
    assertEquals("mememe@gmail.com", testAddress.getEmail());
  }
}
