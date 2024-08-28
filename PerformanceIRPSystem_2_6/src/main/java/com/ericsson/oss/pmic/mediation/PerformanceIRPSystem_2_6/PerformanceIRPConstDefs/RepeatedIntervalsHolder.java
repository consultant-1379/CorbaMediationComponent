package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::RepeatedIntervals
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/RepeatedIntervals:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * typedef sequence&ltcom.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimePeriodInSeconds&gt RepeatedIntervals;
 * </pre>
 */
public final class RepeatedIntervalsHolder implements org.omg.CORBA.portable.Streamable {
public int[] value;

public RepeatedIntervalsHolder () {
}

public RepeatedIntervalsHolder (final int[] _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RepeatedIntervalsHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RepeatedIntervalsHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RepeatedIntervalsHelper.type();
}
}
