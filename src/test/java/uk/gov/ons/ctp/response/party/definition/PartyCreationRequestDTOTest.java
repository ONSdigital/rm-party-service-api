package uk.gov.ons.ctp.response.party.definition;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PartyCreationRequestDTOTest {

  @Test
  public void testEquals() {
    // Given
    PartyCreationRequestDTO partyCreationRequest1 = new PartyCreationRequestDTO();
    partyCreationRequest1.setAttributes(new PartyCreationRequestAttributesDTO());
    partyCreationRequest1.setSampleSummaryId("sample summary");
    partyCreationRequest1.setSampleUnitRef("unit ref");
    partyCreationRequest1.setSampleUnitType("unit type");
    PartyCreationRequestDTO partyCreationRequest2 = new PartyCreationRequestDTO();
    partyCreationRequest2.setAttributes(new PartyCreationRequestAttributesDTO());
    partyCreationRequest2.setSampleSummaryId("sample summary");
    partyCreationRequest2.setSampleUnitRef("unit ref");
    partyCreationRequest2.setSampleUnitType("unit type");

    // When
    boolean equal = partyCreationRequest1.equals(partyCreationRequest2);

    // Then
    assertTrue(equal);
  }

  @Test
  public void testNotEquals() {
    // Given
    PartyCreationRequestDTO partyCreationRequest1 = new PartyCreationRequestDTO();
    partyCreationRequest1.setAttributes(new PartyCreationRequestAttributesDTO());
    partyCreationRequest1.setSampleSummaryId("sample summary");
    partyCreationRequest1.setSampleUnitRef("unit ref");
    partyCreationRequest1.setSampleUnitType("unit type");
    PartyCreationRequestDTO partyCreationRequest2 = new PartyCreationRequestDTO();
    partyCreationRequest2.setAttributes(new PartyCreationRequestAttributesDTO());
    partyCreationRequest2.setSampleSummaryId("sample summary");
    partyCreationRequest2.setSampleUnitRef("unit ref");

    // When
    boolean equal = partyCreationRequest1.equals(partyCreationRequest2);

    // Then
    assertFalse(equal);
  }
}
