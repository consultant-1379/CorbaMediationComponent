package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
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
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidReportingPeriodExceptionHelper.id());
  }

  public InvalidReportingPeriodException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidReportingPeriodExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidReportingPeriodException {");
    _ret.append("}");
    return _ret.toString();
  }

}
