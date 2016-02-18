public class PhoneNumber {
  private String mNumber;
  private String mType;

  public PhoneNumber(String number, String type) {
    mNumber = number;
    mType = type;
  }

  public String getPhoneNumber() {
    return mNumber;
  }

  public void editPhoneNumber(String newNumber) {
    mNumber = newNumber;
  }
}
