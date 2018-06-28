package uk.gov.ons.ctp.response.party.definition;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PartyCreationRequestAttributesDTOTest {

  @Test
  public void testEquals() {
    // Given
    PartyCreationRequestAttributesDTO partyCreation1 = new PartyCreationRequestAttributesDTO();
    partyCreation1.setBirthdate("birthdate");
    partyCreation1.setCellNo(123);
    partyCreation1.setCheckletter("checkletter");
    partyCreation1.setCurrency("currency");
    partyCreation1.setEntname1("entname1");
    PartyCreationRequestAttributesDTO partyCreation2 = new PartyCreationRequestAttributesDTO();
    partyCreation2.setBirthdate("birthdate");
    partyCreation2.setCellNo(123);
    partyCreation2.setCheckletter("checkletter");
    partyCreation2.setCurrency("currency");
    partyCreation2.setEntname1("entname1");

    // When
    boolean equal = partyCreation1.equals(partyCreation2);

    // Then
    assertTrue(equal);
  }

  @Test
  public void testNotEquals() {
    // Given
    PartyCreationRequestAttributesDTO partyCreation1 = new PartyCreationRequestAttributesDTO();
    partyCreation1.setBirthdate("birthdate");
    partyCreation1.setCellNo(123);
    partyCreation1.setCheckletter("checkletter");
    partyCreation1.setCurrency("currency");
    partyCreation1.setEntname1("entname1");
    PartyCreationRequestAttributesDTO partyCreation2 = new PartyCreationRequestAttributesDTO();
    partyCreation2.setBirthdate("birthdate");
    partyCreation2.setCellNo(123);
    partyCreation2.setCheckletter("checkletter");
    partyCreation2.setCurrency("currency");

    // When
    boolean equal = partyCreation1.equals(partyCreation2);

    // Then
    assertFalse(equal);
  }
}
