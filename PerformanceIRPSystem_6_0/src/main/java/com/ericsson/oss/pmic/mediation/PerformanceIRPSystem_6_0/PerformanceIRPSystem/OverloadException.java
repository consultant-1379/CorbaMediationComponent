package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::OverloadException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/OverloadException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception OverloadException {
  ...
};
 * </pre>
 */
public final class OverloadException extends org.omg.CORBA.UserException {

  public OverloadException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadExceptionHelper.id());
  }

  public OverloadException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException {");
    _ret.append("}");
    return _ret.toString();
  }

}
