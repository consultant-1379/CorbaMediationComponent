package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::OptionalParameterNotSupportedException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/OptionalParameterNotSupportedException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception OptionalParameterNotSupportedException {
  ...
};
 * </pre>
 */
public final class OptionalParameterNotSupportedExceptionHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException value;

public OptionalParameterNotSupportedExceptionHolder () {
}

public OptionalParameterNotSupportedExceptionHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.type();
}
}
