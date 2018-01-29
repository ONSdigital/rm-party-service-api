
package uk.gov.ons.ctp.response.party.representation;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Java class for Association.
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Association {
  private UUID partyId;
  private List<Enrolment> enrolments;

  @JsonIgnore
  private String sampleUnitRef; // required to cope with a BI response from PartySvc
}
