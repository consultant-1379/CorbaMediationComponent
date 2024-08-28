package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::EventCategory
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/EventCategory:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum EventCategory {ACTIVITY_OCCURED, THRESHOLD_PASSED, PERIODIC_EVENT};
 * </pre>
 */
public final class EventCategoryHolder implements org.omg.CORBA.portable.Streamable {
public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategory value;

public EventCategoryHolder () {
}

public EventCategoryHolder (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategory _vis_value) {
  this.value = _vis_value;
}

public void _read (final org.omg.CORBA.portable.InputStream input) {
  value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategoryHelper.read(input);
}

public void _write (final org.omg.CORBA.portable.OutputStream output) {
  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategoryHelper.write(output, value);
}

public org.omg.CORBA.TypeCode _type () {
  return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategoryHelper.type();
}
}
