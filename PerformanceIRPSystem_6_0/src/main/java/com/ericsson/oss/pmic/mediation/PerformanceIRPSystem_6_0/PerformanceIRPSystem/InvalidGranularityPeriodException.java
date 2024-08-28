package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidGranularityPeriodException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidGranularityPeriodException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidGranularityPeriodException {
  ...
};
 * </pre>
 */
public final class InvalidGranularityPeriodException extends org.omg.CORBA.UserException {

  public InvalidGranularityPeriodException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodExceptionHelper.id());
  }

  public InvalidGranularityPeriodException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodException {");
    _ret.append("}");
    return _ret.toString();
  }

}
