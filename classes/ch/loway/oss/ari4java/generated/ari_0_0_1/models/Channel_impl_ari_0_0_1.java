package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;

/**********************************************************
 * A specific communication connection between Asterisk and an Endpoint.
 * 
 * Defined in file: channels.json
 *********************************************************/

public class Channel_impl_ari_0_0_1 implements Channel, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private String accountcode;
 public String getAccountcode() {
   return accountcode;
 }

 @JsonDeserialize( as=String.class )
 public void setAccountcode(String val ) {
   accountcode = val;
 }

  /**    */
  private CallerID caller;
 public CallerID getCaller() {
   return caller;
 }

 @JsonDeserialize( as=CallerID_impl_ari_0_0_1.class )
 public void setCaller(CallerID val ) {
   caller = val;
 }

  /**    */
  private CallerID connected;
 public CallerID getConnected() {
   return connected;
 }

 @JsonDeserialize( as=CallerID_impl_ari_0_0_1.class )
 public void setConnected(CallerID val ) {
   connected = val;
 }

  /**  Timestamp when channel was created  */
  private Date creationtime;
 public Date getCreationtime() {
   return creationtime;
 }

 @JsonDeserialize( as=Date.class )
 public void setCreationtime(Date val ) {
   creationtime = val;
 }

  /**  Current location in the dialplan  */
  private DialplanCEP dialplan;
 public DialplanCEP getDialplan() {
   return dialplan;
 }

 @JsonDeserialize( as=DialplanCEP_impl_ari_0_0_1.class )
 public void setDialplan(DialplanCEP val ) {
   dialplan = val;
 }

  /**  Unique identifier of the channel.

This is the same as the Uniqueid field in AMI.  */
  private String id;
 public String getId() {
   return id;
 }

 @JsonDeserialize( as=String.class )
 public void setId(String val ) {
   id = val;
 }

  /**  Name of the channel (i.e. SIP/foo-0000a7e3)  */
  private String name;
 public String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(String val ) {
   name = val;
 }

  /**    */
  private String state;
 public String getState() {
   return state;
 }

 @JsonDeserialize( as=String.class )
 public void setState(String val ) {
   state = val;
 }

}

