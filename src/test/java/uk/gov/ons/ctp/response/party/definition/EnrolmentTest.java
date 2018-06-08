package uk.gov.ons.ctp.response.party.definition;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EnrolmentTest {

  @Test
  public void testEquals() {
    // Given
    Enrolment enrolment1 = new Enrolment();
    enrolment1.setEnrolmentStatus("enrolment status");
    enrolment1.setName("name");
    enrolment1.setSurveyId("survey id");
    Enrolment enrolment2 = new Enrolment();
    enrolment2.setEnrolmentStatus("enrolment status");
    enrolment2.setName("name");
    enrolment2.setSurveyId("survey id");

    // When
    boolean equal = enrolment1.equals(enrolment2);

    // Then
    assertTrue(equal);
  }
  @Test
  public void testNotEquals() {
    // Given
    Enrolment enrolment1 = new Enrolment();
    enrolment1.setEnrolmentStatus("enrolment status");
    enrolment1.setName("name");
    enrolment1.setSurveyId("survey id");
    Enrolment enrolment2 = new Enrolment();

    // When
    boolean equal = enrolment1.equals(enrolment2);

    // Then
    assertFalse(equal);
  }

}
