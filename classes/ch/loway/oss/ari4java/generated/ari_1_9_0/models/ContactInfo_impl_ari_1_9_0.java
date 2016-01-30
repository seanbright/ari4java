package ch.loway.oss.ari4java.generated.ari_1_9_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Jan 30 13:39:05 CET 2016
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Detailed information about a contact on an endpoint.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ContactInfo_impl_ari_1_9_0 implements ContactInfo, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The Address of Record this contact belongs to.  */
  private String aor;
 public String getAor() {
   return aor;
 }

 @JsonDeserialize( as=String.class )
 public void setAor(String val ) {
   aor = val;
 }

  /**  The current status of the contact.  */
  private String contact_status;
 public String getContact_status() {
   return contact_status;
 }

 @JsonDeserialize( as=String.class )
 public void setContact_status(String val ) {
   contact_status = val;
 }

  /**  Current round trip time, in microseconds, for the contact.  */
  private String roundtrip_usec;
 public String getRoundtrip_usec() {
   return roundtrip_usec;
 }

 @JsonDeserialize( as=String.class )
 public void setRoundtrip_usec(String val ) {
   roundtrip_usec = val;
 }

  /**  The location of the contact.  */
  private String uri;
 public String getUri() {
   return uri;
 }

 @JsonDeserialize( as=String.class )
 public void setUri(String val ) {
   uri = val;
 }

/** No missing signatures from interface */
}

