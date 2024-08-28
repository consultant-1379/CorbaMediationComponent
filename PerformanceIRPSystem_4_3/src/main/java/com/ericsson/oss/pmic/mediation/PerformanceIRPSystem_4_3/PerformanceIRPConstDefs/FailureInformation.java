package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::FailureInformation
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/FailureInformation:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum FailureInformation {NO_FAILURE, OBJECT_NOT_EXIST, OBJECTCLASS_NOT_EXIST};
 * </pre>
 */
public final class FailureInformation implements org.omg.CORBA.portable.IDLEntity {
  private /* [JDK 1.1.x BUG] final */ int __value;

  
  public static final int _NO_FAILURE = 0;
  
  public static final int _OBJECT_NOT_EXIST = 1;
  
  public static final int _OBJECTCLASS_NOT_EXIST = 2;

  
  public static final FailureInformation NO_FAILURE = new FailureInformation(_NO_FAILURE);
  
  public static final FailureInformation OBJECT_NOT_EXIST = new FailureInformation(_OBJECT_NOT_EXIST);
  
  public static final FailureInformation OBJECTCLASS_NOT_EXIST = new FailureInformation(_OBJECTCLASS_NOT_EXIST);

  protected FailureInformation (final int _vis_value) {
    this.__value = _vis_value;
  }

  public int value () {
    return __value;
  }

  public static FailureInformation from_int (final int _vis_value) {
    switch (_vis_value) {
      case 0: return NO_FAILURE;
      case 1: return OBJECT_NOT_EXIST;
      case 2: return OBJECTCLASS_NOT_EXIST;
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }
  public java.lang.String toString() {
    switch (__value) {
      case 0: return "NO_FAILURE";
      case 1: return "OBJECT_NOT_EXIST";
      case 2: return "OBJECTCLASS_NOT_EXIST";
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }

  public boolean equals (java.lang.Object o) {
    if (this == o)
      return true;
    if (o == null)
      return false;
    return o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.FailureInformation
      ? this.__value == ((com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.FailureInformation)o).__value
      : false;
  }
}
