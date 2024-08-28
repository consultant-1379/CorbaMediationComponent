package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::OptionalOperationNotSupportedException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception OptionalOperationNotSupportedException {
  ...
};
 * </pre>
 */
public final class OptionalOperationNotSupportedException extends org.omg.CORBA.UserException {

  public OptionalOperationNotSupportedException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id());
  }

  public OptionalOperationNotSupportedException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException {");
    _ret.append("}");
    return _ret.toString();
  }

}
