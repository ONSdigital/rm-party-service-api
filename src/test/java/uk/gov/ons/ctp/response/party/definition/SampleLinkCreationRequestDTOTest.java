package uk.gov.ons.ctp.response.party.definition;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleLinkCreationRequestDTOTest {

  @Test
  public void testEquals() {
    // Given
    SampleLinkCreationRequestDTO sampleLink1 = new SampleLinkCreationRequestDTO();
    sampleLink1.setCollectionExerciseId("test");
    SampleLinkCreationRequestDTO sampleLink2 = new SampleLinkCreationRequestDTO();
    sampleLink2.setCollectionExerciseId("test");

    // When
    boolean equal = sampleLink1.equals(sampleLink2);

    // Then
    assertTrue(equal);
  }

  @Test
  public void testNotEquals() {
    // Given
    SampleLinkCreationRequestDTO sampleLink1 = new SampleLinkCreationRequestDTO();
    sampleLink1.setCollectionExerciseId("test");
    SampleLinkCreationRequestDTO sampleLink2 = new SampleLinkCreationRequestDTO();

    // When
    boolean equal = sampleLink1.equals(sampleLink2);

    // Then
    assertFalse(equal);
  }
}
