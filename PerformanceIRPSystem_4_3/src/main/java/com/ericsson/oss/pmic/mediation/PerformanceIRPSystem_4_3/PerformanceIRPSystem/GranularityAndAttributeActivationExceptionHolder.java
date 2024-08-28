package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::GranularityAndAttributeActivationException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/GranularityAndAttributeActivationException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception GranularityAndAttributeActivationException {
  ...
};
 * </pre>
 */
public final class GranularityAndAttributeActivationExceptionHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationException value;

public GranularityAndAttributeActivationExceptionHolder () {
}

public GranularityAndAttributeActivationExceptionHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationException _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.type();
}
}
