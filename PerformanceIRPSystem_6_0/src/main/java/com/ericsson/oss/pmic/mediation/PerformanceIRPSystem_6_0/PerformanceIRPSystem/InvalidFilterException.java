package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidFilterException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidFilterException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidFilterException {
  ...
};
 * </pre>
 */
public final class InvalidFilterException extends org.omg.CORBA.UserException {

  public InvalidFilterException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterExceptionHelper.id());
  }

  public InvalidFilterException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterException {");
    _ret.append("}");
    return _ret.toString();
  }

}
