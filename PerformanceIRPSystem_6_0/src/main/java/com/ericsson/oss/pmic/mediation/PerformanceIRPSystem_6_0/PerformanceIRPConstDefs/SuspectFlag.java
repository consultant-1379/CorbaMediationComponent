package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::SuspectFlag
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/SuspectFlag:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum SuspectFlag {FALSE_, TRUE_};
 * </pre>
 */
public final class SuspectFlag implements org.omg.CORBA.portable.IDLEntity {
  private /* [JDK 1.1.x BUG] final */ int __value;

  
  public static final int _FALSE_ = 0;
  
  public static final int _TRUE_ = 1;

  
  public static final SuspectFlag FALSE_ = new SuspectFlag(_FALSE_);
  
  public static final SuspectFlag TRUE_ = new SuspectFlag(_TRUE_);

  protected SuspectFlag (final int _vis_value) {
    this.__value = _vis_value;
  }

  public int value () {
    return __value;
  }

  public static SuspectFlag from_int (final int _vis_value) {
    switch (_vis_value) {
      case 0: return FALSE_;
      case 1: return TRUE_;
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }
  public java.lang.String toString() {
    switch (__value) {
      case 0: return "FALSE_";
      case 1: return "TRUE_";
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }

  public boolean equals (java.lang.Object o) {
    if (this == o)
      return true;
    if (o == null)
      return false;
    return o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SuspectFlag
      ? this.__value == ((com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SuspectFlag)o).__value
      : false;
  }
}
