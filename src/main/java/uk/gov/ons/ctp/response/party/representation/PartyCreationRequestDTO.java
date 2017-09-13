package uk.gov.ons.ctp.response.party.representation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public final class PartyCreationRequestDTO {
  public String sampleUnitType;
  public String sampleUnitRef;
  public PartyCreationRequestAttributesDTO attributes;

}
