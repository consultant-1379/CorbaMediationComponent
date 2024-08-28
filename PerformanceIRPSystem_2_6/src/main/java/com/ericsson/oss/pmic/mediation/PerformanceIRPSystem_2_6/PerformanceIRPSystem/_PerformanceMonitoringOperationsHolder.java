package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::PerformanceMonitoringOperations
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/PerformanceMonitoringOperations:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * interface _PerformanceMonitoringOperations {
  ...
};
 * </pre>
 */
public final class _PerformanceMonitoringOperationsHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperations value;

public _PerformanceMonitoringOperationsHolder () {
}

public _PerformanceMonitoringOperationsHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperations _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsHelper.type();
}
}
