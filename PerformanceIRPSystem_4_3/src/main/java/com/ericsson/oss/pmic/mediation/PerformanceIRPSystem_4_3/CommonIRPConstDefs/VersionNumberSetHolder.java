package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/CommonIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::CommonIRPConstDefs::VersionNumberSet
 * <li> <b>Repository Id</b> IDL:CommonIRPConstDefs/VersionNumberSet:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * typedef sequence&ltstring&gt VersionNumberSet;
 * </pre>
 */
public final class VersionNumberSetHolder implements org.omg.CORBA.portable.Streamable {
public java.lang.String[] value;

public VersionNumberSetHolder () {
}

public VersionNumberSetHolder (final java.lang.String[] _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.VersionNumberSetHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.VersionNumberSetHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.VersionNumberSetHelper.type();
}
}
