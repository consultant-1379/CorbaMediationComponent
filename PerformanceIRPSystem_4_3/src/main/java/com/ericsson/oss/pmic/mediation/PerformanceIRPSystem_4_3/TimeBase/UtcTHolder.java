package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/TimeBase.idl"
 * <li> <b>IDL Name</b>      ::TimeBase::UtcT
 * <li> <b>Repository Id</b> IDL:TimeBase/UtcT:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct UtcT {
  ...
};
 * </pre>
 */
public final class UtcTHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcT value;

public UtcTHolder () {
}

public UtcTHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcT _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcTHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcTHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcTHelper.type();
}
}
