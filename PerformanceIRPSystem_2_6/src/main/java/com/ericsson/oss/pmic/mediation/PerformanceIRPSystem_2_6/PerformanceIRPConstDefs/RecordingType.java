package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::RecordingType
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/RecordingType:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum RecordingType {EVENT_DATA, MEASUREMENT_DATA, EVENT_AND_MESUREMENT_DATA};
 * </pre>
 */
public final class RecordingType implements org.omg.CORBA.portable.IDLEntity {
  private /* [JDK 1.1.x BUG] final */ int __value;

  
  public static final int _EVENT_DATA = 0;
  
  public static final int _MEASUREMENT_DATA = 1;
  
  public static final int _EVENT_AND_MESUREMENT_DATA = 2;

  
  public static final RecordingType EVENT_DATA = new RecordingType(_EVENT_DATA);
  
  public static final RecordingType MEASUREMENT_DATA = new RecordingType(_MEASUREMENT_DATA);
  
  public static final RecordingType EVENT_AND_MESUREMENT_DATA = new RecordingType(_EVENT_AND_MESUREMENT_DATA);

  protected RecordingType (final int _vis_value) {
    this.__value = _vis_value;
  }

  public int value () {
    return __value;
  }

  public static RecordingType from_int (final int _vis_value) {
    switch (_vis_value) {
      case 0: return EVENT_DATA;
      case 1: return MEASUREMENT_DATA;
      case 2: return EVENT_AND_MESUREMENT_DATA;
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }
  public java.lang.String toString() {
    switch (__value) {
      case 0: return "EVENT_DATA";
      case 1: return "MEASUREMENT_DATA";
      case 2: return "EVENT_AND_MESUREMENT_DATA";
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }

  public boolean equals (java.lang.Object o) {
    if (this == o)
      return true;
    if (o == null)
      return false;
    return o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RecordingType
      ? this.__value == ((com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RecordingType)o).__value
      : false;
  }
}
