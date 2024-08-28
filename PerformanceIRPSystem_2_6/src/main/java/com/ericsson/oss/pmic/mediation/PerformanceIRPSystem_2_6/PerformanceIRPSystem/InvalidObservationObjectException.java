package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidObservationObjectException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidObservationObjectException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidObservationObjectException {
  ...
};
 * </pre>
 */
public final class InvalidObservationObjectException extends org.omg.CORBA.UserException {

  public InvalidObservationObjectException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectExceptionHelper.id());
  }

  public InvalidObservationObjectException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException {");
    _ret.append("}");
    return _ret.toString();
  }

}
