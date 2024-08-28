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
public final class InvalidMeasurementAttributeExceptionHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeException value;

public InvalidMeasurementAttributeExceptionHolder () {
}

public InvalidMeasurementAttributeExceptionHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeException _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeExceptionHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeExceptionHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeExceptionHelper.type();
}
}
