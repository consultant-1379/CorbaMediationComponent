package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidObservationClassException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidObservationClassException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidObservationClassException {
  ...
};
 * </pre>
 */
public final class InvalidObservationClassException extends org.omg.CORBA.UserException {

  public InvalidObservationClassException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationClassExceptionHelper.id());
  }

  public InvalidObservationClassException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationClassExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationClassException {");
    _ret.append("}");
    return _ret.toString();
  }

}
