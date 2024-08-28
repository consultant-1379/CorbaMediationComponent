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
package com.ericsson.nms.mediation.corba.provider.visibroker.pmic;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;

import com.ericsson.nms.mediation.corba.manager.CorbaPmicException;
import com.ericsson.nms.mediation.corba.manager.CorbaPmicManager;
import com.ericsson.nms.mediation.corba.provider.NetworkElementPmicProvider;
import com.ericsson.nms.mediation.corba.provider.utils.HttpIORClient;
import com.ericsson.nms.mediation.corba.provider.visibroker.common.VisibrokerProvider;
import com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.*;
import com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtended;
import com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtendedHelper;

/**
 * Visibroker implementation for PM Notifications.
 * 
 * @author ekalkur
 * 
 */
public class VisibrokerPmicProvider extends CorbaPmicManager implements NetworkElementPmicProvider {
    private HttpIORClient iorClient;
    private VisibrokerProvider provider;

    static final NameComponent[] pmNotificationsNamingPath = { new NameComponent("CelloPmNotifications", "") };
    static final NameComponent[] pmNamingPath = { new NameComponent("CelloPerformanceMonitoring", "") };
    static final NameComponent[] pmNamingPath_2_6 = { new NameComponent("celloPMOperationsName", "") };

    public VisibrokerPmicProvider() {
        super();
        iorClient = new HttpIORClient();
        provider = VisibrokerProvider.VISIBROKER;
    }

    @Override
    public void destroy() {
        provider.destroy();
    }

    @Override
    public void init(String elementAddress, boolean secured) {
        provider.init(elementAddress, secured);
    }

    public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperations createPerformanceMonitoringOperations_2_6(String elementAddress,
            boolean secure) throws CorbaPmicException {

        try {
            final ORB orb = provider.getORB(elementAddress, secure);
            final org.omg.CORBA.Object tempObj = orb.string_to_object(iorClient.getIOR(elementAddress));
            final NamingContext ncRoot = NamingContextHelper.narrow(tempObj);
            final org.omg.CORBA.Object obj = ncRoot.resolve(pmNamingPath);
            final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperations pm_2_6 = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsHelper
                    .unchecked_narrow(obj);
            return pm_2_6;
        } catch (final NotFound e) {
            throw new CorbaPmicException(e.getMessage(), e);
        } catch (final CannotProceed e) {
            throw new CorbaPmicException(e.getMessage(), e);
        } catch (final InvalidName e) {
            throw new CorbaPmicException(e.getMessage(), e);
        }
    }

    @Override
    public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceMonitoringOperations createPerformanceMonitoringOperations_4_3(String elementAddress,
            boolean secure) throws CorbaPmicException {
        try {
            final ORB orb = provider.getORB(elementAddress, secure);
            final org.omg.CORBA.Object tempObj = orb.string_to_object(iorClient.getIOR(elementAddress));
            final NamingContext ncRoot = NamingContextHelper.narrow(tempObj);
            final org.omg.CORBA.Object obj = ncRoot.resolve(pmNamingPath);
            final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceMonitoringOperations pmsOperations = _PerformanceMonitoringOperationsHelper
                    .unchecked_narrow(obj);
            return pmsOperations;
        } catch (final NotFound e) {
            throw new CorbaPmicException(e.getMessage(), e);
        } catch (final CannotProceed e) {
            throw new CorbaPmicException(e.getMessage(), e);
        } catch (final InvalidName e) {
            throw new CorbaPmicException(e.getMessage(), e);
        }
    }

    @Override
    public PerformanceMonitoringExtended createNewPerformanceMonitoringExtended(String elementAddress, boolean secure) throws CorbaPmicException {
        try {
            final ORB orb = provider.getORB(elementAddress, secure);
            final org.omg.CORBA.Object tempObj = orb.string_to_object(iorClient.getIOR(elementAddress));
            final NamingContext ncRoot = NamingContextHelper.narrow(tempObj);
            final org.omg.CORBA.Object obj = ncRoot.resolve(pmNamingPath);
            final PerformanceMonitoringExtended pmExtended = PerformanceMonitoringExtendedHelper.unchecked_narrow(obj);
            return pmExtended;
        } catch (final NotFound e) {
            throw new CorbaPmicException(e.getMessage(), e);
        } catch (final CannotProceed e) {
            throw new CorbaPmicException(e.getMessage(), e);
        } catch (final InvalidName e) {
            throw new CorbaPmicException(e.getMessage(), e);
        }
    }

    @Override
    public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceIRPOperations createNewPerformanceIrpOperations(String elementAddress, boolean secure)
            throws CorbaPmicException {
        try {
            final ORB orb = provider.getORB(elementAddress, secure);
            final org.omg.CORBA.Object tempObj = orb.string_to_object(iorClient.getIOR(elementAddress));
            final NamingContext ncRoot = NamingContextHelper.narrow(tempObj);
            final org.omg.CORBA.Object obj = ncRoot.resolve(pmNotificationsNamingPath);
            final _PerformanceIRPOperations pmOperations = _PerformanceIRPOperationsHelper.unchecked_narrow(obj);
            return pmOperations;
        } catch (final NotFound e) {
            throw new CorbaPmicException(e.getMessage(), e);
        } catch (final CannotProceed e) {
            throw new CorbaPmicException(e.getMessage(), e);
        } catch (final InvalidName e) {
            throw new CorbaPmicException(e.getMessage(), e);
        }
    }

}
