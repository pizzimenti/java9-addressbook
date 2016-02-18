public class Email {
  private String mAddress;
  private String mType;
  private int mID;
  private static int counter = 1;

  public Email(String address, String type) {
    mAddress = address;
    mType = type;
    mID = counter;
    counter++;
  }

  public String getEmail() {
    return mAddress;
  }

  public int getID() {
    return mID;
  }

  public void editEmail(String newAddress) {
    mAddress = newAddress;
  }

  public static void clear() {
    counter = 1;
  }
}
