package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/TimeBase.idl"
 * <li> <b>IDL Name</b>      ::TimeBase::IntervalT
 * <li> <b>Repository Id</b> IDL:TimeBase/IntervalT:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct IntervalT {
  ...
};
 * </pre>
 */
public final class IntervalT implements org.omg.CORBA.portable.IDLEntity {
  
  public long lower_bound;
  
  public long upper_bound;

  public IntervalT () {
  }

  public IntervalT (final long lower_bound, 
                    final long upper_bound) {
    this.lower_bound = lower_bound;
    this.upper_bound = upper_bound;
  }

  public java.lang.String toString() {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("struct com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.IntervalT {");
    _ret.append("\n");
    _ret.append("long lower_bound=");
    _ret.append(lower_bound);
    _ret.append(",\n");
    _ret.append("long upper_bound=");
    _ret.append(upper_bound);
    _ret.append("\n");
    _ret.append("}");
    return _ret.toString();
  }

  public boolean equals (java.lang.Object o) {
    if (this == o) return true;
    if (o == null) return false;

    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.IntervalT) {
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.IntervalT obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.IntervalT)o;
      boolean res = true;
      do {
          res = this.lower_bound == obj.lower_bound;
        if (!res) break;
          res = this.upper_bound == obj.upper_bound;
      } while (false);
      return res;
    }
    else {
      return false;
    }
  }
}
