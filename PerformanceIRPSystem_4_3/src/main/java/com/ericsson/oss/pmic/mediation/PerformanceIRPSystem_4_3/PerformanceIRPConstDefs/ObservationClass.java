package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::ObservationClass
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/ObservationClass:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct ObservationClass {
  ...
};
 * </pre>
 */
public final class ObservationClass implements org.omg.CORBA.portable.IDLEntity {
  
  public java.lang.String object_class_name;
  
  public java.lang.String[] class_attribute_list;

  public ObservationClass () {
    object_class_name = "";
  }

  public ObservationClass (final java.lang.String object_class_name, 
                           final java.lang.String[] class_attribute_list) {
    this.object_class_name = object_class_name;
    this.class_attribute_list = class_attribute_list;
  }

  private transient java.util.Hashtable _printMap = null;
  public java.lang.String toString() {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("struct com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClass {");
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
    _ret.append("java.lang.String object_class_name=");
    _ret.append(object_class_name != null?'\"' + object_class_name + '\"':null);
    _ret.append(",\n");
    _ret.append("java.lang.String[] class_attribute_list=");
    _ret.append("{");
    if (class_attribute_list == null) {
      _ret.append(class_attribute_list);
    } else {
      for (int $counter11 = 0; $counter11 < class_attribute_list.length; $counter11++) {
        _ret.append(class_attribute_list[$counter11] != null?'\"' + class_attribute_list[$counter11] + '\"':null);
        if ($counter11 < class_attribute_list.length - 1) {
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
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClass) {
      _cmpMap.put(_currentThread, o);
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClass obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClass)o;
      boolean res = true;
      do {
        res = this.object_class_name == obj.object_class_name ||
         (this.object_class_name != null && obj.object_class_name != null && this.object_class_name.equals(obj.object_class_name));
        if (!res) break;
          if (res = (this.class_attribute_list.length == obj.class_attribute_list.length)) {
            for (int $counter12 = 0; res && $counter12 < this.class_attribute_list.length; $counter12++) {
              res = this.class_attribute_list[$counter12] == obj.class_attribute_list[$counter12] ||
               (this.class_attribute_list[$counter12] != null && obj.class_attribute_list[$counter12] != null && this.class_attribute_list[$counter12].equals(obj.class_attribute_list[$counter12]));
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
