package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::Destination
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/Destination:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum Destination {FILE, NOTIFICATION, NOTIFICATION_AND_FILE};
 * </pre>
 */
public final class Destination implements org.omg.CORBA.portable.IDLEntity {
  private /* [JDK 1.1.x BUG] final */ int __value;

  
  public static final int _FILE = 0;
  
  public static final int _NOTIFICATION = 1;
  
  public static final int _NOTIFICATION_AND_FILE = 2;

  
  public static final Destination FILE = new Destination(_FILE);
  
  public static final Destination NOTIFICATION = new Destination(_NOTIFICATION);
  
  public static final Destination NOTIFICATION_AND_FILE = new Destination(_NOTIFICATION_AND_FILE);

  protected Destination (final int _vis_value) {
    this.__value = _vis_value;
  }

  public int value () {
    return __value;
  }

  public static Destination from_int (final int _vis_value) {
    switch (_vis_value) {
      case 0: return FILE;
      case 1: return NOTIFICATION;
      case 2: return NOTIFICATION_AND_FILE;
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }
  public java.lang.String toString() {
    switch (__value) {
      case 0: return "FILE";
      case 1: return "NOTIFICATION";
      case 2: return "NOTIFICATION_AND_FILE";
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }

  public boolean equals (java.lang.Object o) {
    if (this == o)
      return true;
    if (o == null)
      return false;
    return o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.Destination
      ? this.__value == ((com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.Destination)o).__value
      : false;
  }
}
