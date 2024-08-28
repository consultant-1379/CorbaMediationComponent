package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/TimeBase.idl"
 * <li> <b>IDL Name</b>      ::TimeBase::IntervalT
 * <li> <b>Repository Id</b> IDL:TimeBase/IntervalT:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct IntervalT {
  ...
};
 * </pre>
 */
public final class IntervalTHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.IntervalT value;

public IntervalTHolder () {
}

public IntervalTHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.IntervalT _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.IntervalTHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.IntervalTHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.IntervalTHelper.type();
}
}
