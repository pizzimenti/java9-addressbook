import org.junit.*;
import static org.junit.Assert.*;

public class AddressTest {
  @Test
  public void Address_instantiatesCorrectly_true() {
    Address testAddress = new Address("home", "123 Main St", "Porland","OR","97201");
    assertEquals(true, testAddress instanceof Address);
  }

  @Test
  public void getAddress_getAddress_arrayOfAddressData() {
    Address testAddress = new Address("home", "123 Main St", "Porland","OR","97201");
    String[] addressArray = {"home", "123 Main St", "Porland","OR","97201"};
    assertEquals(addressArray, testAddress.getAddress());
  }

}
