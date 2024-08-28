package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::Schedule
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/Schedule:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct Schedule {
  ...
};
 * </pre>
 */
public final class Schedule implements org.omg.CORBA.portable.IDLEntity {
  
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcT start_time;
  
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcT end_time;
  
  public int[] repeated_intervals;

  public Schedule () {
  }

  public Schedule (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcT start_time, 
                   final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcT end_time, 
                   final int[] repeated_intervals) {
    this.start_time = start_time;
    this.end_time = end_time;
    this.repeated_intervals = repeated_intervals;
  }

  private transient java.util.Hashtable _printMap = null;
  public java.lang.String toString() {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("struct com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.Schedule {");
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
    _ret.append("com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcT start_time=");
    _ret.append(start_time);
    _ret.append(",\n");
    _ret.append("com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcT end_time=");
    _ret.append(end_time);
    _ret.append(",\n");
    _ret.append("int[] repeated_intervals=");
    _ret.append("{");
    if (repeated_intervals == null) {
      _ret.append(repeated_intervals);
    } else {
      for (int $counter70 = 0; $counter70 < repeated_intervals.length; $counter70++) {
        _ret.append(repeated_intervals[$counter70]);
        if ($counter70 < repeated_intervals.length - 1) {
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
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.Schedule) {
      _cmpMap.put(_currentThread, o);
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.Schedule obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.Schedule)o;
      boolean res = true;
      do {
          res = this.start_time == obj.start_time ||
           (this.start_time != null && obj.start_time != null && this.start_time.equals(obj.start_time));
        if (!res) break;
          res = this.end_time == obj.end_time ||
           (this.end_time != null && obj.end_time != null && this.end_time.equals(obj.end_time));
        if (!res) break;
          if (res = (this.repeated_intervals.length == obj.repeated_intervals.length)) {
            for (int $counter71 = 0; res && $counter71 < this.repeated_intervals.length; $counter71++) {
                res = this.repeated_intervals[$counter71] == obj.repeated_intervals[$counter71];
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
