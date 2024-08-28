package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringServiceExtended.idl"
 * <li> <b>IDL Name</b>      ::PmServiceExtended::OutputMode
 * <li> <b>Repository Id</b> IDL:PmServiceExtended/OutputMode:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum OutputMode {FILE, STREAMING, FILE_AND_STREAMING};
 * </pre>
 */
public final class OutputModeHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputMode value;

public OutputModeHolder () {
}

public OutputModeHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputMode _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputModeHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputModeHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputModeHelper.type();
}
}
