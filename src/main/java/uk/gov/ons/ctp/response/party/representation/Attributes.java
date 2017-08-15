package uk.gov.ons.ctp.response.party.representation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Attributes {
  public String birthdate;
  public long cellNo;
  public String checkletter;
  public String currency;
  public String entname1;
  public String entname2;
  public String entname3;
  public String entref;
  public String entrepmkr;
  public String formtype;
  public long froempment;
  public String frosic2007;
  public String frosic92;
  public long frotover;
  public String inclexcl;
  public String legalstatus;
  public String name;
  public String region;
  public String runame1;
  public String runame2;
  public String runame3;
  public String ruref;
  public String rusic2007;
  public String rusic92;
  public String seltype;
  public String tradstyle1;
  public String tradstyle2;
  public String tradstyle3;
}
