import java.util.ArrayList;

public class Contact {
  private String mFirstName;
  private String mLastName;
  private String mBirthMonth;
  private String mContext;
  private static ArrayList<Contact> contactList = new ArrayList<Contact>();
  private ArrayList<PhoneNumber> mPhoneList;
  private ArrayList<Email> mEmailList;
  private ArrayList<Address> mAddressList;
  private int mID;

  public Contact (String firstName, String lastName) {
    mFirstName = firstName;
    contactList.add(this);
    mLastName = lastName;
    mPhoneList = new ArrayList<PhoneNumber>();
    mEmailList = new ArrayList<Email>();
    mAddressList = new ArrayList<Address>();
    mID = contactList.size();
  }

  public int getID() {
    return mID;
  }

  public static ArrayList<Contact> all() {
    return contactList;
  }

  public static Contact getContactByID (int id) {
    try {
      return contactList.get(id-1);
    } catch (IndexOutOfBoundsException ex) {
      return null;
    }
  }

  // Phone number handling
  public void addPhoneNumber(PhoneNumber newPhone) {
    mPhoneList.add(newPhone);
  }

  public ArrayList<PhoneNumber> getPhoneNumbers() {
    return mPhoneList;
  }

  public PhoneNumber getPhoneByID(int id){
    for ( PhoneNumber numberObject : mPhoneList) {
      if( id == numberObject.getID()) {
        return numberObject;
      }
    }
    return null;
  }
  //EMail handling
  public void addEmail(Email newEmail) {
    mEmailList.add(newEmail);
  }

  public ArrayList<Email> getEmails() {
    return mEmailList;
  }

  public Email getEmailByID(int id){
    for ( Email emailObject : mEmailList) {
      if( id == emailObject.getID()) {
        return emailObject;
      }
    }
    return null;
  }

  //Address handling
  public void addAddress(Address newAddress) {
    mAddressList.add(newAddress);
  }

  public ArrayList<Address> getAddresss() {
    return mAddressList;
  }

  public Address getAddressByID(int id){
    for ( Address addressObject : mAddressList) {
      if( id == addressObject.getID()) {
        return addressObject;
      }
    }
    return null;
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
