package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::NotSupportedParameters
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/NotSupportedParameters:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * typedef sequence&ltstring&gt NotSupportedParameters;
 * </pre>
 */
public final class NotSupportedParametersHolder implements org.omg.CORBA.portable.Streamable {
public java.lang.String[] value;

public NotSupportedParametersHolder () {
}

public NotSupportedParametersHolder (final java.lang.String[] _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.NotSupportedParametersHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.NotSupportedParametersHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.NotSupportedParametersHelper.type();
}
}
