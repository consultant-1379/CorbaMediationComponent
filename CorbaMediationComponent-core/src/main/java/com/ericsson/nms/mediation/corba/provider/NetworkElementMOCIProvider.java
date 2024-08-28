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
package com.ericsson.nms.mediation.corba.provider;

import org.omg.PortableServer.Servant;

import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.BasicConfig.Session;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.ConfigExtended.ConfigurationExtended;

public interface NetworkElementMOCIProvider extends NetworkElementProvider {

    ConfigurationExtended getConfiguration(String elementAddress, boolean secure) throws CorbaMociException;

    Session createSession(ConfigurationExtended configuration, String name, int timeout, boolean readOnly) throws CorbaMociException;

    void removeConfiguration(String elementAddress);

	public Object resolve(final String elementAddress, final boolean secure, Servant servant)
			throws CorbaMociException;
}
