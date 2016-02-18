import java.util.ArrayList;

public class Contact {
  private String mFirstName;
  private String mLastName;
  private String mBirthMonth;
  private String mContext;
  private static ArrayList<Contact> contactList = new ArrayList<Contact>();
  private ArrayList<PhoneNumber> mPhoneList;
  private int mID;

  public Contact (String firstName, String lastName) {
    mFirstName = firstName;
    contactList.add(this);
    mLastName = lastName;
    mPhoneList = new ArrayList<PhoneNumber>();
    mID = contactList.size();
  }

  public int getID() {
    return mID;
  }

  public static Contact getContactByID (int id) {
    try {
      return contactList.get(id-1);
    } catch (IndexOutOfBoundsException ex) {
      return null;
    }
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

  //Setters and Getters for Contact

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
  //clearRule

  public static void clear() {
    contactList.clear();
  }

} //end of Contact Class
