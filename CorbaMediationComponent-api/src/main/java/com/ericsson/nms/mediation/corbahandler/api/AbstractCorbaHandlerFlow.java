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

import com.ericsson.oss.itpf.common.event.handler.EventHandlerContext;
import com.ericsson.oss.itpf.common.event.handler.EventInputHandler;

public abstract class AbstractCorbaHandlerFlow extends AbstractCorbaHandler implements EventInputHandler {

    private ThreadLocal<EventHandlerContext> eventHandlerContext = new ThreadLocal<EventHandlerContext>();

    protected ThreadLocal<String> address = new ThreadLocal<String>();

    protected ThreadLocal<Boolean> secured = new ThreadLocal<Boolean>();

    @Override
    public void init(final EventHandlerContext context) {

        this.eventHandlerContext.set(context);
        final String addressProperty = context.getEventHandlerConfiguration().getStringProperty(ADDRESS);
        if (addressProperty == null) {
            throw new IllegalArgumentException("Network element address must be provided at initialization time.");
        }
        log.debug("Address retrieved: {}", addressProperty);
        this.address.set(addressProperty);
        final String securedProperty = context.getEventHandlerConfiguration().getStringProperty(SECURED);
        this.secured.set((securedProperty != null) ? Boolean.parseBoolean(securedProperty) : false);
        log.debug("Secured value: {}", this.secured.get());
        initCorba(address.get(), secured.get());
    }

    @Override
    public void destroy() {
        this.elementInterfaceProvider.destroy();

    }

    /**
     * Provides a way for reset the NetworkElementProvider (establishing a new
     * connection). Should be used for error handling, when CORBA connection has
     * been lost and should be restarted again from the scratch.
     * 
     */
    protected abstract void resetProvider();

    /**
     * Execute handler specific initialization
     */
    protected abstract void doInit();

    /**
     * @return the eventHandlerContext
     */
    protected EventHandlerContext getEventHandlerContext() {
        return eventHandlerContext.get();
    }
}
