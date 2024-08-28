package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::AttrValue
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/AttrValue:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * union AttrValue switch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrType) {
  ...
};
 * </pre>
 */
public final class AttrValue implements org.omg.CORBA.portable.IDLEntity {
  private java.lang.Object _object;
  boolean _initialized =false;
  private com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrType _disc;
  boolean _defaultState = true;

  public AttrValue() {
  }

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrType discriminator() {
    return _disc;
  }

  
  public int i_attribute() {
    if(!_initialized){
      throw new org.omg.CORBA.BAD_OPERATION("i_attribute");
    }
    if (!_defaultState && ((_disc.value()) == com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrType._INTEGER_ATTR)) {
      return ((java.lang.Integer)_object).intValue();
    }
     throw new org.omg.CORBA.BAD_OPERATION("i_attribute");
  }

  
  public void i_attribute(int _vis_value) {
    _disc = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrType.INTEGER_ATTR;
    _object = new java.lang.Integer(_vis_value);
    _defaultState = false;
    _initialized = true;
  }

  
  public double r_attribute() {
    if(!_initialized){
      throw new org.omg.CORBA.BAD_OPERATION("r_attribute");
    }
    if (!_defaultState && ((_disc.value()) == com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrType._REAL_ATTR)) {
      return ((java.lang.Double)_object).doubleValue();
    }
     throw new org.omg.CORBA.BAD_OPERATION("r_attribute");
  }

  
  public void r_attribute(double _vis_value) {
    _disc = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrType.REAL_ATTR;
    _object = new java.lang.Double(_vis_value);
    _defaultState = false;
    _initialized = true;
  }

  public java.lang.String toString() {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("union com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrValue {");
    if (!_defaultState) {
      switch (_disc.value()) {
        case com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrType._INTEGER_ATTR: {
          _ret.append("\nint i_attribute=");
          _ret.append(i_attribute());
          _ret.append("\n");
          break;
        }
        case com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrType._REAL_ATTR: {
          _ret.append("\ndouble r_attribute=");
          _ret.append(r_attribute());
          _ret.append("\n");
          break;
        }
      }
    }
    _ret.append("}");
    return _ret.toString();
  }

  public boolean equals (java.lang.Object o) {
    if (this == o) return true;
    if (o == null) return false;

    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrValue) {
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrValue obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttrValue)o;
      boolean res = true;
      res = this._disc == obj._disc ||
       (this._disc != null && obj._disc != null && this._disc.equals(obj._disc));
      if (res) {
        res = this._object == obj._object ||
         (this._object != null && obj._object != null && this._object.equals(obj._object));
      }
      return res;
    }
    else
      return false;
  }
}
