package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::DestinationNotSupportedException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/DestinationNotSupportedException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception DestinationNotSupportedException {
  ...
};
 * </pre>
 */
public final class DestinationNotSupportedException extends org.omg.CORBA.UserException {

  public DestinationNotSupportedException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.DestinationNotSupportedExceptionHelper.id());
  }

  public DestinationNotSupportedException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.DestinationNotSupportedExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.DestinationNotSupportedException {");
    _ret.append("}");
    return _ret.toString();
  }

}
