package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::NumberOfMonitorsExceededException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/NumberOfMonitorsExceededException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception NumberOfMonitorsExceededException {
  ...
};
 * </pre>
 */
public final class NumberOfMonitorsExceededExceptionHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfMonitorsExceededException value;

public NumberOfMonitorsExceededExceptionHolder () {
}

public NumberOfMonitorsExceededExceptionHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfMonitorsExceededException _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.type();
}
}
