package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::NumberOfMonitorsExceededException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/NumberOfMonitorsExceededException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception NumberOfMonitorsExceededException {
  ...
};
 * </pre>
 */
public final class NumberOfMonitorsExceededException extends org.omg.CORBA.UserException {

  public NumberOfMonitorsExceededException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.id());
  }

  public NumberOfMonitorsExceededException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededException {");
    _ret.append("}");
    return _ret.toString();
  }

}
