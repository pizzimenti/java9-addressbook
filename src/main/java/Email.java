public class Email {
  private String mAddress;
  private String mType;

  public Email(String address, String type) {
    mAddress = address;
    mType = type;
  }

  public String getEmail() {
    return mAddress;
  }

  public void editEmail(String newAddress) {
    mAddress = newAddress;
  }
}
