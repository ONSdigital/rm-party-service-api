package uk.gov.ons.ctp.response.party.representation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class PartyDTO {
  private  String id;
  private String sampleUnitType;
  private String sampleUnitRef;
  private Attributes attributes;
}
