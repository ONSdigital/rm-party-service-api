
package uk.gov.ons.ctp.response.party.representation;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Java class for Party.
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Party {

  private String id;
  private String sampleUnitRef;
  private String sampleUnitType;
  private List<Association> associations;
  private BusinessSampleUnit attributes;

}
