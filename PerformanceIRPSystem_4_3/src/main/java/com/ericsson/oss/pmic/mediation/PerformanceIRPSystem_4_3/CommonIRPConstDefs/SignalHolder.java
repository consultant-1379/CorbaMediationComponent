package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/CommonIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::CommonIRPConstDefs::Signal
 * <li> <b>Repository Id</b> IDL:CommonIRPConstDefs/Signal:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum Signal {OK, Failure, PartialFailure};
 * </pre>
 */
public final class SignalHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal value;

public SignalHolder () {
}

public SignalHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.SignalHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.SignalHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.SignalHelper.type();
}
}
