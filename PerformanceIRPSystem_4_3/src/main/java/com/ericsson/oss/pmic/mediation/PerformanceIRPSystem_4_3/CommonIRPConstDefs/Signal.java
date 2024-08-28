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
public final class Signal implements org.omg.CORBA.portable.IDLEntity {
  private /* [JDK 1.1.x BUG] final */ int __value;

  
  public static final int _OK = 0;
  
  public static final int _Failure = 1;
  
  public static final int _PartialFailure = 2;

  
  public static final Signal OK = new Signal(_OK);
  
  public static final Signal Failure = new Signal(_Failure);
  
  public static final Signal PartialFailure = new Signal(_PartialFailure);

  protected Signal (final int _vis_value) {
    this.__value = _vis_value;
  }

  public int value () {
    return __value;
  }

  public static Signal from_int (final int _vis_value) {
    switch (_vis_value) {
      case 0: return OK;
      case 1: return Failure;
      case 2: return PartialFailure;
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }
  public java.lang.String toString() {
    switch (__value) {
      case 0: return "OK";
      case 1: return "Failure";
      case 2: return "PartialFailure";
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }

  public boolean equals (java.lang.Object o) {
    if (this == o)
      return true;
    if (o == null)
      return false;
    return o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal
      ? this.__value == ((com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal)o).__value
      : false;
  }
}
