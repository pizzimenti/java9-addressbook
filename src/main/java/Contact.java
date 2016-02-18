import java.util.ArrayList;

public class Contact {
  private String mFirstName;
  private String mLastName;
  private String mBirthMonth;
  private String mContext;
  private static ArrayList<Contact> contactList = new ArrayList<Contact>();
  private ArrayList<PhoneNumber> mPhoneList;

  public Contact (String firstName, String lastName) {
    mFirstName = firstName;
    contactList.add(this);
    mLastName = lastName;
    mPhoneList = new ArrayList<PhoneNumber>();
  }

  public static ArrayList<Contact> all() {
    return contactList;
  }

  public void addPhoneNumber(PhoneNumber newPhone) {
    mPhoneList.add(newPhone);
  }

  public ArrayList<PhoneNumber> getPhoneNumbers() {
    return mPhoneList;
  }

  //Setters and Getters

  public String fullName() {
    return mFirstName + " " + mLastName;
  }

  public void setBirthMonth(String month) {
    mBirthMonth = month;
  }

  public String getBirthMonth() {
    return mBirthMonth;
  }

  public void setContext(String context) {
    mContext = context;
  }

  public String getContext() {
    return mContext;
  }

} //end of Contact Class
