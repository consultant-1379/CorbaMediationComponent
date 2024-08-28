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

import com.ericsson.nms.mediation.corba.manager.CorbaPmicException;
import com.ericsson.nms.mediation.corba.provider.NetworkElementPmicProvider;
import com.ericsson.oss.itpf.common.event.handler.EventHandlerContext;
import com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceIRPOperations;

/**
 * Abstract Corba handler extension specialized on returning PMIC interfaces.
 * 
 * @author ekalkur
 * 
 */
public abstract class AbstractCorbaPmicHandler extends AbstractCorbaHandlerFlow {
    private _PerformanceIRPOperations pmOperations;

    @Override
    protected void resetProvider() {
        if (this.address == null) {
            throw new IllegalStateException("Handler has not been properly initialized. Missing \"address\" property.");
        }

        ((NetworkElementPmicProvider) this.elementInterfaceProvider).removePerformanceIrpOperations(address.get(), pmOperations);

        initConfiguration();
    }

    @Override
    public void init(final EventHandlerContext context) {
        super.elementInterfaceProviderFactory = new NetworkElementPmicProviderFactory();
        super.init(context);
        initConfiguration();
        doInit();
    }

    private void initConfiguration() {

        try {
            this.pmOperations = getPerformanceIrpOperationsFromRemote();
        } catch (final CorbaPmicException e) {
            log.error("Unable to restore Corba communication: {}", e.getMessage());
            log.debug("Exception trace: ", e);
        }
    }

    protected _PerformanceIRPOperations getPerformanceIRPOperations() throws CorbaPmicException {
        return this.pmOperations;
    }

    private _PerformanceIRPOperations getPerformanceIrpOperationsFromRemote() throws CorbaPmicException {
        return ((NetworkElementPmicProvider) this.elementInterfaceProvider).getPerformanceIrpOperations(address.get(), secured.get());
    }
}
