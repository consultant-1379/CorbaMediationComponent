package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidReportingPeriodException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidReportingPeriodException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidReportingPeriodException {
  ...
};
 * </pre>
 */
public final class InvalidReportingPeriodException extends org.omg.CORBA.UserException {

  public InvalidReportingPeriodException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodExceptionHelper.id());
  }

  public InvalidReportingPeriodException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodException {");
    _ret.append("}");
    return _ret.toString();
  }

}
