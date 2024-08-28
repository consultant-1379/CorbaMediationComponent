/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.nms.mediation.corbahandler.api;

import com.ericsson.nms.mediation.corba.provider.NetworkElementProvider;
import com.ericsson.nms.mediation.corba.provider.visibroker.moci.VisibrokerMociProvider;

public class NetworkElementMOCIProviderFactory implements NetworkElementProviderFactory {
	
	@Override
	public NetworkElementProvider getNetworkElementInterfaceProvider(){
		return new VisibrokerMociProvider();
	}
}
