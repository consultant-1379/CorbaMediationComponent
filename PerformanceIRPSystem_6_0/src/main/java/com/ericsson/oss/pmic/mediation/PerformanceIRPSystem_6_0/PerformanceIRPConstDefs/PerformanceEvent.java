package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::PerformanceEvent
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/PerformanceEvent:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct PerformanceEvent {
  ...
};
 * </pre>
 */
public final class PerformanceEvent implements org.omg.CORBA.portable.IDLEntity {
  
  public java.lang.String managed_object_class;
  
  public java.lang.String observed_object_instance;
  
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.EventCategory event_category;
  
  public java.lang.String event_group_id;
  
  public java.lang.String[] attribute_name;
  
  public java.lang.String[] attribute_value;
  
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SuspectFlag[] suspect_flag;
  
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.TimeBase.UtcT event_time;
  
  public java.lang.String[] additional_info_name;
  
  public java.lang.String[] additional_info_value;

  public PerformanceEvent () {
    managed_object_class = "";
    observed_object_instance = "";
    event_group_id = "";
  }

  public PerformanceEvent (final java.lang.String managed_object_class, 
                           final java.lang.String observed_object_instance, 
                           final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.EventCategory event_category, 
                           final java.lang.String event_group_id, 
                           final java.lang.String[] attribute_name, 
                           final java.lang.String[] attribute_value, 
                           final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SuspectFlag[] suspect_flag, 
                           final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.TimeBase.UtcT event_time, 
                           final java.lang.String[] additional_info_name, 
                           final java.lang.String[] additional_info_value) {
    this.managed_object_class = managed_object_class;
    this.observed_object_instance = observed_object_instance;
    this.event_category = event_category;
    this.event_group_id = event_group_id;
    this.attribute_name = attribute_name;
    this.attribute_value = attribute_value;
    this.suspect_flag = suspect_flag;
    this.event_time = event_time;
    this.additional_info_name = additional_info_name;
    this.additional_info_value = additional_info_value;
  }

