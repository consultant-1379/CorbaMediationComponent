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
package com.ericsson.nms.mediation.corba.manager;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceIRPOperations;
import com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtended;

/**
 * 
 * @author ekalkur
 * 
 */
public abstract class CorbaPmicManager {

    final private ConcurrentMap<String, _PerformanceIRPOperations> pmCache = new ConcurrentHashMap<>();

    public _PerformanceIRPOperations getPerformanceIrpOperations(String elementAddress, boolean secure) throws CorbaPmicException {
        _PerformanceIRPOperations pmOperations = pmCache.get(elementAddress);
        if (pmOperations == null) {
            pmOperations = createPerformanceIrpOperations(elementAddress, secure);
        }

        return createPerformanceIrpOperations(elementAddress, secure);
    }

    private synchronized _PerformanceIRPOperations createPerformanceIrpOperations(String elementAddress, boolean secure) throws CorbaPmicException {
        _PerformanceIRPOperations pmOperations = createNewPerformanceIrpOperations(elementAddress, secure);
        pmCache.put(elementAddress, pmOperations);
        return pmOperations;
    }

    protected abstract _PerformanceIRPOperations createNewPerformanceIrpOperations(String elementAddress, boolean secure) throws CorbaPmicException;

    public void removePerformanceIrpOperations(String elementAddress, _PerformanceIRPOperations pmOperations) {
        pmCache.remove(elementAddress, pmOperations);
    }

    public synchronized PerformanceMonitoringExtended getPerformanceMonitoringExtended(String elementAddress, boolean secure) throws CorbaPmicException {
        return createNewPerformanceMonitoringExtended(elementAddress, secure);
    }

    protected abstract PerformanceMonitoringExtended createNewPerformanceMonitoringExtended(String elementAddress, boolean secure) throws CorbaPmicException;

    public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperations getPerformanceMonitoringOperations_2_6(String elementAddress, boolean secure)
            throws CorbaPmicException {
        return createPerformanceMonitoringOperations_2_6(elementAddress, secure);
    }

    protected abstract com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperations createPerformanceMonitoringOperations_2_6(String elementAddress,
            boolean secure) throws CorbaPmicException;

    public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceMonitoringOperations getPerformanceMonitoringOperations_4_3(String elementAddress, boolean secure)
            throws CorbaPmicException {
        return createPerformanceMonitoringOperations_4_3(elementAddress, secure);
    }

    protected abstract com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceMonitoringOperations createPerformanceMonitoringOperations_4_3(String elementAddress,
            boolean secure) throws CorbaPmicException;

}
