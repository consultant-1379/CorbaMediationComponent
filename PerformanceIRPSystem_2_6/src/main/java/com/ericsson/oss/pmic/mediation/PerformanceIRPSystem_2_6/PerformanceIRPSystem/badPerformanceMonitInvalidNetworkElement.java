package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::badPerformanceMonitInvalidNetworkElement
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/badPerformanceMonitInvalidNetworkElement:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception badPerformanceMonitInvalidNetworkElement {
  ...
};
 * </pre>
 */
public final class badPerformanceMonitInvalidNetworkElement extends org.omg.CORBA.UserException {
  
  public java.lang.String[] ne_list;

  public badPerformanceMonitInvalidNetworkElement () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.badPerformanceMonitInvalidNetworkElementHelper.id());
  }

  public badPerformanceMonitInvalidNetworkElement (java.lang.String[] ne_list) {
    this();
    this.ne_list = ne_list;
  }

  public badPerformanceMonitInvalidNetworkElement (java.lang.String _reason, java.lang.String[] ne_list) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.badPerformanceMonitInvalidNetworkElementHelper.id() + ' ' + _reason);
    this.ne_list = ne_list;
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.badPerformanceMonitInvalidNetworkElement {");
    _ret.append("\n");
    _ret.append("java.lang.String[] ne_list=");
    _ret.append("{");
    if (ne_list == null) {
      _ret.append(ne_list);
    } else {
      for (int $counter4 = 0; $counter4 < ne_list.length; $counter4++) {
        _ret.append(ne_list[$counter4] != null?'\"' + ne_list[$counter4] + '\"':null);
        if ($counter4 < ne_list.length - 1) {
          _ret.append(",");
        }
      }
    }
    _ret.append("}");
    _ret.append("\n");
    _ret.append("}");
    return _ret.toString();
  }

  public boolean equals (java.lang.Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.badPerformanceMonitInvalidNetworkElement) {
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.badPerformanceMonitInvalidNetworkElement obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.badPerformanceMonitInvalidNetworkElement)o;
      boolean res = true;
      do {
          if (res = (this.ne_list.length == obj.ne_list.length)) {
            for (int $counter5 = 0; res && $counter5 < this.ne_list.length; $counter5++) {
                res = this.ne_list[$counter5] == obj.ne_list[$counter5] ||
                 (this.ne_list[$counter5] != null && obj.ne_list[$counter5] != null && this.ne_list[$counter5].equals(obj.ne_list[$counter5]));
            }
          }
      } while (false);
      return res;
    }
    else {
      return false;
    }
  }
}
