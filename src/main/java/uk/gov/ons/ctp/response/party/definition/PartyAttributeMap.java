package uk.gov.ons.ctp.response.party.definition;

import java.util.HashMap;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(PartyAttributeMapAdapter.class)
public class PartyAttributeMap extends HashMap<String, String> {

}
