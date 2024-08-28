package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::ObservationObject
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/ObservationObject:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct ObservationObject {
  ...
};
 * </pre>
 */
public final class ObservationObject implements org.omg.CORBA.portable.IDLEntity {
  
  public java.lang.String[] instance_list;
  
  public java.lang.String[] instance_attribute_list;

  public ObservationObject () {
  }

  public ObservationObject (final java.lang.String[] instance_list, 
                            final java.lang.String[] instance_attribute_list) {
    this.instance_list = instance_list;
    this.instance_attribute_list = instance_attribute_list;
  }

  private transient java.util.Hashtable _printMap = null;
  public java.lang.String toString() {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("struct com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObject {");
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
    _ret.append("java.lang.String[] instance_list=");
    _ret.append("{");
    if (instance_list == null) {
      _ret.append(instance_list);
    } else {
      for (int $counter72 = 0; $counter72 < instance_list.length; $counter72++) {
        _ret.append(instance_list[$counter72] != null?'\"' + instance_list[$counter72] + '\"':null);
        if ($counter72 < instance_list.length - 1) {
          _ret.append(",");
        }
      }
    }
    _ret.append("}");
    _ret.append(",\n");
    _ret.append("java.lang.String[] instance_attribute_list=");
    _ret.append("{");
    if (instance_attribute_list == null) {
      _ret.append(instance_attribute_list);
    } else {
      for (int $counter73 = 0; $counter73 < instance_attribute_list.length; $counter73++) {
        _ret.append(instance_attribute_list[$counter73] != null?'\"' + instance_attribute_list[$counter73] + '\"':null);
        if ($counter73 < instance_attribute_list.length - 1) {
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
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObject) {
      _cmpMap.put(_currentThread, o);
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObject obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObject)o;
      boolean res = true;
      do {
          if (res = (this.instance_list.length == obj.instance_list.length)) {
            for (int $counter74 = 0; res && $counter74 < this.instance_list.length; $counter74++) {
              res = this.instance_list[$counter74] == obj.instance_list[$counter74] ||
               (this.instance_list[$counter74] != null && obj.instance_list[$counter74] != null && this.instance_list[$counter74].equals(obj.instance_list[$counter74]));
            }
          }
        if (!res) break;
          if (res = (this.instance_attribute_list.length == obj.instance_attribute_list.length)) {
            for (int $counter75 = 0; res && $counter75 < this.instance_attribute_list.length; $counter75++) {
              res = this.instance_attribute_list[$counter75] == obj.instance_attribute_list[$counter75] ||
               (this.instance_attribute_list[$counter75] != null && obj.instance_attribute_list[$counter75] != null && this.instance_attribute_list[$counter75].equals(obj.instance_attribute_list[$counter75]));
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
