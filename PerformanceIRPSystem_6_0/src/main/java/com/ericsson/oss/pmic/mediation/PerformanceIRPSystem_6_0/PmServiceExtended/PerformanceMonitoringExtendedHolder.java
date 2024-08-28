package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringServiceExtended.idl"
 * <li> <b>IDL Name</b>      ::PmServiceExtended::PerformanceMonitoringExtended
 * <li> <b>Repository Id</b> IDL:PmServiceExtended/PerformanceMonitoringExtended:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * interface PerformanceMonitoringExtended : com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperations {
  ...
};
 * </pre>
 */
public final class PerformanceMonitoringExtendedHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtended value;

public PerformanceMonitoringExtendedHolder () {
}

public PerformanceMonitoringExtendedHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtended _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtendedHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtendedHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtendedHelper.type();
}
}
