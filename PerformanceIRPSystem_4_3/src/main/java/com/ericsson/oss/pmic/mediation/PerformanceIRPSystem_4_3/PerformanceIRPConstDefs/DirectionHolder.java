package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::Direction
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/Direction:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum Direction {RISING, FALLING};
 * </pre>
 */
public final class DirectionHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.Direction value;

public DirectionHolder () {
}

public DirectionHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.Direction _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.DirectionHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.DirectionHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.DirectionHelper.type();
}
}
