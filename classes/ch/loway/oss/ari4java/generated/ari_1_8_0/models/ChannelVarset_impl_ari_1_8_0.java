package ch.loway.oss.ari4java.generated.ari_1_8_0.models;

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
 * Channel variable changed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelVarset_impl_ari_1_8_0 extends Event_impl_ari_1_8_0 implements ChannelVarset, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The channel on which the variable was set.

If missing, the variable is a global variable.  */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_8_0.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

  /**  The new value of the variable.  */
  private String value;
 public String getValue() {
   return value;
 }

 @JsonDeserialize( as=String.class )
 public void setValue(String val ) {
   value = val;
 }

  /**  The variable that changed.  */
  private String variable;
 public String getVariable() {
   return variable;
 }

 @JsonDeserialize( as=String.class )
 public void setVariable(String val ) {
   variable = val;
 }

/** No missing signatures from interface */
}

