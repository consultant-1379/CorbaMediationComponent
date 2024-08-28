package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidScheduleException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidScheduleException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidScheduleException {
  ...
};
 * </pre>
 */
public final class InvalidScheduleException extends org.omg.CORBA.UserException {

  public InvalidScheduleException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleExceptionHelper.id());
  }

  public InvalidScheduleException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleException {");
    _ret.append("}");
    return _ret.toString();
  }

}
