package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringServiceExtended.idl"
 * <li> <b>IDL Name</b>      ::PmServiceExtended::OutputMode
 * <li> <b>Repository Id</b> IDL:PmServiceExtended/OutputMode:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum OutputMode {FILE, STREAMING, FILE_AND_STREAMING};
 * </pre>
 */
public final class OutputMode implements org.omg.CORBA.portable.IDLEntity {
  private /* [JDK 1.1.x BUG] final */ int __value;

  
  public static final int _FILE = 0;
  
  public static final int _STREAMING = 1;
  
  public static final int _FILE_AND_STREAMING = 2;

  
  public static final OutputMode FILE = new OutputMode(_FILE);
  
  public static final OutputMode STREAMING = new OutputMode(_STREAMING);
  
  public static final OutputMode FILE_AND_STREAMING = new OutputMode(_FILE_AND_STREAMING);

  protected OutputMode (final int _vis_value) {
    this.__value = _vis_value;
  }

  public int value () {
    return __value;
  }

  public static OutputMode from_int (final int _vis_value) {
    switch (_vis_value) {
      case 0: return FILE;
      case 1: return STREAMING;
      case 2: return FILE_AND_STREAMING;
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }
  public java.lang.String toString() {
    switch (__value) {
      case 0: return "FILE";
      case 1: return "STREAMING";
      case 2: return "FILE_AND_STREAMING";
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }

  public boolean equals (java.lang.Object o) {
    if (this == o)
      return true;
    if (o == null)
      return false;
    return o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputMode
      ? this.__value == ((com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputMode)o).__value
      : false;
  }
}
