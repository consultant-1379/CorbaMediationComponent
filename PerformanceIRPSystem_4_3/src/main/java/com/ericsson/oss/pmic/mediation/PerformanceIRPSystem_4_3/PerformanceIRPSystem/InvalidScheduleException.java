package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPSystem.idl"
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
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidScheduleExceptionHelper.id());
  }

  public InvalidScheduleException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidScheduleExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidScheduleException {");
    _ret.append("}");
    return _ret.toString();
  }

}
