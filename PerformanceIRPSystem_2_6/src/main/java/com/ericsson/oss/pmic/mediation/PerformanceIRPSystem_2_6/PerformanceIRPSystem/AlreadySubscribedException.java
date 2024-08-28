package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::AlreadySubscribedException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/AlreadySubscribedException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception AlreadySubscribedException {
  ...
};
 * </pre>
 */
public final class AlreadySubscribedException extends org.omg.CORBA.UserException {

  public AlreadySubscribedException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.AlreadySubscribedExceptionHelper.id());
  }

  public AlreadySubscribedException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.AlreadySubscribedExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.AlreadySubscribedException {");
    _ret.append("}");
    return _ret.toString();
  }

}
