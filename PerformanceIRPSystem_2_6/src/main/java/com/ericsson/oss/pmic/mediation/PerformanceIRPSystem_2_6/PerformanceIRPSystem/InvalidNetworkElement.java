package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidNetworkElement
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidNetworkElement:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidNetworkElement {
  ...
};
 * </pre>
 */
public final class InvalidNetworkElement extends org.omg.CORBA.UserException {
  
  public java.lang.String[] ne_list;

  public InvalidNetworkElement () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidNetworkElementHelper.id());
  }

  public InvalidNetworkElement (java.lang.String[] ne_list) {
    this();
    this.ne_list = ne_list;
  }

  public InvalidNetworkElement (java.lang.String _reason, java.lang.String[] ne_list) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidNetworkElementHelper.id() + ' ' + _reason);
    this.ne_list = ne_list;
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidNetworkElement {");
    _ret.append("\n");
    _ret.append("java.lang.String[] ne_list=");
    _ret.append("{");
    if (ne_list == null) {
      _ret.append(ne_list);
    } else {
      for (int $counter2 = 0; $counter2 < ne_list.length; $counter2++) {
        _ret.append(ne_list[$counter2] != null?'\"' + ne_list[$counter2] + '\"':null);
        if ($counter2 < ne_list.length - 1) {
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
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidNetworkElement) {
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidNetworkElement obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidNetworkElement)o;
      boolean res = true;
      do {
          if (res = (this.ne_list.length == obj.ne_list.length)) {
            for (int $counter3 = 0; res && $counter3 < this.ne_list.length; $counter3++) {
                res = this.ne_list[$counter3] == obj.ne_list[$counter3] ||
                 (this.ne_list[$counter3] != null && obj.ne_list[$counter3] != null && this.ne_list[$counter3].equals(obj.ne_list[$counter3]));
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
