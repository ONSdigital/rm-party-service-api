
package uk.gov.ons.ctp.response.party.representation;

import java.util.List;

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
  private String partyId;
  private List<Enrolment> enrolments;
}
