package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidMeasurementAttributeException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidMeasurementAttributeException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidMeasurementAttributeException {
  ...
};
 * </pre>
 */
public final class InvalidMeasurementAttributeException extends org.omg.CORBA.UserException {

  public InvalidMeasurementAttributeException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeExceptionHelper.id());
  }

  public InvalidMeasurementAttributeException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeException {");
    _ret.append("}");
    return _ret.toString();
  }

}
