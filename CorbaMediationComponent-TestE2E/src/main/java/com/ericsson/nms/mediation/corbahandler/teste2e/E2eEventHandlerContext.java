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
package com.ericsson.nms.mediation.corbahandler.teste2e;

import java.util.Collection;
import java.util.Map;

import com.ericsson.oss.itpf.common.config.Configuration;
import com.ericsson.oss.itpf.common.event.ControlEvent;
import com.ericsson.oss.itpf.common.event.handler.EventHandlerContext;
import com.ericsson.oss.itpf.common.event.handler.EventSubscriber;

public class E2eEventHandlerContext implements EventHandlerContext {

    private String ipAddress;

    private final Configuration configuration = new Configuration() {

        @Override
        public String getStringProperty(final String propertyName) {
            if (propertyName.equals("ipAddress")) {
                return ipAddress;
            } else if (propertyName.equals("secured")) {
                return "false";
            }
            return null;
        }

        @Override
        public Integer getIntProperty(final String propertyName) {

            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Boolean getBooleanProperty(final String propertyName) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Map<String, Object> getAllProperties() {
            // TODO Auto-generated method stub
            return null;
        }
    };

    public E2eEventHandlerContext(final String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ericsson.oss.itpf.common.event.handler.EventHandlerContext#
     * getEventHandlerConfiguration()
     */
    @Override
    public Configuration getEventHandlerConfiguration() {
        // TODO Auto-generated method stub
        return configuration;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ericsson.oss.itpf.common.event.handler.EventHandlerContext#
     * getEventSubscribers()
     */
    @Override
    public Collection<EventSubscriber> getEventSubscribers() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ericsson.oss.itpf.common.event.handler.EventHandlerContext#
     * sendControlEvent(com.ericsson.oss.itpf.common.event.ControlEvent)
     */
    @Override
    public void sendControlEvent(final ControlEvent controlEvent) {
        // TODO Auto-generated method stub

    }

}
