package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
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
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.id());
  }

  public NoSuchIdException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException {");
    _ret.append("}");
    return _ret.toString();
  }

}
