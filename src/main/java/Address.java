public class Address {
  private String mType;
  private String mStreet;
  private String mCity;
  private String mState;
  private String mZip;

  public Address(String type, String street, String city, String state, String zip) {
    mType = type;
    mStreet = street;
    mCity = city;
    mState = state;
    mZip = zip;
  }

  public String[] getAddress() {
    String[] addressArray = {mType,mStreet,mCity,mState,mZip};
    return addressArray;
  }

}
