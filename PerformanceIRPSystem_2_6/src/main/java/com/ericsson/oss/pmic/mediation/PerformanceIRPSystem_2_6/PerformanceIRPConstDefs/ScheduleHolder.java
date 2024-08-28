package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::Schedule
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/Schedule:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct Schedule {
  ...
};
 * </pre>
 */
public final class ScheduleHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Schedule value;

public ScheduleHolder () {
}

public ScheduleHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Schedule _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ScheduleHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ScheduleHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ScheduleHelper.type();
}
}