  private transient java.util.Hashtable _printMap = null;
  public java.lang.String toString() {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("struct com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEvent {");
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
    _ret.append("java.lang.String managed_object_class=");
    _ret.append(managed_object_class != null?'\"' + managed_object_class + '\"':null);
    _ret.append(",\n");
    _ret.append("java.lang.String observed_object_instance=");
    _ret.append(observed_object_instance != null?'\"' + observed_object_instance + '\"':null);
    _ret.append(",\n");
    _ret.append("com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.EventCategory event_category=");
    _ret.append(event_category);
    _ret.append(",\n");
    _ret.append("java.lang.String event_group_id=");
    _ret.append(event_group_id != null?'\"' + event_group_id + '\"':null);
    _ret.append(",\n");
    _ret.append("java.lang.String[] attribute_name=");
    _ret.append("{");
    if (attribute_name == null) {
      _ret.append(attribute_name);
    } else {
      for (int $counter50 = 0; $counter50 < attribute_name.length; $counter50++) {
        _ret.append(attribute_name[$counter50] != null?'\"' + attribute_name[$counter50] + '\"':null);
        if ($counter50 < attribute_name.length - 1) {
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
      for (int $counter51 = 0; $counter51 < attribute_value.length; $counter51++) {
        _ret.append(attribute_value[$counter51] != null?'\"' + attribute_value[$counter51] + '\"':null);
        if ($counter51 < attribute_value.length - 1) {
          _ret.append(",");
        }
      }
    }
    _ret.append("}");
    _ret.append(",\n");
    _ret.append("com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SuspectFlag[] suspect_flag=");
    _ret.append("{");
    if (suspect_flag == null) {
      _ret.append(suspect_flag);
    } else {
      for (int $counter52 = 0; $counter52 < suspect_flag.length; $counter52++) {
        _ret.append(suspect_flag[$counter52]);
        if ($counter52 < suspect_flag.length - 1) {
          _ret.append(",");
        }
      }
    }
    _ret.append("}");
    _ret.append(",\n");
    _ret.append("com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.TimeBase.UtcT event_time=");
    _ret.append(event_time);
    _ret.append(",\n");
    _ret.append("java.lang.String[] additional_info_name=");
    _ret.append("{");
    if (additional_info_name == null) {
      _ret.append(additional_info_name);
    } else {
      for (int $counter53 = 0; $counter53 < additional_info_name.length; $counter53++) {
        _ret.append(additional_info_name[$counter53] != null?'\"' + additional_info_name[$counter53] + '\"':null);
        if ($counter53 < additional_info_name.length - 1) {
          _ret.append(",");
        }
      }
    }
    _ret.append("}");
    _ret.append(",\n");
    _ret.append("java.lang.String[] additional_info_value=");
    _ret.append("{");
    if (additional_info_value == null) {
      _ret.append(additional_info_value);
    } else {
      for (int $counter54 = 0; $counter54 < additional_info_value.length; $counter54++) {
        _ret.append(additional_info_value[$counter54] != null?'\"' + additional_info_value[$counter54] + '\"':null);
        if ($counter54 < additional_info_value.length - 1) {
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
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEvent) {
      _cmpMap.put(_currentThread, o);
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEvent obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEvent)o;
      boolean res = true;
      do {
        res = this.managed_object_class == obj.managed_object_class ||
         (this.managed_object_class != null && obj.managed_object_class != null && this.managed_object_class.equals(obj.managed_object_class));
        if (!res) break;
        res = this.observed_object_instance == obj.observed_object_instance ||
         (this.observed_object_instance != null && obj.observed_object_instance != null && this.observed_object_instance.equals(obj.observed_object_instance));
        if (!res) break;
        res = this.event_category == obj.event_category ||
         (this.event_category != null && obj.event_category != null && this.event_category.equals(obj.event_category));
        if (!res) break;
        res = this.event_group_id == obj.event_group_id ||
         (this.event_group_id != null && obj.event_group_id != null && this.event_group_id.equals(obj.event_group_id));
        if (!res) break;
        if (res = (this.attribute_name.length == obj.attribute_name.length)) {
          for (int $counter55 = 0; res && $counter55 < this.attribute_name.length; $counter55++) {
            res = this.attribute_name[$counter55] == obj.attribute_name[$counter55] ||
             (this.attribute_name[$counter55] != null && obj.attribute_name[$counter55] != null && this.attribute_name[$counter55].equals(obj.attribute_name[$counter55]));
          }
        }
        if (!res) break;
        if (res = (this.attribute_value.length == obj.attribute_value.length)) {
          for (int $counter56 = 0; res && $counter56 < this.attribute_value.length; $counter56++) {
            res = this.attribute_value[$counter56] == obj.attribute_value[$counter56] ||
             (this.attribute_value[$counter56] != null && obj.attribute_value[$counter56] != null && this.attribute_value[$counter56].equals(obj.attribute_value[$counter56]));
          }
        }
        if (!res) break;
        if (res = (this.suspect_flag.length == obj.suspect_flag.length)) {
          for (int $counter57 = 0; res && $counter57 < this.suspect_flag.length; $counter57++) {
            res = this.suspect_flag[$counter57] == obj.suspect_flag[$counter57] ||
             (this.suspect_flag[$counter57] != null && obj.suspect_flag[$counter57] != null && this.suspect_flag[$counter57].equals(obj.suspect_flag[$counter57]));
          }
        }
        if (!res) break;
          res = this.event_time == obj.event_time ||
           (this.event_time != null && obj.event_time != null && this.event_time.equals(obj.event_time));
        if (!res) break;
        if (res = (this.additional_info_name.length == obj.additional_info_name.length)) {
          for (int $counter58 = 0; res && $counter58 < this.additional_info_name.length; $counter58++) {
            res = this.additional_info_name[$counter58] == obj.additional_info_name[$counter58] ||
             (this.additional_info_name[$counter58] != null && obj.additional_info_name[$counter58] != null && this.additional_info_name[$counter58].equals(obj.additional_info_name[$counter58]));
          }
        }
        if (!res) break;
        if (res = (this.additional_info_value.length == obj.additional_info_value.length)) {
          for (int $counter59 = 0; res && $counter59 < this.additional_info_value.length; $counter59++) {
            res = this.additional_info_value[$counter59] == obj.additional_info_value[$counter59] ||
             (this.additional_info_value[$counter59] != null && obj.additional_info_value[$counter59] != null && this.additional_info_value[$counter59].equals(obj.additional_info_value[$counter59]));
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
