package com.maggiedixon.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
  private ContactService service;

  @BeforeEach
  public void setUp() {
    service = new ContactService();
  }

  @Test
  public void testAddContact() {
    Contact c = new Contact("10000", "Maggie", "Dixon", "1234567890", "123 Street");
    assertTrue(service.addContact(c));
    assertNotNull(service.getContact("10000"));
  }
}
