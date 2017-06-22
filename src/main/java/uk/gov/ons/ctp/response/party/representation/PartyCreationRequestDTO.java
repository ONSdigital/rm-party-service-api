package uk.gov.ons.ctp.response.party.representation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class PartyCreationRequestDTO {
    protected String sampleUnitType;
    protected String sampleUnitRef;
    protected Map<String,String> attributes;
}
