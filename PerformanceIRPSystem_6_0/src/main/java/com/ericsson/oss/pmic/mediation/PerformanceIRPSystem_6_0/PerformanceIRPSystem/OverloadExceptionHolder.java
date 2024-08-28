package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::OverloadException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/OverloadException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception OverloadException {
  ...
};
 * </pre>
 */
public final class OverloadExceptionHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException value;

public OverloadExceptionHolder () {
}

public OverloadExceptionHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadExceptionHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadExceptionHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadExceptionHelper.type();
}
}
