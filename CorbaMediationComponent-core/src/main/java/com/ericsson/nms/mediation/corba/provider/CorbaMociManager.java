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

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.ConfigExtended.ConfigurationExtended;

public abstract class CorbaMociManager {

    final private ConcurrentMap<String, ConfigurationExtended> configurationCache = new ConcurrentHashMap<>();

    final private ConcurrentMap<String, Lock> configurationLocks = new ConcurrentHashMap<>();

    public ConfigurationExtended getConfiguration(final String elementAddress, final boolean secure) throws CorbaMociException {

        ConfigurationExtended configuration = configurationCache.get(elementAddress);
        if (configuration == null) {
            configuration = createConfiguration(elementAddress, secure);
        }
        return configuration;
    }

    public ConfigurationExtended createConfiguration(final String elementAddress, final boolean secure) throws CorbaMociException {

        final Lock configurationLock = getLockToCreateConfig(elementAddress);
        configurationLock.lock();
        try {
            ConfigurationExtended configuration = configurationCache.get(elementAddress);
            if (configuration == null) {
                configuration = createConfigurationObject(elementAddress, secure);
                final ConfigurationExtended previous = configurationCache.putIfAbsent(elementAddress, configuration);

                if (previous != null) {
                    configuration = previous;
                }
            }
            return configuration;
        } finally {
            configurationLock.unlock();
        }
    }

    private Lock getLockToCreateConfig(final String elementAddress) throws CorbaMociException {

        Lock lock = configurationLocks.get(elementAddress);
        if (lock == null) {
            lock = new ReentrantLock();
            final Lock previous = configurationLocks.putIfAbsent(elementAddress, lock);

            if (previous != null) {
                lock = previous;
            }
        }
        return lock;
    }

    public abstract ConfigurationExtended createConfigurationObject(String elementAddress, final boolean secure) throws CorbaMociException;

    public void removeConfiguration(final String elementAddress) {

        configurationCache.remove(elementAddress);
    }

}
