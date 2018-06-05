package uk.gov.ons.ctp.response.party.definition;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AssociationTest {

  @Test
  public void testEquals() {
    // Given
    Association association = new Association();
    association.setPartyId("party id");
    Association association2 = new Association();
    association2.setPartyId("party id");

    // When
    boolean equal = association.equals(association2);

    // Then
    assertTrue(equal);
  }
  @Test
  public void testNotEquals() {
    // Given
    Association association = new Association();
    association.setPartyId("party id");
    Association association2 = new Association();

    // When
    boolean equal = association.equals(association2);

    // Then
    assertFalse(equal);
  }

}
