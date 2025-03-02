package com.maggiedixon.project;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
  private final Map<String, Contact> contacts = new HashMap<>();

  public boolean addContact(Contact contact) {
    if (contact == null || contacts.containsKey(contact.getContactId())) {
      return false;
    }
    contacts.put(contact.getContactId(), contact);
    return true;
  }

  public boolean deleteContact(String contactId) {
    if (contacts.containsKey(contactId)) {
      contacts.remove(contactId);
      return true;
    }
    return false;
  }

  public boolean updateContact(String contactId, String firstName, String lastName,
                               String phone, String address) {
    Contact c = contacts.get(contactId);
    if (c == null) return false;
    try {
      c.setFirstName(firstName);
      c.setLastName(lastName);
      c.setPhone(phone);
      c.setAddress(address);
    } catch (IllegalArgumentException e) {
      return false;
    }
    return true;
  }

  public Contact getContact(String contactId) {
    return contacts.get(contactId);
  }
}
