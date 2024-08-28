package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::PerformanceMonitoringReport
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/PerformanceMonitoringReport:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct PerformanceMonitoringReport {
  ...
};
 * </pre>
 */
public final class PerformanceMonitoringReport implements org.omg.CORBA.portable.IDLEntity {
  
  public int performance_monitoring_id;
  
  public int sequence_number;
  
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcT scan_initiation_time;
  
  public int granularity_period;
  
  public java.lang.String[] instance_list;
  
  public java.lang.String[] attribute_list;
  
  public int[] observed_values;
  
  public int[] time_stamp;
  
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.SuspectFlag[] suspect_flag;

  public PerformanceMonitoringReport () {
  }

  public PerformanceMonitoringReport (final int performance_monitoring_id, 
                                      final int sequence_number, 
                                      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcT scan_initiation_time, 
                                      final int granularity_period, 
                                      final java.lang.String[] instance_list, 
                                      final java.lang.String[] attribute_list, 
                                      final int[] observed_values, 
                                      final int[] time_stamp, 
                                      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.SuspectFlag[] suspect_flag) {
    this.performance_monitoring_id = performance_monitoring_id;
    this.sequence_number = sequence_number;
    this.scan_initiation_time = scan_initiation_time;
    this.granularity_period = granularity_period;
    this.instance_list = instance_list;
    this.attribute_list = attribute_list;
    this.observed_values = observed_values;
    this.time_stamp = time_stamp;
    this.suspect_flag = suspect_flag;
  }

  private transient java.util.Hashtable _printMap = null;
  public java.lang.String toString() {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("struct com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReport {");
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
    _ret.append("int performance_monitoring_id=");
    _ret.append(performance_monitoring_id);
    _ret.append(",\n");
    _ret.append("int sequence_number=");
    _ret.append(sequence_number);
    _ret.append(",\n");
    _ret.append("com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcT scan_initiation_time=");
    _ret.append(scan_initiation_time);
    _ret.append(",\n");
    _ret.append("int granularity_period=");
    _ret.append(granularity_period);
    _ret.append(",\n");
    _ret.append("java.lang.String[] instance_list=");
    _ret.append("{");
    if (instance_list == null) {
      _ret.append(instance_list);
    } else {
      for (int $counter25 = 0; $counter25 < instance_list.length; $counter25++) {
        _ret.append(instance_list[$counter25] != null?'\"' + instance_list[$counter25] + '\"':null);
        if ($counter25 < instance_list.length - 1) {
          _ret.append(",");
        }
      }
    }
    _ret.append("}");
    _ret.append(",\n");
    _ret.append("java.lang.String[] attribute_list=");
    _ret.append("{");
    if (attribute_list == null) {
      _ret.append(attribute_list);
    } else {
      for (int $counter26 = 0; $counter26 < attribute_list.length; $counter26++) {
        _ret.append(attribute_list[$counter26] != null?'\"' + attribute_list[$counter26] + '\"':null);
        if ($counter26 < attribute_list.length - 1) {
          _ret.append(",");
        }
      }
    }
    _ret.append("}");
    _ret.append(",\n");
    _ret.append("int[] observed_values=");
    _ret.append("{");
    if (observed_values == null) {
      _ret.append(observed_values);
    } else {
      for (int $counter27 = 0; $counter27 < observed_values.length; $counter27++) {
        _ret.append(observed_values[$counter27]);
        if ($counter27 < observed_values.length - 1) {
          _ret.append(",");
        }
      }
    }
    _ret.append("}");
    _ret.append(",\n");
    _ret.append("int[] time_stamp=");
    _ret.append("{");
    if (time_stamp == null) {
      _ret.append(time_stamp);
    } else {
      for (int $counter28 = 0; $counter28 < time_stamp.length; $counter28++) {
        _ret.append(time_stamp[$counter28]);
        if ($counter28 < time_stamp.length - 1) {
          _ret.append(",");
        }
      }
    }
    _ret.append("}");
    _ret.append(",\n");
    _ret.append("com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.SuspectFlag[] suspect_flag=");
    _ret.append("{");
    if (suspect_flag == null) {
      _ret.append(suspect_flag);
    } else {
      for (int $counter29 = 0; $counter29 < suspect_flag.length; $counter29++) {
        _ret.append(suspect_flag[$counter29]);
        if ($counter29 < suspect_flag.length - 1) {
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
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReport) {
      _cmpMap.put(_currentThread, o);
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReport obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReport)o;
      boolean res = true;
      do {
          res = this.performance_monitoring_id == obj.performance_monitoring_id;
        if (!res) break;
        res = this.sequence_number == obj.sequence_number;
        if (!res) break;
          res = this.scan_initiation_time == obj.scan_initiation_time ||
           (this.scan_initiation_time != null && obj.scan_initiation_time != null && this.scan_initiation_time.equals(obj.scan_initiation_time));
        if (!res) break;
          res = this.granularity_period == obj.granularity_period;
        if (!res) break;
          if (res = (this.instance_list.length == obj.instance_list.length)) {
            for (int $counter30 = 0; res && $counter30 < this.instance_list.length; $counter30++) {
              res = this.instance_list[$counter30] == obj.instance_list[$counter30] ||
               (this.instance_list[$counter30] != null && obj.instance_list[$counter30] != null && this.instance_list[$counter30].equals(obj.instance_list[$counter30]));
            }
          }
        if (!res) break;
          if (res = (this.attribute_list.length == obj.attribute_list.length)) {
            for (int $counter31 = 0; res && $counter31 < this.attribute_list.length; $counter31++) {
              res = this.attribute_list[$counter31] == obj.attribute_list[$counter31] ||
               (this.attribute_list[$counter31] != null && obj.attribute_list[$counter31] != null && this.attribute_list[$counter31].equals(obj.attribute_list[$counter31]));
            }
          }
        if (!res) break;
        if (res = (this.observed_values.length == obj.observed_values.length)) {
          for (int $counter32 = 0; res && $counter32 < this.observed_values.length; $counter32++) {
            res = this.observed_values[$counter32] == obj.observed_values[$counter32];
          }
        }
        if (!res) break;
        if (res = (this.time_stamp.length == obj.time_stamp.length)) {
          for (int $counter33 = 0; res && $counter33 < this.time_stamp.length; $counter33++) {
              res = this.time_stamp[$counter33] == obj.time_stamp[$counter33];
          }
        }
        if (!res) break;
        if (res = (this.suspect_flag.length == obj.suspect_flag.length)) {
          for (int $counter34 = 0; res && $counter34 < this.suspect_flag.length; $counter34++) {
            res = this.suspect_flag[$counter34] == obj.suspect_flag[$counter34] ||
             (this.suspect_flag[$counter34] != null && obj.suspect_flag[$counter34] != null && this.suspect_flag[$counter34].equals(obj.suspect_flag[$counter34]));
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
