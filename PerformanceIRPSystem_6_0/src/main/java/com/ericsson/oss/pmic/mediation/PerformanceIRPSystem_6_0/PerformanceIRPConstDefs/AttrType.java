package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::AttrType
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/AttrType:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum AttrType {INTEGER_ATTR, REAL_ATTR};
 * </pre>
 */
public final class AttrType implements org.omg.CORBA.portable.IDLEntity {
  private /* [JDK 1.1.x BUG] final */ int __value;

  
  public static final int _INTEGER_ATTR = 0;
  
  public static final int _REAL_ATTR = 1;

  
  public static final AttrType INTEGER_ATTR = new AttrType(_INTEGER_ATTR);
  
  public static final AttrType REAL_ATTR = new AttrType(_REAL_ATTR);

  protected AttrType (final int _vis_value) {
    this.__value = _vis_value;
  }

  public int value () {
    return __value;
  }

  public static AttrType from_int (final int _vis_value) {
    switch (_vis_value) {
      case 0: return INTEGER_ATTR;
      case 1: return REAL_ATTR;
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }
  public java.lang.String toString() {
    switch (__value) {
      case 0: return "INTEGER_ATTR";
      case 1: return "REAL_ATTR";
      default: throw new org.omg.CORBA.BAD_PARAM();
    }
  }

  public boolean equals (java.lang.Object o) {
    if (this == o)
      return true;
    if (o == null)
      return false;
    return o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrType
      ? this.__value == ((com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrType)o).__value
      : false;
  }
}
