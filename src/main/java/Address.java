public class Address {
  private String mType;
  private String mStreet;
  private String mCity;
  private String mState;
  private String mZip;
  private int mID;
  private static int counter = 1;

  public Address(String type, String street, String city, String state, String zip) {
    mType = type;
    mStreet = street;
    mCity = city;
    mState = state;
    mZip = zip;
    mID = counter;
    counter++;
  }

  public String[] getAddress() {
    String[] addressArray = {mType,mStreet,mCity,mState,mZip};
    return addressArray;
  }

  public int getID() {
    return mID;
  }

  public static void clear() {
    counter = 1;
  }

}
