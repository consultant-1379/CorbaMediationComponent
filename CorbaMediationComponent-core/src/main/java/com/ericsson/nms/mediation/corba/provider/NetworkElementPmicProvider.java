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

import com.ericsson.nms.mediation.corba.manager.CorbaPmicException;
import com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceIRPOperations;
import com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtended;

/**
 * 
 * @author ekalkur
 * 
 */
public interface NetworkElementPmicProvider extends NetworkElementProvider {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperations getPerformanceMonitoringOperations_2_6(String elementAddress, boolean secure)
            throws CorbaPmicException;

    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceMonitoringOperations getPerformanceMonitoringOperations_4_3(String elementAddress, boolean secure)
            throws CorbaPmicException;

    _PerformanceIRPOperations getPerformanceIrpOperations(String elementAddress, boolean secure) throws CorbaPmicException;

    void removePerformanceIrpOperations(String elementAddress, _PerformanceIRPOperations pmIrpOperations);

    PerformanceMonitoringExtended getPerformanceMonitoringExtended(String elementAddress, boolean secure) throws CorbaPmicException;
}
