package uk.gov.ons.ctp.response.party.definition;

import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class PartyAttributeMapAdapter
  extends XmlAdapter<PartyAttributeMapModeller, PartyAttributeMap>
{ 
  @Override
  public PartyAttributeMap unmarshal(PartyAttributeMapModeller modeller)
  {
    PartyAttributeMap map = new PartyAttributeMap();
    for (PartyAttributeMapModeller.Entry e : modeller.getEntries())
    {
      map.put(e.getKey(), e.getValue());
    }
    return map;
  }

  @Override
  public PartyAttributeMapModeller marshal(PartyAttributeMap map)
  {
    PartyAttributeMapModeller modeller = new PartyAttributeMapModeller();
    for (Map.Entry<String,String> entry : map.entrySet())
    {
      PartyAttributeMapModeller.Entry e = new PartyAttributeMapModeller.Entry();
      e.setKey(entry.getKey());
      e.setValue(entry.getValue());
      modeller.getEntries().add(e);
    }
    return modeller;
  }
}