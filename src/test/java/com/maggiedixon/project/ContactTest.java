package com.maggiedixon.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

  @Test
  public void testContactCreation() {
    Contact c = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
    assertEquals("12345", c.getContactId());
    assertEquals("John", c.getFirstName());
    assertEquals("Doe", c.getLastName());
    assertEquals("1234567890", c.getPhone());
    assertEquals("123 Main St", c.getAddress());
  }
}
