package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::NoSuchIdException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/NoSuchIdException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception NoSuchIdException {
  ...
};
 * </pre>
 */
public final class NoSuchIdException extends org.omg.CORBA.UserException {

  public NoSuchIdException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.id());
  }

  public NoSuchIdException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException {");
    _ret.append("}");
    return _ret.toString();
  }

}
