package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Jan 30 13:39:05 CET 2016
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface ContactInfo {

// String getUri
/**********************************************************
 * The location of the contact.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getUri();



// void setRoundtrip_usec String
/**********************************************************
 * Current round trip time, in microseconds, for the contact.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setRoundtrip_usec(String val );



// String getRoundtrip_usec
/**********************************************************
 * Current round trip time, in microseconds, for the contact.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getRoundtrip_usec();



// String getAor
/**********************************************************
 * The Address of Record this contact belongs to.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getAor();



// void setContact_status String
/**********************************************************
 * The current status of the contact.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setContact_status(String val );



// void setUri String
/**********************************************************
 * The location of the contact.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setUri(String val );



// void setAor String
/**********************************************************
 * The Address of Record this contact belongs to.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setAor(String val );



// String getContact_status
/**********************************************************
 * The current status of the contact.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getContact_status();


}
;
