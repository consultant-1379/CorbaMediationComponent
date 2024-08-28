package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::EventCategory
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/EventCategory:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum EventCategory {ACTIVITY_OCCURED, THRESHOLD_PASSED, PERIODIC_EVENT};
 * </pre>
 */
public final class EventCategory implements org.omg.CORBA.portable.IDLEntity {
  private /* [JDK 1.1.x BUG] final */ int __value;

  
  public static final int _ACTIVITY_OCCURED = 0;
  
  public static final int _THRESHOLD_PASSED = 1;
  
  public static final int _PERIODIC_EVENT = 2;

  
  public static final EventCategory ACTIVITY_OCCURED = new EventCategory(_ACTIVITY_OCCURED);
  
  public static final EventCategory THRESHOLD_PASSED = new EventCategory(_THRESHOLD_PASSED);
  
  public static final EventCategory PERIODIC_EVENT = new EventCategory(_PERIODIC_EVENT);

  protected EventCategory (final int _vis_value) {
    this.__value = _vis_value;
  }

  public int value () {
    return __value;
  }

  public static EventCategory from_int (final int _vis_value) {
    switch (_vis_value) {
      case 0: return ACTIVITY_OCCURED;
      case 1: return THRESHOLD_PASSED;
      case 2: return PERIODIC_EVENT;
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }
  public java.lang.String toString() {
    switch (__value) {
      case 0: return "ACTIVITY_OCCURED";
      case 1: return "THRESHOLD_PASSED";
      case 2: return "PERIODIC_EVENT";
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }

  public boolean equals (java.lang.Object o) {
    if (this == o)
      return true;
    if (o == null)
      return false;
    return o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.EventCategory
      ? this.__value == ((com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.EventCategory)o).__value
      : false;
  }
}
