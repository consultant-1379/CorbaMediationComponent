package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::CounterbasedFilterException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/CounterbasedFilterException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception CounterbasedFilterException {
  ...
};
 * </pre>
 */
public final class CounterbasedFilterExceptionHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterException value;

public CounterbasedFilterExceptionHolder () {
}

public CounterbasedFilterExceptionHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterException _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterExceptionHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterExceptionHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterExceptionHelper.type();
}
}
