package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::Filter
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/Filter:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct Filter {
  ...
};
 * </pre>
 */
public final class Filter implements org.omg.CORBA.portable.IDLEntity {
  
  public java.lang.String[] attribute_name;
  
  public java.lang.String[] attribute_value;

  public Filter () {
  }

  public Filter (final java.lang.String[] attribute_name, 
                 final java.lang.String[] attribute_value) {
    this.attribute_name = attribute_name;
    this.attribute_value = attribute_value;
  }

  private transient java.util.Hashtable _printMap = null;
  public java.lang.String toString() {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("struct com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Filter {");
    final java.lang.Thread _currentThread = java.lang.Thread.currentThread();
    boolean justCreated = false;
    if (_printMap == null) {
      synchronized (this) {
        if (_printMap == null) {
          justCreated = true;
          _printMap = new java.util.Hashtable();
        }
      }
    }
    if (!justCreated) {
      if (_printMap.get(_currentThread) != null) {
        _ret.append("...}");
        return _ret.toString();
      }
    }
    _printMap.put(_currentThread, this);
    _ret.append("\n");
    _ret.append("java.lang.String[] attribute_name=");
    _ret.append("{");
    if (attribute_name == null) {
      _ret.append(attribute_name);
    } else {
      for (int $counter66 = 0; $counter66 < attribute_name.length; $counter66++) {
        _ret.append(attribute_name[$counter66] != null?'\"' + attribute_name[$counter66] + '\"':null);
        if ($counter66 < attribute_name.length - 1) {
          _ret.append(",");
        }
      }
    }
    _ret.append("}");
    _ret.append(",\n");
    _ret.append("java.lang.String[] attribute_value=");
    _ret.append("{");
    if (attribute_value == null) {
      _ret.append(attribute_value);
    } else {
      for (int $counter67 = 0; $counter67 < attribute_value.length; $counter67++) {
        _ret.append(attribute_value[$counter67] != null?'\"' + attribute_value[$counter67] + '\"':null);
        if ($counter67 < attribute_value.length - 1) {
          _ret.append(",");
        }
      }
    }
    _ret.append("}");
    _ret.append("\n");
    _printMap.remove(_currentThread);
    _ret.append("}");
    return _ret.toString();
  }

  private transient java.util.Hashtable _cmpMap = null;
  public boolean equals (java.lang.Object o) {
    if (this == o) return true;
    if (o == null) return false;

    final java.lang.Thread _currentThread = java.lang.Thread.currentThread();
    boolean justCreated = false;
    if (_cmpMap == null) {
      synchronized (this) {
        if (_cmpMap == null) {
          justCreated = true;
          _cmpMap = new java.util.Hashtable();
        }
      }
    }
    if (!justCreated) {
      final java.lang.Object _cmpObj;
      _cmpObj= _cmpMap.get(_currentThread);
      if (_cmpObj != null) return o == _cmpObj;
    }
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Filter) {
      _cmpMap.put(_currentThread, o);
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Filter obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Filter)o;
      boolean res = true;
      do {
        if (res = (this.attribute_name.length == obj.attribute_name.length)) {
          for (int $counter68 = 0; res && $counter68 < this.attribute_name.length; $counter68++) {
            res = this.attribute_name[$counter68] == obj.attribute_name[$counter68] ||
             (this.attribute_name[$counter68] != null && obj.attribute_name[$counter68] != null && this.attribute_name[$counter68].equals(obj.attribute_name[$counter68]));
          }
        }
        if (!res) break;
        if (res = (this.attribute_value.length == obj.attribute_value.length)) {
          for (int $counter69 = 0; res && $counter69 < this.attribute_value.length; $counter69++) {
            res = this.attribute_value[$counter69] == obj.attribute_value[$counter69] ||
             (this.attribute_value[$counter69] != null && obj.attribute_value[$counter69] != null && this.attribute_value[$counter69].equals(obj.attribute_value[$counter69]));
          }
        }
      } while (false);
      _cmpMap.remove(_currentThread);
      return res;
    }
    else {
      return false;
    }
  }
}
