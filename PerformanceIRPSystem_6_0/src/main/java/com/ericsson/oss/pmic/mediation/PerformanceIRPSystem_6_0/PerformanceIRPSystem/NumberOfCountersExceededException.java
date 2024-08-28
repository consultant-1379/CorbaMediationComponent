package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::NumberOfCountersExceededException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/NumberOfCountersExceededException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception NumberOfCountersExceededException {
  ...
};
 * </pre>
 */
public final class NumberOfCountersExceededException extends org.omg.CORBA.UserException {

  public NumberOfCountersExceededException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.id());
  }

  public NumberOfCountersExceededException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededException {");
    _ret.append("}");
    return _ret.toString();
  }

}
