package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/TimeBase.idl"
 * <li> <b>IDL Name</b>      ::TimeBase::UtcT
 * <li> <b>Repository Id</b> IDL:TimeBase/UtcT:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct UtcT {
  ...
};
 * </pre>
 */
public final class UtcT implements org.omg.CORBA.portable.IDLEntity {
  
  public long time;
  
  public int inacclo;
  
  public short inacchi;
  
  public short tdf;

  public UtcT () {
  }

  public UtcT (final long time, 
               final int inacclo, 
               final short inacchi, 
               final short tdf) {
    this.time = time;
    this.inacclo = inacclo;
    this.inacchi = inacchi;
    this.tdf = tdf;
  }

  public java.lang.String toString() {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("struct com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcT {");
    _ret.append("\n");
    _ret.append("long time=");
    _ret.append(time);
    _ret.append(",\n");
    _ret.append("int inacclo=");
    _ret.append(inacclo);
    _ret.append(",\n");
    _ret.append("short inacchi=");
    _ret.append(inacchi);
    _ret.append(",\n");
    _ret.append("short tdf=");
    _ret.append(tdf);
    _ret.append("\n");
    _ret.append("}");
    return _ret.toString();
  }

  public boolean equals (java.lang.Object o) {
    if (this == o) return true;
    if (o == null) return false;

    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcT) {
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcT obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcT)o;
      boolean res = true;
      do {
          res = this.time == obj.time;
        if (!res) break;
        res = this.inacclo == obj.inacclo;
        if (!res) break;
        res = this.inacchi == obj.inacchi;
        if (!res) break;
          res = this.tdf == obj.tdf;
      } while (false);
      return res;
    }
    else {
      return false;
    }
  }
}
