package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::PerformanceMonitoringState
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/PerformanceMonitoringState:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum PerformanceMonitoringState {ACTIVE, SUSPENDED};
 * </pre>
 */
public final class PerformanceMonitoringState implements org.omg.CORBA.portable.IDLEntity {
  private /* [JDK 1.1.x BUG] final */ int __value;

  
  public static final int _ACTIVE = 0;
  
  public static final int _SUSPENDED = 1;

  
  public static final PerformanceMonitoringState ACTIVE = new PerformanceMonitoringState(_ACTIVE);
  
  public static final PerformanceMonitoringState SUSPENDED = new PerformanceMonitoringState(_SUSPENDED);

  protected PerformanceMonitoringState (final int _vis_value) {
    this.__value = _vis_value;
  }

  public int value () {
    return __value;
  }

  public static PerformanceMonitoringState from_int (final int _vis_value) {
    switch (_vis_value) {
      case 0: return ACTIVE;
      case 1: return SUSPENDED;
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }
  public java.lang.String toString() {
    switch (__value) {
      case 0: return "ACTIVE";
      case 1: return "SUSPENDED";
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }

  public boolean equals (java.lang.Object o) {
    if (this == o)
      return true;
    if (o == null)
      return false;
    return o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringState
      ? this.__value == ((com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringState)o).__value
      : false;
  }
}
