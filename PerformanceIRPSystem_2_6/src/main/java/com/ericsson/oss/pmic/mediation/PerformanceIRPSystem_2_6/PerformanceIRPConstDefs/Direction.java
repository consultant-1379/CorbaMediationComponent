package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::Direction
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/Direction:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum Direction {RISING, FALLING};
 * </pre>
 */
public final class Direction implements org.omg.CORBA.portable.IDLEntity {
  private /* [JDK 1.1.x BUG] final */ int __value;

  
  public static final int _RISING = 0;
  
  public static final int _FALLING = 1;

  
  public static final Direction RISING = new Direction(_RISING);
  
  public static final Direction FALLING = new Direction(_FALLING);

  protected Direction (final int _vis_value) {
    this.__value = _vis_value;
  }

  public int value () {
    return __value;
  }

  public static Direction from_int (final int _vis_value) {
    switch (_vis_value) {
      case 0: return RISING;
      case 1: return FALLING;
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }
  public java.lang.String toString() {
    switch (__value) {
      case 0: return "RISING";
      case 1: return "FALLING";
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }

  public boolean equals (java.lang.Object o) {
    if (this == o)
      return true;
    if (o == null)
      return false;
    return o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Direction
      ? this.__value == ((com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Direction)o).__value
      : false;
  }
}
