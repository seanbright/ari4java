package ch.loway.oss.ari4java.generated.ari_0_0_1.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Jan 30 13:39:05 CET 2016
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.HttpParam;
import ch.loway.oss.ari4java.tools.HttpResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_0_0_1.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionEvents_impl_ari_0_0_1 extends BaseAriAction  implements ActionEvents {
/**********************************************************
 * Events from Asterisk to applications
 * 
 * WebSocket connection for events.
 *********************************************************/
private void buildEventWebsocket(String app) {
reset();
url = "/events";
method = "GET";
lParamQuery.add( HttpParam.build( "app", app) );
wsUpgrade = true;
}

@Override
public Message eventWebsocket(String app) throws RestException {
throw new RestException("No synchronous operation on WebSocket");
}

@Override
public void eventWebsocket(String app, AriCallback<Message> callback) {
buildEventWebsocket(app);
httpActionAsync(callback, Message_impl_ari_0_0_1.class);
}

/**********************************************************
 * Generate a user event.
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void userEvent(String eventName, String application, String source, Map<String,String> variables) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void eventWebsocket(String app, boolean subscribeAll, AriCallback<Message> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void userEvent(String eventName, String application, String source, Map<String,String> variables, AriCallback<Void> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * WebSocket connection for events.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public Message eventWebsocket(String app, boolean subscribeAll) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

};

