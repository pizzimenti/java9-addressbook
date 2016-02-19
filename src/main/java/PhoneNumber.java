public class PhoneNumber {
  private String mNumber;
  private String mType;
  private int mID;
  private static int counter = 1;

  public PhoneNumber(String number, String type) {
    mNumber = number;
    mType = type;
    mID = counter;
    counter++;
  }

  public String getPhoneNumber() {
    return mNumber;
  }

  public String getPhoneType() {
    return mType;
  }

  public int getID() {
    return mID;
  }

  public void editPhoneNumber(String newNumber) {
    mNumber = newNumber;
  }

  public static void clear() {
    counter = 1;
  }
}
