package uk.gov.ons.ctp.response.party.representation;

import java.util.Map;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class PartyDTO {
    protected int sampleId;
    protected int position;
    protected int size;
    protected String sampleUnitType;
    protected String sampleUnitRef;
    protected String id;
    protected Map<String,String> attributes;
}
